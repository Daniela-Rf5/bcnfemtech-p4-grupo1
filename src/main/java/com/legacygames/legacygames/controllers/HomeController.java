package com.legacygames.legacygames.controllers;

import com.legacygames.legacygames.Services.GamesService;
import com.legacygames.legacygames.models.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    private GamesService gamesService;

    @Autowired
    public HomeController(GamesService gamesService) {
        this.gamesService = gamesService;
    }

    @GetMapping("/")
    String listGames(Model model) {
        List<Game> games = gamesService.allGames();
        model.addAttribute("title", "Games list");
        model.addAttribute("games", games);

        return "games/inventory";
    }
}
