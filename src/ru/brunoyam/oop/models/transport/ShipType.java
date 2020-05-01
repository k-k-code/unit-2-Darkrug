package ru.brunoyam.oop.models.transport;

public enum ShipType {

    FERRY(0, 30, 50),
    CRUISE(30, 60, 120),
    YACHT(4, 4, 0);

    private int comfortCabinsNumber;

    private int standardCabinsNumber;

    private int economyCabinsNumber;


    ShipType(int comfortCabinsNumber, int standardCabinsNumber, int economyCabinsNumber) {
        this.comfortCabinsNumber = comfortCabinsNumber;
        this.standardCabinsNumber = standardCabinsNumber;
        this.economyCabinsNumber = economyCabinsNumber;
    }


    public int getComfortCabinsNumber() {
        return comfortCabinsNumber;
    }

    public int getStandardCabinsNumber() {
        return standardCabinsNumber;
    }

    public int getEconomyCabinsNumber() {
        return economyCabinsNumber;
    }

}
