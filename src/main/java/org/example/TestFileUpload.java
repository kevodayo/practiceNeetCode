package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TestFileUpload {

    public static void main(String args[]){

        try {
            // Specify the file path
            Path filePath = Path.of("example.txt");

            // Create the file if it doesn't exist
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
                System.out.println("File created: " + filePath);
            }

            // Write content to the file
            String content = "Hello, Spring Boot!";
            Files.write(filePath, content.getBytes(), StandardOpenOption.APPEND);

            System.out.println("Content written to the file: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
