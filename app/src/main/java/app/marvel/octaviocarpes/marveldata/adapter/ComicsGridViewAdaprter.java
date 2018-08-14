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

public class ComicsGridViewAdaprter extends BaseAdapter {

    private Activity context;
    private List<Comic> comics;
    private LayoutInflater inflater;

    public ComicsGridViewAdaprter(Activity context, List<Comic> comics) {
        this.context = context;
        this.comics = comics;
    }

    @Override
    public int getCount() {
        return comics.size();
    }

    @Override
    public Object getItem(int i) {
        return comics.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View gridView = view;

        if (view == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.comic_item, null);
        }

        ImageView image = (ImageView) gridView.findViewById(R.id.comic_imageViewID);
        TextView title = (TextView) gridView.findViewById(R.id.comic_textViewID);
        Picasso.get().load(comics.get(i).getThumbnail().getPath()).resize(350, 450).into(image);
        title.setText(comics.get(i).getName());
        return gridView;
    }
}
