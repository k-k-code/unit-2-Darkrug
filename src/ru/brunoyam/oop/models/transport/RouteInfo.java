package ru.brunoyam.oop.models.transport;

// Добавить класс, описывающий туристический рейс. Перенести в этот класс информацию, относящуюся к рейсу, включая ссылку на транспортное средство.
// Он должен описывать туристический рейс.
// Мы изначально создали только транспортные средства, но одно и то же транспортное средство может участвовать в разных рейсах в разные даты.
// Поэтому маршрут и даты должны быть атрибутами рейса.
// И транспортное средство также должно быть атрибутом рейса.

public class RouteInfo {

    private String tripDate;
    private Transport transport;
    private String route;

    public RouteInfo(String tripDate, Transport transport, String route) {
        this.tripDate = tripDate;
        this.transport = transport;
        this.route = route;
    }

    public String getTripDate() {
        return tripDate;
    }

    public Transport getTransport() {
        return transport;
    }

    public String getRoute() {
        return route;
    }


    @Override
    public String toString() {
        return "RouteInfo{" +
                "route = '" + route + '\'' +
                ", tripDate = '" + tripDate + '\'' +
                ", transport = " + transport +
                '}';
    }
}
