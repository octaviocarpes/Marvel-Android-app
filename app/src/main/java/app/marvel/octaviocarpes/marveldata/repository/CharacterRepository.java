package app.marvel.octaviocarpes.marveldata.repository;

import java.util.ArrayList;
import java.util.List;

import app.marvel.octaviocarpes.marveldata.model.Character;
import app.marvel.octaviocarpes.marveldata.model.Image;

public class CharacterRepository {

    private List<Character> charactersDB;

    public CharacterRepository() {
        this.charactersDB = new ArrayList<>();
        charactersDB.add(new Character("Wolverine", new Image("https://img.elo7.com.br/product/zoom/113FE59/painel-wolverine-1-5mx1-0m-mod-decoracao-de-festa.jpg", ".jpg")));
        charactersDB.add(new Character("Spider-Man", new Image("https://img.purch.com/o/aHR0cDovL3d3dy5uZXdzYXJhbWEuY29tL2ltYWdlcy9pLzAwMC8yMjEvOTU2L2kwMi9BU01GQ0JEXzEuanBn", ".jpg")));
        charactersDB.add(new Character("Iron Man", new Image("https://lumiere-a.akamaihd.net/v1/images/usa_avengers_chi_ironman_n_cf2a66b6.png?region=0%2C0%2C300%2C300", ".jpg")));
    }

    public List<Character> getcharactersDB() {
        return charactersDB;
    }

    public void setcharactersDB(List<Character> charactersDB) {
        this.charactersDB = charactersDB;
    }
}
