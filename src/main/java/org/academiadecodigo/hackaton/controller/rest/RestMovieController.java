package org.academiadecodigo.hackaton.controller.rest;

import org.academiadecodigo.hackaton.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/movie")
public class RestMovieController {

    private MovieService movieService;


    @Autowired
    public void setMovieService (MovieService movieService) {

        this.movieService = movieService;
    }

}
