package org.academiadecodigo.hackaton.command;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.academiadecodigo.hackaton.persistence.model.Movie;
import org.academiadecodigo.hackaton.persistence.model.Room;
import org.academiadecodigo.hackaton.persistence.model.Seat;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SessionDto {

    private Integer id;
    private Room room;
    private List<Seat> seats;
    private Movie movie;
    private boolean isAvailable;
    private int minute;
    private int hour;
    private int day;
    private int month;
    private int year;


    public Integer getId () {

        return id;
    }


    public void setId (Integer id) {

        this.id = id;
    }


    public Room getRoom () {

        return room;
    }


    public void setRoom (Room room) {

        this.room = room;
    }


    public List<Seat> getSeats () {

        return seats;
    }


    public void setSeats (List<Seat> seats) {

        this.seats = seats;
    }


    public Movie getMovie () {

        return movie;
    }


    public void setMovie (Movie movie) {

        this.movie = movie;
    }


    public boolean isAvailable () {

        return isAvailable;
    }


    public void setAvailable (boolean available) {

        isAvailable = available;
    }


    public int getMinute () {

        return minute;
    }


    public void setMinute (int minute) {

        this.minute = minute;
    }


    public int getHour () {

        return hour;
    }


    public void setHour (int hour) {

        this.hour = hour;
    }


    public int getDay () {

        return day;
    }


    public void setDay (int day) {

        this.day = day;
    }


    public int getMonth () {

        return month;
    }


    public void setMonth (int month) {

        this.month = month;
    }


    public int getYear () {

        return year;
    }


    public void setYear (int year) {

        this.year = year;
    }

}
