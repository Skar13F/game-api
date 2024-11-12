package com.example.gameserviceapi.services.impl;

import com.example.gameserviceapi.common.entities.GameEntity;
import com.example.gameserviceapi.common.exceptions.GameException;
import com.example.gameserviceapi.repositories.GameRepository;
import com.example.gameserviceapi.services.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {
    private final GameRepository gameRepository;

    @Override
    public GameEntity saveGame(GameEntity gameEntity) {
        GameEntity gameCreated = gameRepository.save(gameEntity);
        return gameCreated;
    }

    @Override
    public GameEntity getGameById(Long id) {
        GameEntity gameEntity = gameRepository.findById(id).orElseThrow(() -> new GameException(HttpStatus.NOT_FOUND, "Error game Not Found"));
        return gameEntity;
    }
}
