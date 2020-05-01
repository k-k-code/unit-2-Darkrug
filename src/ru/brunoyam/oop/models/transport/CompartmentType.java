package ru.brunoyam.oop.models.transport;

public enum CompartmentType {

    COMFORT(2, 4000000),
    STANDARD(4, 2000000),
    ECONOMY(6, 500000);

    private int seatsNumber;
    private long cost;

    CompartmentType(int seatsNumber, long cost) {
        this.seatsNumber = seatsNumber;
        this.cost = cost;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public long getCost() {
        return cost;
    }
}
