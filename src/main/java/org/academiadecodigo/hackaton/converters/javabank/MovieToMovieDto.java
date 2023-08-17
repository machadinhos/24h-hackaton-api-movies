package org.academiadecodigo.hackaton.converters.javabank;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import org.academiadecodigo.hackaton.persistence.model.Movie;
import org.academiadecodigo.hackaton.persistence.model.Seat;

public class MovieToMovieDto implements Converter<MovieToMovieDto, Movie> {

    @Override
    public Movie convert (MovieToMovieDto movieToMovieDto) {

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
