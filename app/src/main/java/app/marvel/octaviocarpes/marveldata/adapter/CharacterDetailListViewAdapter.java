package app.marvel.octaviocarpes.marveldata.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.R;
import app.marvel.octaviocarpes.marveldata.model.Comic;
import app.marvel.octaviocarpes.marveldata.model.Event;
import app.marvel.octaviocarpes.marveldata.model.Serie;
import app.marvel.octaviocarpes.marveldata.model.Story;

public class CharacterDetailListViewAdapter extends BaseAdapter {

    List<Object> items;
    Activity context;

    public CharacterDetailListViewAdapter(List<Object> items, Activity context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rowView = context.getLayoutInflater().inflate(R.layout.character_details_list_item, viewGroup, false);
        Object object = items.get(position);
        setupViewInfo(object, rowView);
        return rowView;
    }

    private void setupViewInfo(Object object, View rowView) {
        if (object instanceof Comic) {
            setComicsList(rowView, (Comic) object);
        } else if (object instanceof Event) {
            setEventList(rowView, (Event) object);
        } else if (object instanceof Serie) {
            setSeriesList(rowView, (Serie) object);
        } else {
            setStoriesList(rowView, (Story) object);
        }
    }

    private void setComicsList(View rowView, Comic comic) {
        TextView comicName = (TextView) rowView.findViewById(R.id.character_data_list_item_ID);
        TextView URI = (TextView) rowView.findViewById(R.id.character_data_list_subitem_ID);
        comicName.setText(comic.getName());
        URI.setText(comic.getResourceURI());
    }

    private void setEventList(View rowView, Event event) {
        TextView eventName = (TextView) rowView.findViewById(R.id.character_data_list_item_ID);
        TextView URI = (TextView) rowView.findViewById(R.id.character_data_list_subitem_ID);
        eventName.setText(event.getName());
        URI.setText(event.getResourceURI());
    }

    private void setSeriesList(View rowView, Serie serie) {
        TextView serieName = (TextView) rowView.findViewById(R.id.character_data_list_item_ID);
        TextView URI = (TextView) rowView.findViewById(R.id.character_data_list_subitem_ID);
        serieName.setText(serie.getName());
        URI.setText(serie.getResourceURI());
    }

    private void setStoriesList(View rowView, Story story) {
        TextView storyName = (TextView) rowView.findViewById(R.id.character_data_list_item_ID);
        TextView URI = (TextView) rowView.findViewById(R.id.character_data_list_subitem_ID);
        storyName.setText(story.getName());
        URI.setText(story.getResourceURI());
    }
}
