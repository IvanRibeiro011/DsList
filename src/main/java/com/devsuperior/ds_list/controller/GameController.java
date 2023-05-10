package com.devsuperior.ds_list.controller;

import com.devsuperior.ds_list.dtos.GameMinDTO;
import com.devsuperior.ds_list.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    GameService service;
    @GetMapping
    public List<GameMinDTO> findAll(){
        return service.findAll();
    }
}
