package com.nandosan.tekno.demo.feign;

import com.nandosan.tekno.demo.model.Games;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "games" , url = "https://the-lazy-media-api.vercel.app")
public interface GamesClient {

    @RequestMapping(value = "/api/games/console-game",method = RequestMethod.GET)
    public List<Games> getAllDataGames();
}
