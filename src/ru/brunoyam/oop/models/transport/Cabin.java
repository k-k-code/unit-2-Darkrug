package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

public class Cabin {

    private final CabinType type;
    private final Passenger[] passengers;

    public Cabin(CabinType type) {
        this.type = type;
        passengers = new Passenger[type.getSeatsNumber()];
    }

    public CabinType getType() {
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
        return "Cabin{" +
                "cabinSeatNumber=" + type.getSeatsNumber() +
                ", cabinComfortClass='" + type.name() + '\'' +
                ", passengers=" + Arrays.toString(passengers) +
                ", cost=" + type.getCost() +
                '}';
    }
}
