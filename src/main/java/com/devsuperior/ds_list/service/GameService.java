package com.devsuperior.ds_list.service;

import com.devsuperior.ds_list.dtos.GameDTO;
import com.devsuperior.ds_list.dtos.GameMinDTO;
import com.devsuperior.ds_list.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        return new GameDTO(gameRepository.findById(id).orElseThrow(() -> new RuntimeException("Game não encontrado")));
    }
}
