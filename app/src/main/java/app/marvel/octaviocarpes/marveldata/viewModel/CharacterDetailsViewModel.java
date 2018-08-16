package app.marvel.octaviocarpes.marveldata.viewModel;

import android.arch.lifecycle.ViewModel;

import app.marvel.octaviocarpes.marveldata.repository.CharacterRepository;

public class CharacterDetailsViewModel extends ViewModel {

    public CharacterDetailsViewModel() {
    }

    public CharacterRepository getRepository() {
        return new CharacterRepository();
    }
}
