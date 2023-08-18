package org.academiadecodigo.hackaton.persistence.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "seat")
public class Seat extends AbstractModel {

    private boolean isAvailable;
    private int seatNumber;

    @ManyToOne
    private Session session;


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


    public Session getSession () {

        return session;
    }


    public void setSession (Session session) {

        this.session = session;
    }

}
