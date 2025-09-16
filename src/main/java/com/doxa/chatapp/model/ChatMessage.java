package com.doxa.chatapp.model;

// Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
import lombok.Data;
// Lombok annotation to generate a no-argument constructor
import lombok.NoArgsConstructor;

// Marks this class as a simple data holder for chat messages
@Data
@NoArgsConstructor
public class ChatMessage {
    // Unique identifier for the message
    private Long id;
    // Name of the sender
    private String sender;
    // Content of the chat message
    private String content;
}
