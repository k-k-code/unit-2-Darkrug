package ru.brunoyam.oop.models.transport;

/**
 * Авиатранспорт (самолет) прикрепленный к определенному авиамаршруту
 */
public class Plane extends Transport {
    /**
     * Багаж включен в стоимость билета
     */
    public boolean luggage;

    /**
     * Конструктор, заполняющий все поля.
     * @param travelTime время в пути
     * @param seatsNumber количество мест
     * @param cost стоимость билета
     * @param luggage багаж включен в стоимость билета
     */
    public Plane(int travelTime, int seatsNumber,
                 int cost, boolean luggage) {

        super(travelTime, seatsNumber, cost);
        this.luggage = luggage;
    }
}
