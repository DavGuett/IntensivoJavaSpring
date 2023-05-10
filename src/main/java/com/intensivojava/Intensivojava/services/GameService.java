package com.intensivojava.Intensivojava.services;

import com.intensivojava.Intensivojava.dto.GameMinDTO;
import com.intensivojava.Intensivojava.entities.Game;
import com.intensivojava.Intensivojava.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO  > findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}