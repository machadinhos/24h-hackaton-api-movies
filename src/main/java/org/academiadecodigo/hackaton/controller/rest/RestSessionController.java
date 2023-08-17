package org.academiadecodigo.hackaton.controller.rest;

import org.academiadecodigo.hackaton.command.SessionDto;
import org.academiadecodigo.hackaton.converters.SessionToSessionDto;
import org.academiadecodigo.hackaton.persistence.model.Session;
import org.academiadecodigo.hackaton.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/session")
public class RestSessionController {

    private SessionService sessionService;
    private SessionToSessionDto sessionToSessionDto;


    @Autowired
    public void setSessionService (SessionService sessionService) {

        this.sessionService = sessionService;
    }


    @Autowired
    public void setSessionToSessionDto (SessionToSessionDto sessionToSessionDto) {

        this.sessionToSessionDto = sessionToSessionDto;
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<SessionDto> showSession (@PathVariable Integer id) {

        Session session = sessionService.get(id);

        if (session == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(sessionToSessionDto.convert(session), HttpStatus.OK);
    }

}
