package app.marvel.octaviocarpes.marveldata.adapter;


import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.R;
import app.marvel.octaviocarpes.marveldata.model.Character;
import app.marvel.octaviocarpes.marveldata.utils.IntentDataUtils;
import app.marvel.octaviocarpes.marveldata.view.CharacterDetailsActivity;

public class CharacterListViewAdapter extends BaseAdapter {

    private List<Character> characters;
    private Activity context;

    public CharacterListViewAdapter(List<Character> characters, Activity context) {
        this.characters = characters;
        this.context = context;
    }

    @Override
    public int getCount() {
        return characters.size();
    }

    @Override
    public Object getItem(int position) {
        return characters.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rowView = context.getLayoutInflater().inflate(R.layout.character_list_item, viewGroup, false);
        Character character = characters.get(position);
        setupViewInfo(character, rowView);
        setupOnClick(rowView, position);
        return rowView;
    }

    private void setupOnClick(View rowView, final int position) {
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToCharacterDetails(position);
            }
        });
    }

    private void navigateToCharacterDetails(Integer position) {
        Intent intent = new Intent(context, CharacterDetailsActivity.class);
        intent.putExtra(IntentDataUtils.CHARACTER_POSITION, position);
        context.startActivity(intent);
    }

    private void setupViewInfo(Character character, View rowView) {
        TextView heroTextView = (TextView) rowView.findViewById(R.id.character_text_viewID);
        ImageView heroImageView = (ImageView) rowView.findViewById(R.id.character_image_viewID);
        heroTextView.setText(character.getName());
        Picasso.get().load(character.getThumbnail().getPath()).resize(350, 350).into(heroImageView);
    }
}
