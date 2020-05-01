package ru.brunoyam.oop.models;

/**
 * Класс моделирующий объект реального мира - пассажира.
 * Пассажир представлен именем, фамилией, отчеством и номером документа удостоверяющего личность.
 */
public class Passenger {

    /**
     * Имя пассажира
     */
    private String name;
    /**
     * Фамили пассажира
     */
    private String surname;
    /**
     * Отчество пассажира
     */
    private String secondName;
    /**
     * Номер документа, удостоверяющего личность
     */
    private String docNumber;

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
     *
     * @param prefix обращение к пассажирц, подставляемое перед именем.
     * @return полное имя с префиксом.
     */
    public String getFullName(String prefix) {
        String fullName = prefix + " " + getFullName();
        return fullName;
    }

    // ГЕТТЕРЫ

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getDocNumber() {
        return docNumber;
    }

    // СЕТТЕРЫ

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }


    @Override
    public String toString() {
        return "Passenger{" +
                "docNumber='" + docNumber + '\'' +
                '}';
    }

}
