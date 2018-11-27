package com.olhastfn.others;

import java.time.LocalDate;

/**
 * Created on 18.11.2018.
 */
public class Listener {
    private Chat chat;
    private LocalDate created;
    private LocalDate lastOffer;
    private boolean status;

    public Listener() {
        chat = new Chat();
        created = LocalDate.now();
        lastOffer = LocalDate.now();
        status = false;
    }

    public Listener(Chat chat, boolean status) {
        chat = new Chat();
        created = LocalDate.now();
        lastOffer = LocalDate.now();
        status = false;
    }

    public Message getMessage(Message message){
        
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDate getLastOffer() {
        return lastOffer;
    }

    public void setLastOffer(LocalDate lastOffer) {
        this.lastOffer = lastOffer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
