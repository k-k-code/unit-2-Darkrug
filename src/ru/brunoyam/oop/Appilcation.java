package ru.brunoyam.oop;

import ru.brunoyam.oop.models.Passenger;
import ru.brunoyam.oop.models.transport.*;

/**
 * Главный класс нашего приложения.
 */
public class Appilcation {

    /**
     * Главный класс приложения
     *
     * @param args - набор аргументов запуска приложения.
     */
    public static void main(String[] args) {

        Passenger passenger1 = new Passenger("Yekaterina", "Petrova", "Ivanovna", "88005353");
        Passenger passenger2 = new Passenger("Petr", "Ivanov", "Iliych", "98562353");
        Passenger passenger3 = new Passenger("Vladislav", "Sidorov", "Alekseyevich", "9999953");
        Passenger passenger4 = new Passenger("Gleb", "Sharikov", "Andreyevich", "880053784");

        Passenger[] busPassengers = new Passenger[1];
        busPassengers[0] = passenger1;

        Passenger[] planePassengers = new Passenger[1];
        planePassengers[0] = passenger2;

        Passenger[] shipPassengers = new Passenger[1];
        shipPassengers[0] = passenger3;

        Passenger[] trainPassengers = new Passenger[1];
        trainPassengers[0] = passenger4;

        Bus bus = new Bus(true, 5, 300, 60, 2000);
        bus.setPassengers(busPassengers);
        Plane plane = new Plane(120, 160, 20000, true);
        plane.setPassengers(planePassengers);
        Ship ship = new Ship();
        ship.setPassengers(shipPassengers);
        Train train = new Train();
        train.setPassengers(trainPassengers);

        Transport[] transports = new Transport[4];
        transports[0] = bus;
        transports[1] = plane;
        transports[2] = ship;
        transports[3] = train;


        for (Transport value : transports) {
            System.out.println(value.toString());
        }


    }

}
