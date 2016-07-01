package com.example.android.istanbulguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.istanbulguide.R;

import java.util.ArrayList;

/**
 * Fragment that displays Restaurants and coffeehouses
 */
public class RestaurantsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);

        ArrayList<Place> places = new ArrayList<Place>();


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return view;
    }
}
