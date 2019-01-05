package com.olhastfn.messenger;

/**
 * Created on 10.11.2018.
 */
public class Account {
    private int id;
    private static int nextId=0;
    private String login;
    private String password;

    public Account() {
        setId();
        login = "none";
        password = "none";
    }

    public Account(String login, String password) {
        setId();
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
