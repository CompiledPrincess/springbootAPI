package Controller;

import Repo.AnimeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animes")
public class AnimeController {
    private final AnimeRepo animeRepo;
    
    @Autowired
    public AnimeController(AnimeRepo animeRepo) { this.animeRepo = animeRepo;}
}
