package app.marvel.octaviocarpes.marveldata.services;

import app.marvel.octaviocarpes.marveldata.model.Character;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CharactersService {

    @GET("characters?ts=1&apikey=4a68b55a579a4dd98a082c0133ebdad5&hash=2e86cfeb04142bfc8b0a11ab5ffa52de")
    Call<Character> charactersList();
}
