package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

/**
 * Авиатранспорт (самолет) прикрепленный к определенному авиамаршруту
 */
public class Plane extends Transport {
    /**
     * Багаж включен в стоимость билета
     */
    private boolean luggage;

    private Passenger[] passengers = new Passenger[10];

    /**
     * Конструктор, заполняющий все поля.
     *
     * @param travelTime  время в пути
     * @param seatsNumber количество мест
     * @param cost        стоимость билета
     * @param luggage     багаж включен в стоимость билета
     */
    public Plane(int travelTime, int seatsNumber,
                 int cost, boolean luggage) {

        super(travelTime, seatsNumber, cost);
        this.luggage = luggage;
    }

    public boolean isLuggage() {
        return luggage;
    }

    public void setLuggage(boolean luggage) {
        this.luggage = luggage;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        String passengerList = "";
        getPassengers();
        for (Passenger value : passengers) {
            passengerList = passengerList + value.getFullName() + "; ";
        }

        return "Plane {" +
                "luggage=" + luggage +
                ". Passengers=" + passengerList +
                '}';
    }
}
