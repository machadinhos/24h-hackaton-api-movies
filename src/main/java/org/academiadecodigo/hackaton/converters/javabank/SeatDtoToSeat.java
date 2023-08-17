package org.academiadecodigo.hackaton.converters.javabank;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import org.academiadecodigo.hackaton.command.MovieDto;
import org.academiadecodigo.hackaton.persistence.model.Movie;
import org.academiadecodigo.hackaton.persistence.model.Seat;

public class SeatDtoToSeat implements Converter<SeatDtoToSeat, Seat> {

    @Override
    public Seat convert (SeatDtoToSeat seatDto) {

        return null;
    }


    @Override
    public JavaType getInputType (TypeFactory typeFactory) {

        return null;
    }


    @Override
    public JavaType getOutputType (TypeFactory typeFactory) {

        return null;
    }

}
