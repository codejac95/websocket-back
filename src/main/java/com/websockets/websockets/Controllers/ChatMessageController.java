package com.websockets.websockets.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.websockets.websockets.Services.ChatMessageService;
import com.websockets.websockets.models.ChatMessage;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/getRoomMessages")
    public List<ChatMessage> ChatMessageList(@RequestBody String roomName) {
        System.out.println("tjoho");
        return chatMessageService.getRoomMessages(roomName);
    }

}
