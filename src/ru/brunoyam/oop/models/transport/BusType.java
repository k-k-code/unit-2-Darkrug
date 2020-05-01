package ru.brunoyam.oop.models.transport;

public enum BusType {

    CITY(false, 2, 35, 200000),
    SUBURBAN(false, 3, 45, 400000),
    INTERCITY(true, 4, 60, 1000000);

    private boolean hastoilet;
    private int stopsNumber;
    private int seatsNumber;
    private int cost;

    BusType(boolean hastoilet, int stopsNumber, int seatsNumber, int cost) {
        this.hastoilet = hastoilet;
        this.stopsNumber = stopsNumber;
        this.seatsNumber = seatsNumber;
        this.cost = cost;
    }

    public boolean isHastoilet() {
        return hastoilet;
    }

    public int getStopsNumber() {
        return stopsNumber;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public int getCost() {
        return cost;
    }
}
