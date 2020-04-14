package ru.brunoyam.oop.models;

/**
 * Класс моделирующий объект реального мира - пассажира.
 * Пассажир представлен именем, фамилией, отчеством и номером документа удостоверяющего личность.
 */
public class Passenger {

    /**
     * Имя пассажира
     */
    public String name;
    /**
     * Фамили пассажира
     */
    String surname;
    /**
     * Отчество пассажира
     */
    String secondName;
    /**
     * Номер документа, удостоверяющего личность
     */
    String docNumber;

    /**
     * Конструктор, заполняющий единственно поле.
     * @param docNumberArg - номер документа, удостоверяющего личность.
     */
    public Passenger(String docNumberArg) {
        docNumber = docNumberArg;
    }

    /**
     * Конструктор, заполняющий все поля.
     * @param name - имя пассажира
     * @param surname - фамилия пассажира
     * @param secondName - отчество пассажира
     * @param docNumber - номер документа, удостоверяюего личность
     */
    public Passenger(String name, String surname, String secondName, String docNumber) {
        this(docNumber);
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
    }

    /**
     * Возвращает полное имя как склеенные имя, фамилию и отчество, разделенне пробелом.
     * @return полное имя
     */
    public String getFullName() {
        String fullName = name + " " + surname + " " + secondName;
        return fullName;
    }

    /**
     * Возвращает полное имя как склеенные имя, фамилию и отчество, разделеные пробелом и предваряемые префиксом.
     * @param prefix обращение к пассажирц, подставляемое перед именем.
     * @return полное имя с префиксом.
     */
    public String getFullName(String prefix) {
        String fullName = prefix + " " + getFullName();
        return fullName;
    }

}
