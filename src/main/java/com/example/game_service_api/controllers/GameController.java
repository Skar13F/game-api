package com.example.game_service_api.controllers;

import com.example.game_service_api.entities.GameEntity;
import com.example.game_service_api.services.GameService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/games")
public class GameController {
    private final GameService gameService;

    @PostMapping
    public ResponseEntity<GameEntity> createGame(@RequestBody GameEntity gameEntity) {
        GameEntity gameCreated = gameService.saveGame(gameEntity);
        return ResponseEntity.ok().body(gameCreated);
    }
}
