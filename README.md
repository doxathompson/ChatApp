# Real-Time Chat Application

A beginner-friendly real-time chat application built with Spring Boot, WebSocket (STOMP), and Bootstrap.

## Features

- Real-time messaging using WebSocket and STOMP
- Simple web interface with Bootstrap styling
- Supports multiple users

## Technologies

- Java
- Spring Boot
- Maven
- WebSocket (SockJS, STOMP)
- Bootstrap

## Getting Started

### Prerequisites

- Java 17+
- Maven

### Setup

1. Clone the repository:
    ```
    git clone https://github.com/doxathompson/chatapp.git
    cd chatapp
    ```

2. Build and run the application:
    ```
    mvn spring-boot:run
    ```

3. Open your browser and go to:
    ```
    http://localhost:8080/chat
    ```

### Usage

- Enter your name and a message, then click **Send**.
- Messages will appear in real time for all connected users.

## Project Structure

- `src/main/java/com/doxa/chatapp/` - Main application code
- `src/main/resources/templates/chat.html` - Chat UI template
- `src/main/java/com/doxa/chatapp/model/ChatMessage.java` - Message model
- `src/main/java/com/doxa/chatapp/controller/ChatController.java` - WebSocket and HTTP controller
- `src/main/java/com/doxa/chatapp/config/WebSocketConfig.java` - WebSocket configuration

## License

This project is for educational purposes.
