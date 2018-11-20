package com.olhastfn.others;

import java.util.ArrayList;

/**
 * Created on 18.11.2018.
 */
public class Chitter extends Person {
    ArrayList<Listener> listeners;

    public Chitter() {
        super();
        listeners = new ArrayList<>();
    }

    public Chitter(String name, String surname, String login, String pass, ArrayList<Listener> listeners) {
        super(name, surname, login, pass);
        listeners = new ArrayList<>();
    }

    public ArrayList<Listener> getListeners() {
        return listeners;
    }

    public void setListeners(ArrayList<Listener> listeners) {
        this.listeners = listeners;
    }
}
