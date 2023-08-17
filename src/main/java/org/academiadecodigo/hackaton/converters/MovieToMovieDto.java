package org.academiadecodigo.hackaton.converters;

import org.academiadecodigo.hackaton.command.MovieDto;
import org.academiadecodigo.hackaton.persistence.model.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieToMovieDto extends AbstractConverter<Movie, MovieDto> {

    @Override
    public MovieDto convert (Movie movie) {

        MovieDto movieDto = new MovieDto();

        movieDto.setId(movie.getId());
        movieDto.setTitle(movie.getTitle());
        movieDto.setDescription(movie.getDescription());
        movieDto.setGenre(movie.getGenre());
        movieDto.setDirector(movie.getDirector());
        movieDto.setActors(movie.getActors());
        movieDto.setDuration(movie.getDuration());

        return movieDto;
    }

}
