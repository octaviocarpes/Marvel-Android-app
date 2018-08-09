package app.marvel.octaviocarpes.marveldata.repository;

import java.util.ArrayList;
import java.util.List;

import app.marvel.octaviocarpes.marveldata.model.Character;

public class CharacterRepository {

    private List<Character> heroesDB;

    public CharacterRepository() {
        this.heroesDB = new ArrayList<>();
    }

    public List<Character> getHeroesDB() {
        return heroesDB;
    }

    public void setHeroesDB(List<Character> heroesDB) {
        this.heroesDB = heroesDB;
    }
}
