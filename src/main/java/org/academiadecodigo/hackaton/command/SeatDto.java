package org.academiadecodigo.hackaton.command;

public class SeatDto {

    private Integer id;
    private boolean isAvailable;
    private int seatNumber;


    public Integer getId () {

        return id;
    }


    public void setId (Integer id) {

        this.id = id;
    }


    public boolean isAvailable () {

        return isAvailable;
    }


    public void setAvailable (boolean available) {

        isAvailable = available;
    }


    public int getSeatNumber () {

        return seatNumber;
    }


    public void setSeatNumber (int seatNumber) {

        this.seatNumber = seatNumber;
    }

}
