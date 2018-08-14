package app.marvel.octaviocarpes.marveldata.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.marvel.octaviocarpes.marveldata.R;

public class StoriesFragment extends Fragment {
    private View view;

    public StoriesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.stories_fragment, container, false);
        return view;
    }
}
