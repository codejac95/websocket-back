package com.websockets.websockets.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.websockets.websockets.Services.ChatMessageService;
import com.websockets.websockets.models.ChatRoom;
import com.websockets.websockets.models.ChatMessage;

@RestController
@CrossOrigin("*")
public class ChatMessageController {

    @Autowired
    private ChatMessageService chatMessageService;

    public ChatMessageController(ChatMessageService chatMessageService) {
        this.chatMessageService = chatMessageService;
    }

    @PostMapping("/createChatMessage")
    public ChatMessage ChatMessage(@RequestBody ChatMessage chatMessage) {
        return chatMessageService.createChatMessage(chatMessage);
    }

}
