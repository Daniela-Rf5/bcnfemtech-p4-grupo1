package com.legacygames.legacygames.Services;

import com.legacygames.legacygames.models.Game;
import com.legacygames.legacygames.models.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GamesService {

    private final GamesRepository gamesRepository;

    @Autowired
    public GamesService(GamesRepository gamesRepository) {
        this.gamesRepository = gamesRepository;
    }
    public List<Game> allGames(){
        List<Game>allGames = (List<Game>) gamesRepository.findAll();
        return  allGames;

    }
    public void save(Game games){
        gamesRepository.save(games);
    }
    public Game findById(Long id){
        return gamesRepository.findById(id).orElse(null);

    }
    public void delete(Long id){
        gamesRepository.deleteById(id);
    }
}
