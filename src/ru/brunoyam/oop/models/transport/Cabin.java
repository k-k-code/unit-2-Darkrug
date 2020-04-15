package ru.brunoyam.oop.models.transport;

public class Cabin {

    private byte cabinSeatNumber;
    private String cabinComfortClass;

    public byte getCabinSeatNumber() {
        return cabinSeatNumber;
    }

    public void setCabinSeatNumber(byte cabinSeatNumber) {
        this.cabinSeatNumber = cabinSeatNumber;
    }

    public String getCabinComfortClass() {
        return cabinComfortClass;
    }

    public void setCabinComfortClass(String cabinComfortClass) {
        this.cabinComfortClass = cabinComfortClass;
    }
}
