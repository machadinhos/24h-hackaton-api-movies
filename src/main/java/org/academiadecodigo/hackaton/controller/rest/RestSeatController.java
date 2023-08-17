package org.academiadecodigo.hackaton.controller.rest;

import org.academiadecodigo.hackaton.command.SeatDto;
import org.academiadecodigo.hackaton.converters.SeatToSeatDto;
import org.academiadecodigo.hackaton.persistence.model.Seat;
import org.academiadecodigo.hackaton.services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/seat")
public class RestSeatController {

    private SeatService seatService;
    private SeatToSeatDto seatToSeatDto;


    @Autowired
    public void setSeatService (SeatService seatService) {

        this.seatService = seatService;
    }


    @Autowired
    public void setSeatToSeatDto (SeatToSeatDto seatToSeatDto) {

        this.seatToSeatDto = seatToSeatDto;
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<SeatDto> showMovie (@PathVariable Integer id) {

        Seat seat = seatService.get(id);

        if (seat == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(seatToSeatDto.convert(seat), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.PUT, path = "/{id}")
    public ResponseEntity<SeatDto> setOccupied (@PathVariable Integer id) {

        Seat seat = seatService.get(id);

        if (seat == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        seatService.setOccupied(id);

        return new ResponseEntity<>(seatToSeatDto.convert(seat), HttpStatus.OK);
    }

}
