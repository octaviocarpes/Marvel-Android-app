package app.marvel.octaviocarpes.marveldata.view;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


import com.crashlytics.android.Crashlytics;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.R;
import app.marvel.octaviocarpes.marveldata.adapter.CharacterListViewAdapter;
import app.marvel.octaviocarpes.marveldata.model.Character;
import app.marvel.octaviocarpes.marveldata.requests.CharacterRequest;
import app.marvel.octaviocarpes.marveldata.responses.CharactersResponse;
import app.marvel.octaviocarpes.marveldata.viewModel.CharacterViewModel;
import io.fabric.sdk.android.Fabric;
import retrofit2.Callback;
import retrofit2.Call;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ListView characterListView;
    CharacterListViewAdapter characterListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

        characterListView = (ListView) findViewById(R.id.characters_list_viewID);

        final CharacterViewModel mViewModel = ViewModelProviders.of(this).get(CharacterViewModel.class);

        Call<Character> characters = CharacterRequest.getInstance().getCharactersRequest();

        characters.enqueue(new Callback<Character>() {
            @Override
            public void onResponse(Call<Character> call, Response<Character> response) {
                if (response.isSuccessful()) {
                    System.out.println(response.body().toString());
                    System.out.println(response.body().getName());
                    System.out.println(response.body().toString());
                } else {
                    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
                    System.out.println("AAAAND YOU FAILED");
                    System.out.println(response);
                    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
                }
            }

            @Override
            public void onFailure(Call<Character> call, Throwable t) {
                System.out.println("**********************************");
                System.out.println("Error!");
                System.out.println(call.request().toString());
                System.out.println(call.request().body());
                System.out.println(t.getMessage());
                System.out.println("**********************************");
            }
        });

        loadCharacters(mViewModel);
    }

    private void loadCharacters(CharacterViewModel mViewModel) {
        List<Character> characters = mViewModel.getRepository().getcharactersDB();
        characterListViewAdapter = new CharacterListViewAdapter(characters, this);
        characterListView.setAdapter(characterListViewAdapter);
    }
}
