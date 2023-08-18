package org.academiadecodigo.hackaton.controller.rest;

import org.academiadecodigo.hackaton.command.SeatDto;
import org.academiadecodigo.hackaton.command.SessionDto;
import org.academiadecodigo.hackaton.converters.SeatToSeatDto;
import org.academiadecodigo.hackaton.converters.SessionToSessionDto;
import org.academiadecodigo.hackaton.persistence.model.Session;
import org.academiadecodigo.hackaton.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/session")
public class RestSessionController {

    private SessionService sessionService;
    private SessionToSessionDto sessionToSessionDto;
    private SeatToSeatDto seatToSeatDto;


    @Autowired
    public void setSessionService (SessionService sessionService) {

        this.sessionService = sessionService;
    }


    @Autowired
    public void setSessionToSessionDto (SessionToSessionDto sessionToSessionDto) {

        this.sessionToSessionDto = sessionToSessionDto;
    }


    @Autowired
    public void setSeatToSeatDto (SeatToSeatDto seatToSeatDto) {

        this.seatToSeatDto = seatToSeatDto;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<SessionDto> showSession (@PathVariable Integer id) {

        Session session = sessionService.get(id);

        if (session == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(sessionToSessionDto.convert(session), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{id}/seats")
    public ResponseEntity<List<SeatDto>> showSessionSeats (@PathVariable Integer id) {

        Session session = sessionService.get(id);

        if (session == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(seatToSeatDto.convert(session.getSeats()), HttpStatus.OK);
    }

}
