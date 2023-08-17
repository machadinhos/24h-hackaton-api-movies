package org.academiadecodigo.hackaton.converters.javabank;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import org.academiadecodigo.hackaton.command.MovieDto;
import org.academiadecodigo.hackaton.persistence.model.Movie;
import org.academiadecodigo.hackaton.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieDtoToMovie implements Converter<MovieDto, Movie> {

    private MovieService movieService;


    @Autowired
    public void setMovieService (MovieService movieService) {

        this.movieService = movieService;
    }


    @Override
    public Movie convert (MovieDto movieDto) {

        Movie movie = (movieDto.getId() != null ? movieService.get(movieDto.getId()) : new Movie());

        movie.setTitle(movieDto.getTitle());
        movie.setDescription(movieDto.getDescription());
        movie.setGenre(movieDto.getGenre());
        movie.setDirector(movieDto.getDirector());
        movie.setActors(movieDto.getActors());
        movie.setDuration(movieDto.getDuration());

        return movie;
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
