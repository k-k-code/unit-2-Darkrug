package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

public class Ship extends Transport {

    private ShipType type;
    private Cabin[] cabins;


    public Ship(ShipType type) {
        this.type = type;
        int cabinsNumber = type.getComfortCabinsNumber()
                + type.getStandardCabinsNumber()
                + type.getEconomyCabinsNumber();

        cabins = new Cabin[cabinsNumber];

        int i = 0;
        while (i < type.getEconomyCabinsNumber()) {
            cabins[i] = new Cabin(CabinType.ECONOMY);
            i++;
        }
        while (i < type.getEconomyCabinsNumber() + type.getStandardCabinsNumber()) {
            cabins[i] = new Cabin(CabinType.STANDARD);
            i++;
        }
        while (i < cabinsNumber) {
            cabins[i] = new Cabin(CabinType.COMFORT);
            i++;
        }
    }

    public boolean isPlace(CabinType cabinType, Passenger passenger) {
        for (Cabin cabin : cabins) {
            if (cabin.getType() == cabinType
                    && cabin.placePassenger(passenger)) {
                return true;
            }
        }
        return false;
    }

    public static void addPassenger(Ship ship, CabinType cabinType, Passenger passenger) {
        if (ship.isPlace(cabinType, passenger)) {
            System.out.println("Билет продан" + "( " + cabinType + " )");
        } else {
            System.out.println("На корабле нет свободных мест класса " + cabinType);
        }
    }


    @Override
    public String toString() {

        return "Ship {" + " ShipType = " + type.name() + ", " + Arrays.toString(cabins) +
                '}';
    }
}
