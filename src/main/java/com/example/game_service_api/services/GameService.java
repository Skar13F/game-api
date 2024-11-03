package com.example.game_service_api.services;

import com.example.game_service_api.common.entities.GameEntity;

public interface GameService {
    GameEntity saveGame(GameEntity gameEntity);

    GameEntity getGameById(Long id);
}
