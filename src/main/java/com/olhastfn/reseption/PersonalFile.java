package com.olhastfn.reseption;

import java.time.LocalDate;

public class PersonalFile {
    private String phoneNumb;
    private Person person;
    private LocalDate registrationDate;

    public PersonalFile() {
        phoneNumb = "none";
        person = new Person();
        registrationDate = LocalDate.now();
    }

    public PersonalFile(String phoneNumb) {
        this.phoneNumb = phoneNumb;
        person = new Person();
        registrationDate = LocalDate.now();
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
