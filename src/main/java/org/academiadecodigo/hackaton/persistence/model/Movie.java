package org.academiadecodigo.hackaton.persistence.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movie")
public class Movie extends AbstractModel {

    private String title;
    private String description;
    private String genre;
    private String director;
    private String actors;
    private int duration;

    @OneToMany(
            cascade = {CascadeType.ALL},
            orphanRemoval = true,
            mappedBy = "movie",
            fetch = FetchType.EAGER
    )
    private List<Session> sessions;


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


    public List<Session> getSessions () {

        return sessions;
    }


    public void setSessions (List<Session> sessions) {

        this.sessions = sessions;
    }

}
