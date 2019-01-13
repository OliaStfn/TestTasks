package com.olhastfn.reсeption;

import java.time.LocalDate;
import java.util.ArrayList;

public class Catalog {
    private int id;
    private static int nextId = 1;
    private ArrayList<PersonalFile> personalFiles;

    public Catalog() {
        setId();
        personalFiles = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public ArrayList<PersonalFile> getPersonalFiles() {
        return personalFiles;
    }

    public void setPersonalFiles(ArrayList<PersonalFile> personalFiles) {
        this.personalFiles = personalFiles;
    }

    public PersonalFile searchById(int id) {
        for (PersonalFile personalFile : personalFiles) {
            if (id == personalFile.getId()) {
                return personalFile;
            }
        }
        return null;
    }

    public PersonalFile searchByFullName(String name, String surname) {
        for (PersonalFile personalFile : personalFiles) {
            if (name.equals(personalFile.getPerson().getName())
                    && surname.equals(personalFile.getPerson().getSurname())) {
                return personalFile;
            }
        }
        return null;
    }

    public PersonalFile searchByPhone(String phoneNumb) {
        for (PersonalFile personalFile : personalFiles) {
            if (personalFile.getPhoneNumb().contains(phoneNumb)) {
                return personalFile;
            }
        }
        return null;
    }

    public void addPersonalFile(String name, String surname, LocalDate bornDate, String phoneNumber) {
        Person person = new Person(name, surname, bornDate);
        PersonalFile personalFile = new PersonalFile(phoneNumber, person);
        personalFiles.add(personalFile);
    }

    public void deleteById(int id) {
       personalFiles.remove(searchById(id));
    }

    public void deleteByPhone(String phoneNumb){
        personalFiles.remove(searchByPhone(phoneNumb));
    }
}
