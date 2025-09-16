package com.doxa.chatapp.controller;

import com.doxa.chatapp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Marks this class as a Spring MVC controller
@Controller
public class ChatController {

    // Handles messages sent to /app/sendMessage via WebSocket
    // Broadcasts the received ChatMessage to all subscribers of /topic/messages
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        // Returns the received message so it can be sent to all clients
        return chatMessage;
    }

    // Handles HTTP GET requests to /chat and returns the "chat" view
    @GetMapping("/chat")
    public String chat() {
        // Returns the name of the HTML template (chat.html)
        return "chat";
    }

}
