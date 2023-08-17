package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.model.Movie;
import org.academiadecodigo.hackaton.persistence.model.Session;

import java.util.List;

public interface MovieService {

    Movie get(Integer id);

    List<Movie> getAll();

    List<Session> getSessions(Integer id);

}
