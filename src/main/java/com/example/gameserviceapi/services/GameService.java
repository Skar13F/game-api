package com.example.gameserviceapi.services;

import com.example.gameserviceapi.common.entities.GameEntity;

public interface GameService {
    GameEntity saveGame(GameEntity gameEntity);

    GameEntity getGameById(Long id);
}
