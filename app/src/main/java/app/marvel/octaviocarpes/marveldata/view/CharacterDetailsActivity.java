package app.marvel.octaviocarpes.marveldata.view;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.R;
import app.marvel.octaviocarpes.marveldata.model.Character;
import app.marvel.octaviocarpes.marveldata.utils.IntentDataUtils;
import app.marvel.octaviocarpes.marveldata.viewModel.CharacterDetailsViewModel;

public class CharacterDetailsActivity extends AppCompatActivity {

    private ListView characterInfo;
    private Button comicsButton;
    private Button seriesButton;
    private Button eventsButton;
    private Button storiesButton;
    private ImageView characterImage;
    private TextView characterTextView;

    private Character character;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_details);
        Bundle bundle = getIntent().getExtras();
        Integer position = bundle.getInt(IntentDataUtils.CHARACTER_POSITION);
        final CharacterDetailsViewModel mViewModel = ViewModelProviders.of(this).get(CharacterDetailsViewModel.class);
        character = mViewModel.getRepository().getcharactersDB().get(position);
        setupView(character);
//        Picasso.get().load(character.getThumbnail().getPath()).resize(350, 350).into(characterImage);
//        characterTextView.setText(character.getName());
    }

    private void setupView(Character character) {
        setupViewImage(character);
        setupViewText(character);
        setupViewList(character.getComics());
        setupViewButtons(character);
    }

    public void setupViewImage(Character character) {
        characterImage = (ImageView) findViewById(R.id.character_image_viewID);
    }

    public void setupViewText(Character character) {
        characterTextView = (TextView) findViewById(R.id.character_text_viewID);
    }

    public void setupViewList(List listInfo) {
        characterInfo = (ListView) findViewById(R.id.character_data_list_view_ID);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listInfo);
        characterInfo.setAdapter(adapter);
    }

    public void setupViewButtons(final Character character) {
        setComicsButton(character);
        setEventsButton(character);
        setStoriesButton(character);
        setSeriesButton(character);
    }

    public void setComicsButton(final Character character) {
        comicsButton = (Button) findViewById(R.id.character_comics_button_ID);
        comicsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupViewList(character.getComics());
            }
        });
    }

    public void setEventsButton(final Character character) {
        eventsButton = (Button) findViewById(R.id.character_events_button_ID);
        eventsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupViewList(character.getEvents());
            }
        });
    }

    public void setSeriesButton(final Character character) {
        seriesButton = (Button) findViewById(R.id.character_series_button_ID);
        seriesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupViewList(character.getSeries());
            }
        });
    }

    public void setStoriesButton(final Character character) {
        storiesButton = (Button) findViewById(R.id.character_stories_button_ID);
        storiesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupViewList(character.getStories());
            }
        });
    }
}
