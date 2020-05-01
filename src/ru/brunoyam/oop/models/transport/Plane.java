package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

public class Plane extends Transport {

    private PlaneCabin type;
    private final Passenger[] passengers;

    public Plane(PlaneCabin type) {
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

    public static void addPassenger(Plane plane, Passenger passenger) {
        if (plane.placePassenger(passenger)) {
            System.out.println("Билет продан");
        } else {
            System.out.println("В этой секции самолета нет свободных мест");
        }
    }

    @Override
    public String toString() {
        return "Plane {" + " ComfortClass=" + type.name() +
                ", PlaneCabinSeatNumber=" + type.getSeatsNumber() + '\'' +
                ", cost=" + type.getCost() +
                ", passengers=" + Arrays.toString(passengers) +
                '}';
    }

}
