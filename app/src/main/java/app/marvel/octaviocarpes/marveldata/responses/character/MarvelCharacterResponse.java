package app.marvel.octaviocarpes.marveldata.responses.character;

import com.google.gson.annotations.SerializedName;

import app.marvel.octaviocarpes.marveldata.responses.character.CharacterDataContainerResponse;

public class MarvelCharacterResponse {

    @SerializedName("data")
    CharacterDataContainerResponse data;

    public CharacterDataContainerResponse getData() {
        return data;
    }

    public void setData(CharacterDataContainerResponse data) {
        this.data = data;
    }
}
