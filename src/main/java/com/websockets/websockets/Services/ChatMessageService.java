package com.websockets.websockets.Services;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.websockets.websockets.models.ChatRoom;
import com.websockets.websockets.models.ChatMessage;

@Service
public class ChatMessageService {

    private final MongoOperations mongoOperations;

    public ChatMessageService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public ChatMessage createChatMessage(ChatMessage chatMessage) {
        return mongoOperations.save(chatMessage);
    }

}
