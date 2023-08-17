package org.academiadecodigo.hackaton.command;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.academiadecodigo.hackaton.persistence.model.Room;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SessionDto {

    private Integer id;
    private int roomNumber;
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


    public int getRoomNumber () {

        return roomNumber;
    }


    public void setRoomNumber (int roomNumber) {

        this.roomNumber = roomNumber;
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
