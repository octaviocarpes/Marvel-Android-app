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
import app.marvel.octaviocarpes.marveldata.viewModel.CharacterViewModel;
import io.fabric.sdk.android.Fabric;

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
        loadCharacters(mViewModel);
    }

    private void loadCharacters(CharacterViewModel mViewModel) {
        List<Character> characters = mViewModel.getRepository().getcharactersDB();
        characterListViewAdapter = new CharacterListViewAdapter(characters, this);
        characterListView.setAdapter(characterListViewAdapter);
    }
}
