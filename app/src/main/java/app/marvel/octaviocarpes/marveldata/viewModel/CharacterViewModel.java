package app.marvel.octaviocarpes.marveldata.viewModel;


import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.model.Character;
import app.marvel.octaviocarpes.marveldata.repository.CharacterRepository;

public class CharacterViewModel extends ViewModel {

    private List<Character> characters;
    private MutableLiveData<List<Character>> charactersLiveData;
    private CharacterRepository repository;

    public CharacterViewModel() {
        this.repository = new CharacterRepository();
    }

    public MutableLiveData<List<Character>> getCharactersLiveData() {
        if (charactersLiveData == null) {
            charactersLiveData = new MutableLiveData<>();
        }
        return charactersLiveData;
    }

    public List<Character> getCharacters() {
        characters = repository.getcharactersDB();
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
