package com.example.game_service_api.controllers.impl;

import com.example.game_service_api.common.dto.ErrorResponse;
import com.example.game_service_api.common.exceptions.GameException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j // Para mostrar los logs en la aplicación
public class ExceptionHandlerController {
    @ExceptionHandler(value = {GameException.class})
    ResponseEntity<ErrorResponse> handleGameException(GameException ex) {
        log.error("New exception", ex);
        var errorResponse = ErrorResponse.builder()
                .codeStatus(ex.getHttpStatus().value())
                .message(ex.getMessage())
                .build();
        return ResponseEntity.status(ex.getHttpStatus()).body(errorResponse);
    }
}
