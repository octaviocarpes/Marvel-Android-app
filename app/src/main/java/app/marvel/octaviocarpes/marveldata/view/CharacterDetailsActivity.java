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
import app.marvel.octaviocarpes.marveldata.adapter.CharacterDetailListViewAdapter;
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
    }


    private void setupView(Character character) {
        setupViewImage(character);
        setupViewText(character);
    }

    public void setupViewImage(Character character) {
        characterImage = (ImageView) findViewById(R.id.character_imageView_ID);
        Picasso.get().load(character.getThumbnail().getPath()).resize(300, 300).into(characterImage);
    }

    public void setupViewText(Character character) {
        characterTextView = (TextView) findViewById(R.id.character_name_textView_ID);
        characterTextView.setText(character.getName());
    }

}
