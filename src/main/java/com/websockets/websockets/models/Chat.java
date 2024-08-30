package com.websockets.websockets.models;

public class Chat {
    private String chat;
    private String user;

    public Chat(String chat,String user) {
        this.chat = chat;
        this.user = user;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
