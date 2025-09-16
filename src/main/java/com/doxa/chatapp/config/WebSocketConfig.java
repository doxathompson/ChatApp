// This package contains configuration classes for your chat application
package com.doxa.chatapp.config;

// Import necessary Spring classes for WebSocket configuration
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

// Marks this class as a configuration class for Spring
@Configuration
// Enables WebSocket message handling, backed by a message broker
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    // Registers the endpoint that clients will use to connect to the WebSocket
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Adds an endpoint at /chat, allows requests from http://localhost:8080, and enables SockJS fallback
        registry.addEndpoint("/chat")
                .setAllowedOrigins("http://localhost:8080")
                .withSockJS();
    }

    // Configures the message broker for routing messages
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // Enables a simple in-memory broker for messages with destination prefix /topic
        registry.enableSimpleBroker("/topic");
        // Sets the prefix for messages bound for methods annotated with @MessageMapping
        registry.setApplicationDestinationPrefixes("/app");
    }
}
