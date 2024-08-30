
package com.websockets.websockets.Services;

import java.util.List;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;
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

    public List<ChatMessage> getRoomMessages(String roomName) {
        // Query query= new Query();
        // query.addCriteria(Criteria.where("chatRoom").is(roomName));

        List<ChatMessage> chatMessages = mongoOperations.findAll(ChatMessage.class).stream()
                .filter((ChatMessage chatMessage) -> chatMessage.getChatRoom().equals(roomName)).toList();
        System.out.println(chatMessages);
        return chatMessages;
    }

}