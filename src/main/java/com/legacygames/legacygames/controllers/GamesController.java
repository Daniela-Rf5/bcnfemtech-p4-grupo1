package com.legacygames.legacygames.controllers;

import com.legacygames.legacygames.Services.GamesService;
import com.legacygames.legacygames.Services.PegiService;
import com.legacygames.legacygames.models.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GamesController {
    private GamesService gamesService;
    private PegiService pegiService;

    @Autowired
    public GamesController(GamesService gamesService, PegiService pegiService) {
        this.gamesService = gamesService;
        this.pegiService = pegiService;
    }

    @GetMapping("/games/new")
    String newGame(Model model) {
        Game game = new Game();
        model.addAttribute("game", game);
        model.addAttribute("title", "create new game");
        model.addAttribute("pegis", pegiService.allPegis()); // se utiliza para que se muestre la lista desplegable y hay que agregar un PegiService
        return "games/newgames";

    }

    @PostMapping("/games/new")
    public String addGame(@ModelAttribute Game game) {
        gamesService.save(game);
       // return "redirect:/index";
        return "redirect:/games";
        //return "redirect:home";
    }
    @GetMapping("games/new/{id}")
    String editGame(Model model, @PathVariable Long id){
        Game game = gamesService.findById(id);
        model.addAttribute("game", game);
        model.addAttribute( "title", "Edit Games");
            return "games/newgames";
    }

    @GetMapping("games/delete/{id}")
    public String delete(@PathVariable Long id) {
        gamesService.delete(id);
        return "redirect:/games";
    }

}

