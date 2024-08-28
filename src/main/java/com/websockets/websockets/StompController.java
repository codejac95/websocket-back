package com.websockets.websockets;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class StompController {
    
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Hello hello(HelloMessage message) {
        System.out.println("/Hello");
        return new Hello(message.getName() + " has entered the chat!");
    }

    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public Chat chat(ChatMessage chat) {
        System.out.println("/chat");
        return new Chat(chat.getContent());
    }
}
