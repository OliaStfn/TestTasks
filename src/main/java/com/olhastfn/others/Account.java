package com.olhastfn.others;

/**
 * Created on 10.11.2018.
 */
public class Account {
    private int id;
    private String login;
    private String password;

    public Account() {
        id = 0;
        login = "none";
        password = "none";
    }

    public Account(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
