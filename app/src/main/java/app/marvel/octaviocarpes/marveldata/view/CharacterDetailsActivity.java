package app.marvel.octaviocarpes.marveldata.view;

import android.arch.lifecycle.ViewModelProviders;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import app.marvel.octaviocarpes.marveldata.R;
import app.marvel.octaviocarpes.marveldata.adapter.ViewPagerAdapter;
import app.marvel.octaviocarpes.marveldata.fragments.ComicsFragment;
import app.marvel.octaviocarpes.marveldata.fragments.EventsFragment;
import app.marvel.octaviocarpes.marveldata.fragments.SeriesFragment;
import app.marvel.octaviocarpes.marveldata.fragments.StoriesFragment;
import app.marvel.octaviocarpes.marveldata.model.Character;
import app.marvel.octaviocarpes.marveldata.utils.IntentDataUtils;
import app.marvel.octaviocarpes.marveldata.viewModel.CharacterDetailsViewModel;

public class CharacterDetailsActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;

    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    private Character character;

    CharacterDetailsViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_details);
        Bundle bundle = getIntent().getExtras();

        Integer position = bundle.getInt(IntentDataUtils.CHARACTER_POSITION);
        mViewModel = ViewModelProviders.of(this).get(CharacterDetailsViewModel.class);

        instantiateComponents();
        character = loadCharacter(position);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        addFragmentsToTabLayout();
        setViewPager();
        setView(character);
    }

    private void instantiateComponents() {
        tabLayout = (TabLayout) findViewById(R.id.character_detail_tabLayoutID);
        appBarLayout = (AppBarLayout) findViewById(R.id.character_detail_appBarLayoutID);
        viewPager = (ViewPager) findViewById(R.id.character_detail_viewPagerID);
    }

    private Character loadCharacter(Integer position) {
        return mViewModel.getRepository().getcharactersDB().get(position);
    }

    private void addFragmentsToTabLayout() {
        adapter.addFragment(buildComicsFragment(), "Comics");
        adapter.addFragment(buildEventsFragment(), "Events");
        adapter.addFragment(buildSeriesFragment(), "Series");
        adapter.addFragment(buildStoriesFragment(), "Stories");
    }

    private ComicsFragment buildComicsFragment() {
        ComicsFragment comicsFragment = new ComicsFragment();
        comicsFragment.setComics(character.getComics());
        comicsFragment.setContext(CharacterDetailsActivity.this);
        return comicsFragment;
    }

    private EventsFragment buildEventsFragment() {
        EventsFragment eventsFragment = new EventsFragment();
        eventsFragment.setEvents(character.getEvents());
        eventsFragment.setContext(CharacterDetailsActivity.this);
        return eventsFragment;
    }

    private SeriesFragment buildSeriesFragment() {
        SeriesFragment seriesFragment = new SeriesFragment();
        seriesFragment.setSeries(character.getSeries());
        seriesFragment.setContext(CharacterDetailsActivity.this);
        return seriesFragment;
    }

    private StoriesFragment buildStoriesFragment() {
        StoriesFragment storiesFragment = new StoriesFragment();
        storiesFragment.setStories(character.getStories());
        storiesFragment.setContext(CharacterDetailsActivity.this);
        return storiesFragment;
    }

    private void setViewPager() {
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setView(Character character) {
        setCharacterImage(character);
        setCharacterName(character);
    }

    private void setCharacterImage(Character character) {
        ImageView image = (ImageView) findViewById(R.id.characater_imageViewID);
        Picasso.get().load(character.getThumbnail().getPath()).resize(250, 250).into(image);
    }

    private void setCharacterName(Character character) {
        TextView name = (TextView) findViewById(R.id.characater_textViewID);
        name.setText(character.getName());
    }
}
