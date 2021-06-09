package com.legacygames.legacygames.controllers;

import com.legacygames.legacygames.Services.GamesService;
import com.legacygames.legacygames.models.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GamesController {
    private GamesService gamesService;

    @Autowired
    public GamesController(GamesService gamesService) {
        this.gamesService = gamesService;
    }

    @GetMapping("/games")
    String listGames(Model model) {
        List<Games> games = gamesService.allGames();
        model.addAttribute("title", "Games list");
        model.addAttribute("games", games);
        return "games/all";
    }
    @GetMapping("games/inventory")
    public String inventory(){
        return "inventory";
    }

    }


