package com.olhastfn.reseption;

import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public Person() {
        id = 0;
        name = "none";
        surname = "none";
        dateOfBirth = LocalDate.now();
    }

    public Person(String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        dateOfBirth = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
