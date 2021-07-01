package com.legacygames.legacygames.controllers;

import com.legacygames.legacygames.Services.CategoryService;
import com.legacygames.legacygames.Services.GamesService;
import com.legacygames.legacygames.Services.PegiService;
import com.legacygames.legacygames.Services.PlatformService;
import com.legacygames.legacygames.models.Game;
import com.legacygames.legacygames.models.Pegi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    private GamesService gamesService;
    private PegiService pegiService;
    private PlatformService platformService;
    private CategoryService categoryService;

    @Autowired
    public HomeController(GamesService gamesService, PegiService pegiService, PlatformService platformService, CategoryService categoryService) {
        this.gamesService = gamesService;
        this.pegiService = pegiService;
        this.platformService = platformService;
        this.categoryService = categoryService;
    }

    @GetMapping(path = {"/","/games", "/index"})
    String listGames(Model model, @RequestParam(required=false) Long pegiId) {
        List<Game> games;
        if (pegiId == null){
            games = gamesService.allGames();
        }
        else{
            Pegi pegi = pegiService.getPegi(pegiId);
            games = pegi.getGames();
        }
        model.addAttribute("title", "Browse games");
        model.addAttribute("games", games);
        model.addAttribute("pegi", pegiService.allPegi());
        model.addAttribute("platform", platformService.allPlatform());
        model.addAttribute("category", categoryService.allCategories());
        return "home";
    }



}
