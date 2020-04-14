package ru.brunoyam.oop.models.transport;

/**
 * Абстрактный класс транспорт.
 */
public abstract class Transport {

    /**
     * Время в пути
     */
    private int travelTime;
    /**
     * Общее количество мест
     */
    private int seatsNumber;
    /**
     * Стоимость билета
     */
    private int cost;

    /**
     * Конструктор без аргументов
     */
    public Transport() {
        System.out.println("transport was created!");
    }

    /**
     * Конструктор заполняющий все поля
     * @param travelTime время в пути
     * @param seatsNumber количество мест
     * @param cost стоимость билета
     */
    public Transport(int travelTime, int seatsNumber, int cost) {
        this.travelTime = travelTime;
        this.seatsNumber = seatsNumber;
        this.cost = cost;
    }

    /**
     * Геттер для поля {@link #travelTime travelTime}
     * @return время в пути
     */
    public int getTravelTime() {
        return travelTime;
    }

    /**
     * Сеттер для поля {@link #travelTime travelTime}
     * @param travelTime время в пути
     */
    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    /**
     * Геттер для поля {@link #seatsNumber seatsNumber}
     * @return количество мест
     */
    public int getSeatsNumber() {
        return seatsNumber;
    }

    /**
     * Cеттер для поля {@link #seatsNumber seatsNumber}
     * @param seatsNumber количество мест
     */
    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    /**
     * Геттер для поля {@link #cost cost}
     * @return стоимость билета
     */
    public int getCost() {
        return cost;
    }

    /**
     * Сеттер для поля {@link #cost cost}
     * @param cost стоимость билета
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Возвращает текстовое представление объекта
     * @return текстовое представление объекта
     */
    @Override
    public String toString() {
        return "Transport{" +
                "travelTime=" + travelTime +
                ", seatsNumber=" + seatsNumber +
                ", cost=" + cost +
                '}';
    }

}
