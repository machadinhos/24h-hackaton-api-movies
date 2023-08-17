package org.academiadecodigo.hackaton.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "seat")
public class Seat extends AbstractModel {

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
