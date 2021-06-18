package com.legacygames.legacygames.controllers;

import com.legacygames.legacygames.Services.GamesService;
import com.legacygames.legacygames.models.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class GamesController {
    private GamesService gamesService;

    @Autowired
    public GamesController(GamesService gamesService) {
        this.gamesService = gamesService;
    }


    @GetMapping("/games/new")
    String newGame(Model model) {
        Game game = new Game();
        model.addAttribute("game", game);
        model.addAttribute("title", "create new game");
        return "games/newgames";

    }

    @PostMapping("/games/new")
    public String addGame(@ModelAttribute Game game) {
        gamesService.save(game);
       // return "redirect:/index";
        return "redirect:/games";
        //return "redirect:home";
    }
}

