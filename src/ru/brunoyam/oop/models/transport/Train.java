package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

public class Train extends Transport {

    private TrainType type;
    private Compartment[] compartments;

    public Train(TrainType type) {
        this.type = type;
        int compartmentsNumber = type.getComfortCompartmentsNumber()
                + type.getStandardCompartmentsNumber()
                + type.getEconomyCompartmentsNumber();

        compartments = new Compartment[compartmentsNumber];

        int i = 0;
        while (i < type.getEconomyCompartmentsNumber()) {
            compartments[i] = new Compartment(CompartmentType.ECONOMY);
            i++;
        }
        while (i < type.getEconomyCompartmentsNumber() + type.getStandardCompartmentsNumber()) {
            compartments[i] = new Compartment(CompartmentType.STANDARD);
            i++;
        }
        while (i < compartmentsNumber) {
            compartments[i] = new Compartment(CompartmentType.COMFORT);
            i++;
        }
    }

    public boolean isPlace(CompartmentType compartmentType, Passenger passenger) {
        for (Compartment compartment : compartments) {
            if (compartment.getType() == compartmentType
                    && compartment.placePassenger(passenger)) {
                return true;
            }
        }
        return false;
    }

    public static void addPassenger(Train train, CompartmentType compartmentType, Passenger passenger) {
        if (train.isPlace(compartmentType, passenger)) {
            System.out.println("Билет продан" + "( " + compartmentType + " )");
        } else {
            System.out.println("На корабле нет свободных мест класса " + compartmentType);
        }
    }


    @Override
    public String toString() {

        return "Train {" + " TrainType = " + type.name() + ", " + Arrays.toString(compartments) +
                '}';
    }

}
