package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

public class Compartment {

    private final CompartmentType type;
    private final Passenger[] passengers;

    public Compartment(CompartmentType type) {
        this.type = type;
        passengers = new Passenger[type.getSeatsNumber()];
    }

    public CompartmentType getType() {
        return type;
    }

    public boolean placePassenger(Passenger passenger) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i] == null) {
                passengers[i] = passenger;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Compartment{" +
                "compartmentSeatNumber=" + type.getSeatsNumber() +
                ", compartmentComfortClass='" + type.name() + '\'' +
                ", passengers=" + Arrays.toString(passengers) +
                ", cost=" + type.getCost() +
                '}';
    }

}
