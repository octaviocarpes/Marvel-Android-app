package app.marvel.octaviocarpes.marveldata.viewModel;


import android.arch.lifecycle.ViewModel;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.model.Character;
import app.marvel.octaviocarpes.marveldata.repository.CharacterRepository;

public class CharacterViewModel extends ViewModel {

    private List<Character> characters;
    private CharacterRepository repository;

    public CharacterViewModel() {
    }

    public CharacterRepository getRepository() {
        return new CharacterRepository();
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
