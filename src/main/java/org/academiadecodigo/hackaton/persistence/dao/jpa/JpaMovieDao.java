package org.academiadecodigo.hackaton.persistence.dao.jpa;

import org.academiadecodigo.hackaton.persistence.dao.MovieDao;
import org.academiadecodigo.hackaton.persistence.model.Movie;

public class JpaMovieDao extends GenericJpaDao<Movie> implements MovieDao {

    public JpaMovieDao () {

        super(Movie.class);
    }

}
