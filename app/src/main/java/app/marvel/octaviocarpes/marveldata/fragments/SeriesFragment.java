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
import app.marvel.octaviocarpes.marveldata.adapter.GridViewAdapter;
import app.marvel.octaviocarpes.marveldata.model.Event;
import app.marvel.octaviocarpes.marveldata.model.Serie;

public class SeriesFragment extends Fragment {

    private View view;
    private Activity context;
    private GridView gridView;
    private List<Serie> series;

    public SeriesFragment() {
    }

    @Nullable
    @Override
    public Activity getContext() {
        return context;
    }

    public void setContext(Activity context) {
        this.context = context;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.series_fragment, container, false);
        gridView = (GridView) view.findViewById(R.id.character_detail_series_gridViewID);
        GridViewAdapter adapter = new GridViewAdapter(context, series);
        gridView.setAdapter(adapter);
        return view;
    }
}
