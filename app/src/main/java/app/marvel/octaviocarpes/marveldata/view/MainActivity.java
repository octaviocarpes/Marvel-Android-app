package app.marvel.octaviocarpes.marveldata.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.crashlytics.android.Crashlytics;

import java.util.ArrayList;

import app.marvel.octaviocarpes.marveldata.R;
import app.marvel.octaviocarpes.marveldata.adapter.CharacterListViewAdapter;
import app.marvel.octaviocarpes.marveldata.model.Character;
import app.marvel.octaviocarpes.marveldata.model.Image;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends Activity {

    ListView characterListView;
    CharacterListViewAdapter characterListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

        characterListView = (ListView) findViewById(R.id.heroes_list_viewID);
        ArrayList heroes = new ArrayList();
        Image thumbMock = new Image("http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784", "jpg");
        heroes.add(new Character("Wolverine", thumbMock));
        heroes.add(new Character("Iron Man", thumbMock));
        heroes.add(new Character("Spider Man", thumbMock));
        characterListViewAdapter = new CharacterListViewAdapter(heroes, this);
        characterListView.setAdapter(characterListViewAdapter);
    }
}
