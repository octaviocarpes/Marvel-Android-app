package app.marvel.octaviocarpes.marveldata.view;

import android.arch.lifecycle.ViewModelProviders;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import app.marvel.octaviocarpes.marveldata.R;
import app.marvel.octaviocarpes.marveldata.adapter.ViewPagerAdapter;
import app.marvel.octaviocarpes.marveldata.model.Character;
import app.marvel.octaviocarpes.marveldata.model.Comic;
import app.marvel.octaviocarpes.marveldata.utils.IntentDataUtils;
import app.marvel.octaviocarpes.marveldata.view.fragments.ComicsFragment;
import app.marvel.octaviocarpes.marveldata.viewModel.CharacterDetailsViewModel;

public class CharacterDetailsActivity extends AppCompatActivity {

    GridView gridView;
    TabLayout tabLayout;
    AppBarLayout appBarLayout;
    ViewPager viewPager;

    private Character character;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_details);
        Bundle bundle = getIntent().getExtras();
        Integer position = bundle.getInt(IntentDataUtils.CHARACTER_POSITION);
        final CharacterDetailsViewModel mViewModel = ViewModelProviders.of(this).get(CharacterDetailsViewModel.class);
        character = mViewModel.getRepository().getcharactersDB().get(position);

        tabLayout = (TabLayout) findViewById(R.id.character_detail_tabLayoutID);
        appBarLayout = (AppBarLayout) findViewById(R.id.character_detail_appBarLayoutID);
        viewPager = (ViewPager) findViewById(R.id.character_detail_viewPagerID);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ComicsFragment(), "Comics");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
