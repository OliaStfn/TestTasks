package com.olhastfn.others;

import java.util.ArrayList;

/**
 * Created on 10.11.2018.
 */
public class Chat {
    private int id;
    private static int nextId = 0;
    private String name;
    private ArrayList<Message> messages;
    private ArrayList<Person> authors;

    public Chat() {
        setId();
        name = "none";
        messages = new ArrayList<>();
        authors = new ArrayList<>();
    }

    public Chat(String name, ArrayList<Person> authors) {
        setId();
        this.name = name;
        this.authors = authors;
        messages = new ArrayList<>();
    }

    public void deleteAutFromChat(int id) {
        if (authors != null) {
            for (Person author : authors) {
                if (author.getId() == id) {
                    authors.remove(author);
                }
            }
        } else System.out.println("Чат закритий");
    }

    public void addAutToChat(Person author) {
        if (ifPersonPresent(author.getId())) {
            authors.add(author);
        }
    }

    public void deleteMessage(int id) {
        for (Message message : messages) {
            if (message.getId() == id) {
                messages.remove(message);
            }
        }
    }

    private boolean ifPersonPresent(int id) {
        for (Person author : authors) {
            if (author.getId() == id) {
                return true;
            }
        }
        return false;
    }


    public void addMessage(Message message) {
        messages.add(message);
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
