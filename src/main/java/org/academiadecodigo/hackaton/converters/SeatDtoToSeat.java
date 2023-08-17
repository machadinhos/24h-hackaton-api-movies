package org.academiadecodigo.hackaton.converters;

import org.academiadecodigo.hackaton.command.SeatDto;
import org.academiadecodigo.hackaton.persistence.model.Seat;
import org.academiadecodigo.hackaton.services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeatDtoToSeat {

    private SeatService seatService;


    @Autowired
    public void setSeatService (SeatService seatService) {

        this.seatService = seatService;
    }


    public Seat convert (SeatDto seatDto) {

        Seat seat = (seatDto.getId() != null ? seatService.get(seatDto.getId()) : new Seat());

        seat.setId(seatDto.getId());
        seat.setAvailable(seatDto.isAvailable());
        seat.setSeatNumber(seatDto.getSeatNumber());

        return seat;
    }

}
