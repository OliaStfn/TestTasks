package com.olhastfn.others;

import java.time.LocalDate;

/**
 * Created on 10.11.2018.
 */
public class Person {
    private int id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Account account;

    public Person() {
        id = 0;
        name = "none";
        surname = "none";
        dateOfBirth = LocalDate.now();
        account= new Account();
    }

    public Person(int id, String name, String surname, String login,String pass) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        dateOfBirth = LocalDate.now();
        account= new Account(id,login,pass);
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
