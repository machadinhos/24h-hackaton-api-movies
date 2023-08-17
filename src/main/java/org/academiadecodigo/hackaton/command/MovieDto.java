package org.academiadecodigo.hackaton.command;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.academiadecodigo.hackaton.persistence.model.Session;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MovieDto {

    private Integer id;
    private String title;
    private String description;
    private String genre;
    private String director;
    private String actors;
    private int duration;


    public Integer getId () {

        return id;
    }


    public void setId (Integer id) {

        this.id = id;
    }


    public String getTitle () {

        return title;
    }


    public void setTitle (String title) {

        this.title = title;
    }


    public String getDescription () {

        return description;
    }


    public void setDescription (String description) {

        this.description = description;
    }


    public String getGenre () {

        return genre;
    }


    public void setGenre (String genre) {

        this.genre = genre;
    }


    public String getDirector () {

        return director;
    }


    public void setDirector (String director) {

        this.director = director;
    }


    public String getActors () {

        return actors;
    }


    public void setActors (String actors) {

        this.actors = actors;
    }


    public int getDuration () {

        return duration;
    }


    public void setDuration (int duration) {

        this.duration = duration;
    }

}
