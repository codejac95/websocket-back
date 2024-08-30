package com.websockets.websockets.Controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.websockets.websockets.models.ChatRoom;
import com.websockets.websockets.models.ChatMessage;
import com.websockets.websockets.models.Hello;
import com.websockets.websockets.models.HelloMessage;

@Controller
public class StompController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Hello hello(HelloMessage message) {
        System.out.println("/Hello");
        return new Hello("(" + message.getName() + " has entered the chat!)");
    }

    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public ChatRoom chat(ChatMessage chatMessage) {
        System.out.println("/chat");
        return new ChatRoom(chatMessage.getContent(), chatMessage.getUser());
    }
}
