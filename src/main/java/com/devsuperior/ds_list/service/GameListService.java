package com.devsuperior.ds_list.service;

import com.devsuperior.ds_list.dtos.GameListDTO;
import com.devsuperior.ds_list.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameListService {
    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        return gameListRepository.findAll().stream().map(GameListDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) {
        return new GameListDTO(gameListRepository.findById(id).orElseThrow(() -> new RuntimeException("GameList não encontrado")));
    }
}
