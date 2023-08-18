package org.academiadecodigo.hackaton.controller.rest;

import org.academiadecodigo.hackaton.command.MovieDto;
import org.academiadecodigo.hackaton.command.SessionDto;
import org.academiadecodigo.hackaton.converters.MovieToMovieDto;
import org.academiadecodigo.hackaton.converters.SessionToSessionDto;
import org.academiadecodigo.hackaton.persistence.model.Movie;
import org.academiadecodigo.hackaton.services.MovieService;
import org.academiadecodigo.hackaton.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/movie")
public class RestMovieController {

    private MovieService movieService;
    private SessionService sessionService;
    private MovieToMovieDto movieToMovieDto;
    private SessionToSessionDto sessionToSessionDto;


    @Autowired
    public void setMovieService (MovieService movieService) {

        this.movieService = movieService;
    }


    @Autowired
    public void setSessionService (SessionService sessionService) {

        this.sessionService = sessionService;
    }


    @Autowired
    public void setMovieToMovieDto (MovieToMovieDto movieToMovieDto) {

        this.movieToMovieDto = movieToMovieDto;
    }


    @Autowired
    public void setSessionToSessionDto (SessionToSessionDto sessionToSessionDto) {

        this.sessionToSessionDto = sessionToSessionDto;
    }


    @RequestMapping(method = RequestMethod.GET, path = {"/", "", "/list"})
    public ResponseEntity<List<MovieDto>> listMovies () {

        List<MovieDto> movieDtos = movieToMovieDto.convert(movieService.getAll());

        return new ResponseEntity<>(movieDtos, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<MovieDto> showMovie (@PathVariable Integer id) {

        Movie movie = movieService.get(id);

        if (movie == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(movieToMovieDto.convert(movie), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{id}/sessions")
    public ResponseEntity<List<SessionDto>> listMovieSessions (@PathVariable Integer id) {

        Movie movie = movieService.get(id);

        if (movie == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        List<SessionDto> sessionDtos = sessionToSessionDto.convert(sessionService.getByMovieId(id));

        return new ResponseEntity<>(sessionDtos, HttpStatus.OK);
    }

}
