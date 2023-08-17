package org.academiadecodigo.hackaton.converters;

import org.academiadecodigo.hackaton.command.SeatDto;
import org.academiadecodigo.hackaton.persistence.model.Seat;
import org.springframework.stereotype.Component;

@Component
public class SeatToSeatDto extends AbstractConverter<Seat, SeatDto> {

    @Override
    public SeatDto convert (Seat seat) {

        SeatDto seatDto = new SeatDto();

        seatDto.setId(seat.getId());
        seatDto.setAvailable(seat.isAvailable());
        seatDto.setSeatNumber(seat.getSeatNumber());

        return seatDto;
    }

}
