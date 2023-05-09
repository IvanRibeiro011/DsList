package com.devsuperior.ds_list.service;

import com.devsuperior.ds_list.dtos.GameMinDTO;
import com.devsuperior.ds_list.entity.Game;
import com.devsuperior.ds_list.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
    }
}
