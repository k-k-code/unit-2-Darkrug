package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;


public class Bus extends Transport {

    private BusType type;
    private final Passenger[] passengers;

    public Bus(BusType type) {
        this.type = type;
        passengers = new Passenger[type.getSeatsNumber()];
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

    public static void addPassenger(Bus bus, Passenger passenger) {
        if (bus.placePassenger(passenger)) {
            System.out.println("Билет продан");
        } else {
            System.out.println("В этом автобусе нет свободных мест");
        }
    }


    @Override
    public String toString() {
        return "Bus {" + " BusType=" + type.name() +
                ", BusSeatNumber=" + type.getSeatsNumber() + '\'' +
                ", passengers=" + Arrays.toString(passengers) +
                ", cost=" + type.getCost() +
                '}';
    }

}
