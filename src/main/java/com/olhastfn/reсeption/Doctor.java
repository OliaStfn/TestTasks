package com.olhastfn.reсeption;

import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor extends Person {
    private int id;
    private static int nextId = 1;
    private String specialization;
    private Shedule shedule;
    private ArrayList<Appointment> appointments;

    public Doctor() {
        super();
        setId();
        specialization="none";
        shedule= new Shedule();
        appointments= new ArrayList<>();
    }

    public Doctor(String specialization, Shedule shedule) {
        this();
        this.specialization = specialization;
        this.shedule = shedule;
    }

    public Doctor(String name, String surname, LocalDate dateOfBirth, String specialization,
                  Shedule shedule) {
        super(name, surname, dateOfBirth);
        setId();
        appointments = new ArrayList<>();
        this.specialization = specialization;
        this.shedule = shedule;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public void setId(){
        id=nextId;
        nextId++;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Shedule getShedule() {
        return shedule;
    }

    public void setShedule(Shedule shedule) {
        this.shedule = shedule;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }
}
