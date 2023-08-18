package org.academiadecodigo.hackaton.persistence.model;

import javax.persistence.*;


@MappedSuperclass
public abstract class AbstractModel implements Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Version
    private Integer version;


    @Override
    public Integer getId () {

        return id;
    }


    @Override
    public void setId (Integer id) {

        this.id = id;
    }


    public Integer getVersion () {

        return version;
    }


    public void setVersion (Integer version) {

        this.version = version;
    }

}
