package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

public class Train extends Transport {

    private Compartment[] compartments = new Compartment[10];

    private Passenger[] passengers = new Passenger[10];

    public Compartment[] getCompartments() {
        return compartments;
    }

    public void setCompartments(Compartment[] compartments) {
        this.compartments = compartments;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {

        String passengerList = "";
        getPassengers();
        for (Passenger value : passengers) {
            passengerList = passengerList + value.getFullName() + "; ";
        }

        return "Train {" +
                "Passengers:" + passengerList +
                '}';
    }
}
