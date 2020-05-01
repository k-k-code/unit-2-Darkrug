package ru.brunoyam.oop.models.transport;

public enum PlaneCabin {

    ECONOMY(60, 400000, false),
    BUSINESS(20, 1500000, true),
    FIRST(12, 3000000, true);

    private int seatsNumber;
    private int cost;
    private boolean hasluggage;

    PlaneCabin(int seatsNumber, int cost, boolean hasluggage) {
        this.seatsNumber = seatsNumber;
        this.cost = cost;
        this.hasluggage = hasluggage;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public int getCost() {
        return cost;
    }

    public boolean isHasluggage() {
        return hasluggage;
    }
}
