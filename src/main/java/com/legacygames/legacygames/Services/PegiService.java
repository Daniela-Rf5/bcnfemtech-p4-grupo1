package com.legacygames.legacygames.Services;

import com.legacygames.legacygames.models.Pegi;
import com.legacygames.legacygames.models.PegiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PegiService {

    private PegiRepository pegiRepository;

    @Autowired
    public PegiService(PegiRepository pegiRepository) {
        this.pegiRepository = pegiRepository;
    }

    public List<Pegi> allPegis() {
        return (List<Pegi>) pegiRepository.findAll();
    }

    public Pegi getPegi(Long pegiId) {
        return pegiRepository.findById(pegiId).get();
    }
}