package org.academiadecodigo.hackaton.converters.javabank;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import org.academiadecodigo.hackaton.persistence.model.Seat;

public class SeatToSeatDto implements Converter<SeatToSeatDto, Seat> {

    @Override
    public Seat convert (SeatToSeatDto seatToSeatDto) {

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
