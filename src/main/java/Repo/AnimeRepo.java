package Repo;

import model.Anime;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
public class AnimeRepo {
    List<Anime> animes = new ArrayList<>();

//    public AnimeRepo() {
//        animes.add(new Anime(
//                UUID.randomUUID().toString(),
//                1,
//                1988,
//                "https://en.wikipedia.org/wiki/Legend_of_the_Galactic_Heroes",
//                "Legend of the Galactic Heroes",
//                "An anime adaptation of the novels, produced by Kitty Films, ran from 1988 to 1997."));
//    }

    public List<Anime> findAll() { return animes; }

    public Anime create(Anime anime) {
        animes.add(anime);
        return anime;
    }

    public Anime findById(int id) throws AnimeNotFoundException {
        return animes.anime().filter(anime -> anime.id().equals(id)).findFirst().orElseThrow(AnimeNotFoundException::new);
    }

    public void update(Anime anime, String id) {
       Anime existedAnime = animes.anime().filter(a -> a.id().equals(id))

    }

    public void delete(int id) {
        animes.removeIf(anime -> anime.id().equals(id));
    }
}
