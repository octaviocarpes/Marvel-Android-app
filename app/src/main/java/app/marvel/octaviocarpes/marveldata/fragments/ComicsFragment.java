package app.marvel.octaviocarpes.marveldata.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.List;

import app.marvel.octaviocarpes.marveldata.R;
import app.marvel.octaviocarpes.marveldata.adapter.ComicsGridViewAdaprter;
import app.marvel.octaviocarpes.marveldata.model.Comic;
import app.marvel.octaviocarpes.marveldata.view.CharacterDetailsActivity;

public class ComicsFragment extends Fragment {

    private Activity context;
    private View view;
    private GridView gridView;
    private List<Comic> comics;

    public ComicsFragment() {
    }

    @Nullable
    @Override
    public Activity getContext() {
        return context;
    }

    public void setContext(Activity context) {
        this.context = context;
    }

    public List<Comic> getComics() {
        return comics;
    }

    public void setComics(List<Comic> comics) {
        this.comics = comics;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.comics_fragment, container, false);
        gridView = (GridView) view.findViewById(R.id.character_detail_comics_gridViewID);
        ComicsGridViewAdaprter adapter = new ComicsGridViewAdaprter(context, comics);
        gridView.setAdapter(adapter);
        return view;
    }
}
