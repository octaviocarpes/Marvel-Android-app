package app.marvel.octaviocarpes.marveldata.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.R;
import app.marvel.octaviocarpes.marveldata.model.Comic;
import app.marvel.octaviocarpes.marveldata.model.Event;
import app.marvel.octaviocarpes.marveldata.model.Serie;
import app.marvel.octaviocarpes.marveldata.model.Story;

public class GridViewAdapter extends BaseAdapter {

    private Activity context;
    private List items;
    private LayoutInflater inflater;

    public GridViewAdapter(Activity context, List items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View gridView = view;
        if (view == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.comic_item, null);
        }
        setView(items.get(position), buildImage(gridView), buildTitle(gridView));
        return gridView;
    }

    private void setView(Object item, ImageView image, TextView title) {
        switch (item.getClass().getSimpleName()) {
            case "Comic":
                setComicItem((Comic)item, image, title);
                break;
            case "Event":
                setEventItem((Event)item, image, title);
                break;
            case "Story":
                setStoryItem((Story)item, image, title);
                break;
            case "Serie":
                setSerieItem((Serie)item, image, title);
                break;
        }
    }

    private void setComicItem(Comic comic, ImageView image, TextView title) {
        Picasso.get().load(comic.getThumbnail().getPath()).resize(350, 450).into(image);
        title.setText(comic.getName());
    }

    private void setEventItem(Event event, ImageView image, TextView title) {
        Picasso.get().load(event.getThumbnail().getPath()).resize(350, 450).into(image);
        title.setText(event.getName());
    }

    private void setStoryItem(Story story, ImageView image, TextView title) {
        Picasso.get().load(story.getThumbnail().getPath()).resize(350, 450).into(image);
        title.setText(story.getName());
    }

    private void setSerieItem(Serie serie, ImageView image, TextView title) {
        Picasso.get().load(serie.getThumbnail().getPath()).resize(350, 450).into(image);
        title.setText(serie.getName());
    }

    private ImageView buildImage(View gridView) {
        ImageView image = (ImageView) gridView.findViewById(R.id.comic_imageViewID);
        return image;
    }

    private TextView buildTitle(View gridView) {
        TextView title = (TextView) gridView.findViewById(R.id.comic_textViewID);
        return title;
    }
}
