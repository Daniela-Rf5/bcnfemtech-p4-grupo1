package com.legacygames.legacygames.controllers;

import com.legacygames.legacygames.Services.CategoryService;
import com.legacygames.legacygames.Services.GamesService;
import com.legacygames.legacygames.Services.PegiService;
import com.legacygames.legacygames.Services.PlatformService;
import com.legacygames.legacygames.models.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class GamesController {
    private GamesService gamesService;
    private PegiService pegiService;
    private CategoryService categoryService;
    private PlatformService platformService;

    @Autowired
    public GamesController(GamesService gamesService, PegiService pegiService, CategoryService categoryService, PlatformService platformService) {
        this.gamesService = gamesService;
        this.pegiService = pegiService;
        this.categoryService = categoryService;
        this.platformService = platformService;

    }

    @GetMapping("/games/new")
    String newGame(Model model) {
        Game game = new Game();
        model.addAttribute("game", game);
        model.addAttribute("title", "create new game");
        model.addAttribute("pegis", pegiService.allPegi()); // se utiliza para que se muestre la lista desplegable y hay que agregar un PegiService
        model.addAttribute("categories", categoryService.allCategories()); // se utiliza para que se muestre la lista desplegable y hay que agregar un CategoryService
        model.addAttribute("platform", platformService.allPlatform()); // se utiliza para que se muestre la lista desplegable y hay que agregar un CategoryService
        return "games/newgames";
    }

    @PostMapping("/games/new")
    public String addGame(@ModelAttribute Game game, @RequestParam("image") MultipartFile multipartFile) throws IOException {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        game.setPhoto(fileName);
        gamesService.save(game);
<<<<<<< HEAD
        String uploadDir = "game-photo/" + game.getId();                    //mirar si se puede hacer if por aqui
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        return "redirect:/games";

=======
        return "redirect:/games";
>>>>>>> grupo1
    }
    @GetMapping("/games/new/{id}")
    String editGame(Model model, @PathVariable Long id){
        Game game = gamesService.findById(id);
        model.addAttribute("game", game);
        model.addAttribute( "title", "Edit Games");
        model.addAttribute("pegis", pegiService.allPegi()); // se utiliza para que se muestre la lista desplegable y hay que agregar un PegiService
        model.addAttribute("categories", categoryService.allCategories()); // se utiliza para que se muestre la lista desplegable y hay que agregar un CategoryService
        model.addAttribute("platform", platformService.allPlatform()); // se utiliza para que se muestre la lista desplegable y hay que agregar un CategoryService
        return "games/newgames";
    }

    @GetMapping("/games/delete/{id}")
    public String delete(@PathVariable Long id) {
        gamesService.delete(id);
        return "redirect:/games";
    }

}

