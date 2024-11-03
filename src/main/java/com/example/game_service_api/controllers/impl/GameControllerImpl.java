package com.example.game_service_api.controllers.impl;

import com.example.game_service_api.common.entities.GameEntity;
import com.example.game_service_api.controllers.GameApi;
import com.example.game_service_api.services.GameService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping
public class GameControllerImpl implements GameApi {
    private final GameService gameService;

    @Override
    public ResponseEntity<GameEntity> saveGame(@RequestBody GameEntity gameEntity) {
        GameEntity gameCreated = gameService.saveGame(gameEntity);
        return ResponseEntity.ok().body(gameCreated);
    }

    @Override
    public ResponseEntity<GameEntity> getById(Long id) {
        return ResponseEntity.ok().body(gameService.getGameById(id));
    }
}
