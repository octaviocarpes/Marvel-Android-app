package app.marvel.octaviocarpes.marveldata.responses.character;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.responses.character.CharacterResponse;

public class CharacterDataContainerResponse {

    @SerializedName("results")
    private List<CharacterResponse> results;

    public List<CharacterResponse> getResults() {
        return results;
    }

    public void setResults(List<CharacterResponse> results) {
        this.results = results;
    }
}
