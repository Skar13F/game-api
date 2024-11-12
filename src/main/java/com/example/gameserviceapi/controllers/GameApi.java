package com.example.gameserviceapi.controllers;

import com.example.gameserviceapi.common.constants.ApiPathVariables;
import com.example.gameserviceapi.common.entities.GameEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(ApiPathVariables.API + ApiPathVariables.V1_ROUTE + ApiPathVariables.GAME_ROUTE)
public interface GameApi {
    @PostMapping
    ResponseEntity<GameEntity> saveGame(@RequestBody GameEntity gameEntity);

    @GetMapping("/{id}")
    ResponseEntity<GameEntity> getById(@PathVariable Long id);
}
