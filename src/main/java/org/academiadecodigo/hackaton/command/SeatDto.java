package org.academiadecodigo.hackaton.command;

public class SeatDto {

    private boolean isAvailable;
    private int seatNumber;


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
