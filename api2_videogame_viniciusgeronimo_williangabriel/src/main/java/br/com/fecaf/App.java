package br.com.fecaf;

import br.com.fecaf.model.Videogame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    // Creates a database that will be read on by @AutoWired in the VideogameController.java
    @Bean
    public List<Videogame> gameDatabase() {
        System.out.println("--- Loading Videogame Database ---");
        try (InputStream inputStream = getClass().getResourceAsStream("/data/videogames.json")) {
            if (inputStream == null) {
                System.err.println("FATAL: videogames.json not found.");
                return List.of(); // Return an empty list
            }
            
            ObjectMapper objectMapper = new ObjectMapper();
            List<Videogame> games = objectMapper.readValue(inputStream, new TypeReference<List<Videogame>>() {});
            System.out.println(games.size() + " games loaded successfully.");
            return games;
            
        } catch (Exception e) {
            System.err.println("FATAL: Could not load game data: " + e.getMessage());
            return List.of(); 
        }
    }
}