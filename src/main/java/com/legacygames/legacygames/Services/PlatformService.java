package com.legacygames.legacygames.Services;

import com.legacygames.legacygames.models.Platform;
import com.legacygames.legacygames.models.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatformService {

    private PlatformRepository platformRepository;

    @Autowired
    public PlatformService(PlatformRepository platformRepository) {
        this.platformRepository = platformRepository;
    }

    public List<Platform> allPlatform() {
        return (List<Platform>) platformRepository.findAll();
    }

    public Platform getPlatform(Long platformId) {

        return platformRepository.findById(platformId).get();
    }
}
