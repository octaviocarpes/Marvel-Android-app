package app.marvel.octaviocarpes.marveldata.adapter;

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

public class ComicsDetailGridAdapter extends BaseAdapter {

    private List<Comic> items;

    private Context context;

    public ComicsDetailGridAdapter(List items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.items.size();
    }

    @Override
    public Object getItem(int i) {
        return this.items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View gridView = view;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.comics_content, null);
        }

        ImageView image = (ImageView) gridView.findViewById(R.id.comic_imageViewID);
        TextView title = (TextView) gridView.findViewById(R.id.comic_textView_ID);

        title.setText(items.get(i).getName());
        return gridView;
    }
}
