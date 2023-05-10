package com.devsuperior.ds_list.controller;

import com.devsuperior.ds_list.dtos.GameListDTO;
import com.devsuperior.ds_list.dtos.GameMinDTO;
import com.devsuperior.ds_list.service.GameListService;
import com.devsuperior.ds_list.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/lists")
public class GameListController {
    @Autowired
    GameListService service;
    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public GameListDTO findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }
    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable("listId") Long listId){
        return gameService.findByList(listId);
    }
}
