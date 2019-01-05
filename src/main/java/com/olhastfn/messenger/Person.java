package com.olhastfn.messenger;

import java.time.LocalDate;

/**
 * Created on 10.11.2018.
 */
public class Person {
    private int id;
    private static int nextId=0;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Account account;

    public Person() {
        setId();
        name = "none";
        surname = "none";
        dateOfBirth = LocalDate.now();
        account = new Account();
    }

    public Person(String name, String surname, String login, String pass) {
        setId();
        this.name = name;
        this.surname = surname;
        dateOfBirth = LocalDate.now();
        account = new Account(login, pass);
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
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
