package com.olhastfn.others;

import java.util.ArrayList;

/**
 * Created on 10.11.2018.
 */
public class Chat {
    private int id;
    private String name;
    private ArrayList<Message>messages;
    private ArrayList<Person>authors;

    public Chat() {
        id=0;
        name="none";
        messages= new ArrayList<>();
        authors= new ArrayList<>();
    }

    public Chat(int id, String name, ArrayList<Person> authors) {
        this.id = id;
        this.name = name;
        this.authors= authors;
        messages= new ArrayList<>();
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

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public ArrayList<Person> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Person> authors) {
        this.authors = authors;
    }
}
