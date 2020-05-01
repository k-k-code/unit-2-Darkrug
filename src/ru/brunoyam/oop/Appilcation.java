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


        Bus bus = new Bus(BusType.CITY);
        System.out.println("--Автобус--");
        bus.addPassenger(bus, passenger1);

        Plane plane = new Plane(PlaneCabin.FIRST);
        System.out.println("--Самолет--");
        plane.addPassenger(plane, passenger2);

        Ship ship = new Ship(ShipType.YACHT);
        System.out.println("--Корабль--");
        ship.addPassenger(ship, CabinType.COMFORT, new Passenger("115465"));
        ship.addPassenger(ship, CabinType.COMFORT, new Passenger("25465"));
        ship.addPassenger(ship, CabinType.COMFORT, new Passenger("3465"));
        ship.addPassenger(ship, CabinType.COMFORT, new Passenger("45465"));
        ship.addPassenger(ship, CabinType.STANDARD, new Passenger("55465"));
        ship.addPassenger(ship, CabinType.ECONOMY, new Passenger("65465"));

        Train train = new Train(TrainType.SPEED_TRAIN);
        System.out.println("--Поезд--");
        train.addPassenger(train, CompartmentType.COMFORT, new Passenger("125465"));
        train.addPassenger(train, CompartmentType.COMFORT, new Passenger("2125465"));
        train.addPassenger(train, CompartmentType.COMFORT, new Passenger("3125465"));
        train.addPassenger(train, CompartmentType.COMFORT, new Passenger("4525465"));
        train.addPassenger(train, CompartmentType.COMFORT, new Passenger("5725465"));
        train.addPassenger(train, CompartmentType.COMFORT, new Passenger("6825465"));

        System.out.println("--------------------------");

        Transport[] transports = new Transport[4];
        transports[0] = bus;
        transports[1] = plane;
        transports[2] = ship;
        transports[3] = train;


        for (Transport value : transports) {
            System.out.println(value.toString());
        }

        System.out.println("--------------------------");
        System.out.println("--------Уровень 3---------");

        RouteInfo route1 = new RouteInfo("01.05.2021 - 02.05.2021", train, "Saint-Petersburg - Moscow");

        System.out.println(route1);


    }


}
