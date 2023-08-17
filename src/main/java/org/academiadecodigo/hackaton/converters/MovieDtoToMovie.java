package org.academiadecodigo.hackaton.converters;

import org.academiadecodigo.hackaton.command.MovieDto;
import org.academiadecodigo.hackaton.persistence.model.Movie;
import org.academiadecodigo.hackaton.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieDtoToMovie {

    private MovieService movieService;


    @Autowired
    public void setMovieService (MovieService movieService) {

        this.movieService = movieService;
    }


    public Movie convert (MovieDto movieDto) {

        Movie movie = (movieDto.getId() != null ? movieService.get(movieDto.getId()) : new Movie());

        movie.setId(movieDto.getId());
        movie.setTitle(movieDto.getTitle());
        movie.setDescription(movieDto.getDescription());
        movie.setGenre(movieDto.getGenre());
        movie.setDirector(movieDto.getDirector());
        movie.setActors(movieDto.getActors());
        movie.setDuration(movieDto.getDuration());

        return movie;
    }
}
