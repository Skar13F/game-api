package com.example.gameserviceapi.controllers.impl;

import com.example.gameserviceapi.common.entities.GameEntity;
import com.example.gameserviceapi.controllers.GameApi;
import com.example.gameserviceapi.services.GameService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GameControllerImpl implements GameApi {
    private final GameService gameService;

    @Override
    public ResponseEntity<GameEntity> saveGame(@RequestHeader("userIdRequest") String userId, @RequestBody GameEntity gameEntity) {
        GameEntity gameCreated = gameService.saveGame(gameEntity);
        return ResponseEntity.ok().body(gameCreated);
    }

    @Override
    public ResponseEntity<GameEntity> getById(Long id) {
        return ResponseEntity.ok().body(gameService.getGameById(id));
    }
}
