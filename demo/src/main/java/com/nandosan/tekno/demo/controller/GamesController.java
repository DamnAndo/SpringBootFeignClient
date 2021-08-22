package com.nandosan.tekno.demo.controller;

import com.nandosan.tekno.demo.feign.GamesClient;
import com.nandosan.tekno.demo.model.Games;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class GamesController {

    private final GamesClient gamesClient;

    @GetMapping("/games/all")
    public List<Games> getAll(){
        List<Games> games = gamesClient.getAllDataGames();
        return games;
    }


}
