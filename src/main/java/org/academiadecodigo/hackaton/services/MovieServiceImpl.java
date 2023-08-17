package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.dao.MovieDao;
import org.academiadecodigo.hackaton.persistence.model.Movie;
import org.academiadecodigo.hackaton.persistence.model.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieDao movieDao;


    @Autowired
    public void setMovieDao (MovieDao movieDao) {

        this.movieDao = movieDao;
    }


    @Transactional(readOnly = true)
    @Override
    public Movie get (Integer id) {

        return movieDao.findById(id);
    }


    @Transactional(readOnly = true)
    @Override
    public List<Movie> getAll () {

        return movieDao.findAll();
    }


    @Transactional(readOnly = true)
    @Override
    public List<Session> getSessions (Integer id) {

        return movieDao.findById(id).getSessions();
    }

}
