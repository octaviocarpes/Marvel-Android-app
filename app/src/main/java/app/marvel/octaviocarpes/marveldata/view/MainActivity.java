package app.marvel.octaviocarpes.marveldata.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


import com.crashlytics.android.Crashlytics;

import java.util.ArrayList;
import java.util.List;

import app.marvel.octaviocarpes.marveldata.R;
import app.marvel.octaviocarpes.marveldata.adapter.CharacterListViewAdapter;
import app.marvel.octaviocarpes.marveldata.model.Character;
import app.marvel.octaviocarpes.marveldata.requests.CharacterRequest;
import app.marvel.octaviocarpes.marveldata.responses.character.CharacterResponse;
import app.marvel.octaviocarpes.marveldata.responses.character.MarvelCharacterResponse;
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

        final Observer<List<Character>> observer = new Observer<List<Character>>() {
            @Override
            public void onChanged(@Nullable final List<Character> newCharacters) {
                List<Character> characters = mViewModel.getCharacters();
                characterListViewAdapter = new CharacterListViewAdapter(characters, MainActivity.this);
                characterListView.setAdapter(characterListViewAdapter);
                characterListViewAdapter.notifyDataSetChanged();
            }
        };

        // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.
        mViewModel.getCharactersLiveData().observe(this, observer);
    }
}
