package app.marvel.octaviocarpes.marveldata.requests;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.model.Character;
import app.marvel.octaviocarpes.marveldata.responses.CharactersResponse;
import app.marvel.octaviocarpes.marveldata.services.CharactersService;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CharacterRequest {

    String CHARACTERS_URL = "http://gateway.marvel.com/v1/public/";

    private CharactersService service;
    private Retrofit retrofit;

    public static CharacterRequest instance;

    public static CharacterRequest getInstance() {
        if (instance == null) {
            instance = new CharacterRequest();
        }
        return instance;
    }

    private CharacterRequest() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(CHARACTERS_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.service = retrofit.create(CharactersService.class);
    }

    public Call<Character> getCharactersRequest() {
        return service.charactersList();
    }
}