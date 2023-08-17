package org.academiadecodigo.hackaton.persistence.dao.jpa;

import org.academiadecodigo.hackaton.persistence.dao.MovieDao;
import org.academiadecodigo.hackaton.persistence.model.Movie;
import org.springframework.stereotype.Repository;

@Repository
public class JpaMovieDao extends GenericJpaDao<Movie> implements MovieDao {

    public JpaMovieDao () {

        super(Movie.class);
    }

}
