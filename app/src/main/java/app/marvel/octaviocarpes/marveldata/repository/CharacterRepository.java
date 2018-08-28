package app.marvel.octaviocarpes.marveldata.repository;

import java.util.ArrayList;
import java.util.List;

import app.marvel.octaviocarpes.marveldata.model.Character;
import app.marvel.octaviocarpes.marveldata.requests.CharacterRequest;
import app.marvel.octaviocarpes.marveldata.responses.character.CharacterResponse;
import app.marvel.octaviocarpes.marveldata.responses.character.MarvelCharacterResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CharacterRepository {

    private List<Character> characterList;
    private Call<MarvelCharacterResponse> characters;

    public CharacterRepository() {
        this.characterList = new ArrayList<>();
        characters = CharacterRequest.getInstance().getCharactersRequest();
    }

    public List<Character> getcharactersDB() {
        characters.enqueue(new Callback<MarvelCharacterResponse>() {
            @Override
            public void onResponse(Call<MarvelCharacterResponse> call, Response<MarvelCharacterResponse> response) {
                if (response.isSuccessful()) {
                    for (CharacterResponse characterResponse: response.body().getData().getResults()
                         ) {
                        characterList.add(new Character(characterResponse.getName(),characterResponse.getImage()));
                        System.out.println(characterList);
                    }
                } else {

                }
            }

            @Override
            public void onFailure(Call<MarvelCharacterResponse> call, Throwable t) {
                System.out.println("Erro getting heroes");
            }
        });

        return characterList;
    }

    public void setcharactersDB(List<Character> charactersDB) {
        this.characterList = charactersDB;
    }
}
