package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

public class Ship extends Transport {

    private Cabin[] cabins = new Cabin[10];

    private Passenger[] passengers = new Passenger[10];

    public Cabin[] getCabins() {
        return cabins;
    }

    public void setCabins(Cabin[] cabins) {
        this.cabins = cabins;
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

        return "Ship {" +
                "Passengers: " + passengerList +
                '}';
    }
}
