package ru.brunoyam.oop.models.transport;

public class Compartment {

    private byte compartmentSeatNumber;
    private String compartmentComfortClass;

    public byte getCompartmentSeatNumber() {
        return compartmentSeatNumber;
    }

    public void setCompartmentSeatNumber(byte compartmentSeatNumber) {
        this.compartmentSeatNumber = compartmentSeatNumber;
    }

    public String getCompartmentComfortClass() {
        return compartmentComfortClass;
    }

    public void setCompartmentComfortClass(String compartmentComfortClass) {
        this.compartmentComfortClass = compartmentComfortClass;
    }
}
