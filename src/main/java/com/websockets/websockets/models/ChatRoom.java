package com.websockets.websockets.models;

public class ChatRoom {
    private String chatRoom;
    private String user;

    public ChatRoom(String chatRoom, String user) {
        this.chatRoom = chatRoom;
        this.user = user;
    }

    public String getChat() {
        return chatRoom;
    }

    public void setChat(String chatRoom) {
        this.chatRoom = chatRoom;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
