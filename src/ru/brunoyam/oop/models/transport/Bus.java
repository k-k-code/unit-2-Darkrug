package ru.brunoyam.oop.models.transport;

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

    /**
     * Конструктор заполняющий все поля
     * @param hasToilet наличие туалет
     * @param stopsNumber количество остановок на маршруте
     * @param travelTime время в пути
     * @param seatsNumber количество мест
     * @param cost стоимость билета
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
     * @param stopsNumber количество остановок
     */
    public void setStopsNumber(int stopsNumber) {
        this.stopsNumber = stopsNumber;
    }

    /**
     * Возвращает текстовое представление объекта
     * @return текстовое представление объекта
     */
    @Override
    public String toString() {
        String transportDescription = super.toString() + " particular: ";
        return transportDescription + "Bus{" +
                "hasToilet=" + hasToilet +
                ", stopsNumber=" + stopsNumber +
                '}';
    }
}
