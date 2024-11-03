package com.example.game_service_api.services;

import com.example.game_service_api.entities.GameEntity;
import com.example.game_service_api.repositories.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameService {
    private final GameRepository gameRepository;

    public GameEntity saveGame(GameEntity gameEntity) {
        GameEntity gameCreated = gameRepository.save(gameEntity);
        return gameCreated;
    }
}
