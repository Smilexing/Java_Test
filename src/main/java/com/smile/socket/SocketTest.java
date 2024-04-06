package com.smile.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTest {
    private static final Logger logger = LoggerFactory.getLogger(SocketTest.class);

    public void start(int port) {
        try (ServerSocket server = new ServerSocket(port)) {
            logger.info("Server started. Listening on port " + port);
            while (true) {
                Socket socket = server.accept();
                logger.info("Client connected: " + socket.getInetAddress());

                Thread thread = new Thread(() -> {
                    try (
                            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream())
                    ) {
                        Message message = (Message) objectInputStream.readObject();
                        logger.info("Server received message: " + message.getContent());
                        message.setContent("New content");
                        objectOutputStream.writeObject(message);
                        objectOutputStream.flush();
                        logger.info("Response sent to client.");
                    } catch (IOException | ClassNotFoundException e) {
                        logger.error("Error handling client connection: " + e.getMessage());
                    } finally {
                        try {
                            socket.close();
                        } catch (IOException e) {
                            logger.error("Error closing socket: " + e.getMessage());
                        }
                    }
                });
                thread.start();
            }
        } catch (IOException e) {
            logger.error("Error starting the server: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SocketTest socketTest = new SocketTest();
        socketTest.start(6666);
    }
}

