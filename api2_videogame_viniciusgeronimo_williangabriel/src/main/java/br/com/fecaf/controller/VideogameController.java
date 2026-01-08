package br.com.fecaf.controller;

import br.com.fecaf.model.Videogame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/games") 
@CrossOrigin(origins = "*", allowedHeaders = "*") 
public class VideogameController {

    // Just create a variable
    private final List<Videogame> gameDatabase;

    // Receive the database on made in App.java
    @Autowired
    public VideogameController(List<Videogame> gameDatabase) {
        this.gameDatabase = gameDatabase;
    }

  
    @GetMapping("/all")
    public List<Videogame> listAllGames() {
        return this.gameDatabase;
    }

    @GetMapping("/id/{id}")
    public Optional<Videogame> getGameById(@PathVariable Long id) {
        for (Videogame game : this.gameDatabase) {
            if (game.getId().equals(id)) {
                return Optional.of(game);
            }
        }
        return Optional.empty(); 
    }
}