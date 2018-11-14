package com.olhastfn.others;

import java.time.LocalDate;

/**
 * Created on 10.11.2018.
 */
public class Message {
    private int id;
    private String text;
    private Person author;
    private LocalDate date;

    public Message() {
        id=0;
        text="none";
        author= new Person();
        date= LocalDate.now();
    }

    public Message(int id, String text, Person author) {
        this.id = id;
        this.text = text;
        this.author = author;
        this.date = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
