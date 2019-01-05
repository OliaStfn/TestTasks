package com.olhastfn.messenger;

import java.time.LocalDate;

/**
 * Created on 10.11.2018.
 */
public class Message {
    private int id;
    private static int nextId=0;
    private String text;
    private Person author;
    private LocalDate date;

    public Message() {
        setId();
        text = "none";
        author = new Person();
        date = LocalDate.now();
    }

    public Message(String text, Person author) {
        setId();
        this.text = text;
        this.author = author;
        this.date = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
