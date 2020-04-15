package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

/**
 * Автобус прикрепленный к определенному маршруту.
 */
public class Bus extends Transport {
    /**
     * Наличие туалета в автобусе
     */
    private boolean hasToilet;
    /**
     * Количество остановок на маршруте
     */
    private int stopsNumber;

    // Пассажиры

    private Passenger[] passengers = new Passenger[10];

    /**
     * Конструктор заполняющий все поля
     *
     * @param hasToilet   наличие туалет
     * @param stopsNumber количество остановок на маршруте
     * @param travelTime  время в пути
     * @param seatsNumber количество мест
     * @param cost        стоимость билета
     */
    public Bus(boolean hasToilet, int stopsNumber,
               int travelTime, int seatsNumber, int cost) {

        super(travelTime, seatsNumber, cost);
        this.hasToilet = hasToilet;
        this.stopsNumber = stopsNumber;
    }

    /**
     * Геттер для поля {@link #hasToilet hasToilet}
     * @return наличие туалета
     */
    public boolean isHasToilet() {
        return hasToilet;
    }

    /**
     * Геттер для поля {@link #stopsNumber stopsNumber}
     * @return количество остановок
     */
    public int getStopsNumber() {
        return stopsNumber;
    }

    /**
     * Сеттер для поля {@link @stopsNumber stopsNumber}
     *
     * @param stopsNumber количество остановок
     */
    public void setStopsNumber(int stopsNumber) {
        this.stopsNumber = stopsNumber;
    }

    // Геттер и сеттер для пассажиров

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    /**
     * Возвращает текстовое представление объекта
     *
     * @return текстовое представление объекта
     */
    @Override
    public String toString() {

        String passengerList = "";
        getPassengers();
        for (Passenger value : passengers) {
            passengerList = passengerList + value.getFullName() + "; ";
        }

        String transportDescription = super.toString() + " particular: ";
        return transportDescription + "Bus {" +
                "hasToilet=" + hasToilet +
                ", stopsNumber=" + stopsNumber + ". Passengers: " + passengerList +
                '}';
    }
}
