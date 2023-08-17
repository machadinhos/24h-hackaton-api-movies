package org.academiadecodigo.hackaton.persistence.dao;

import org.academiadecodigo.hackaton.persistence.model.Model;

import java.util.List;

public interface Dao<T extends Model> {

    List<T> findAll ();

    T findById (Integer id);

    T saveOrUpdate (T modelObject);

}
