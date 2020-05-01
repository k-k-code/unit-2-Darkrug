package ru.brunoyam.oop.models.transport;

public enum TrainType {

    PASSENGER_TRAIN(10, 20, 30),
    SPEED_TRAIN(30, 40, 0);

    private int comfortCompartmentsNumber;

    private int standardCompartmentsNumber;

    private int economyCompartmentsNumber;

    TrainType(int comfortCompartmentsNumber, int standardCompartmentsNumber, int economyCompartmentsNumber) {
        this.comfortCompartmentsNumber = comfortCompartmentsNumber;
        this.standardCompartmentsNumber = standardCompartmentsNumber;
        this.economyCompartmentsNumber = economyCompartmentsNumber;
    }

    public int getComfortCompartmentsNumber() {
        return comfortCompartmentsNumber;
    }

    public int getStandardCompartmentsNumber() {
        return standardCompartmentsNumber;
    }

    public int getEconomyCompartmentsNumber() {
        return economyCompartmentsNumber;
    }
}
