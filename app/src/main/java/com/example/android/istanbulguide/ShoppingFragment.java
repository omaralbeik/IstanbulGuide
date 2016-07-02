package com.example.android.istanbulguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ShoppingFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ShoppingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShoppingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shopping, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getResources().getString(R.string.shopping_name_1),
                getResources().getString(R.string.shopping_address_1),
                getResources().getString(R.string.shopping_description_1),
                Place.NO_IMAGE_PROVIDED,
                Place.NO_IMAGE_PROVIDED,
                getResources().getString(R.string.shopping_lat_1),
                getResources().getString(R.string.shopping_lng_1)
        ));

        places.add(new Place(getResources().getString(R.string.shopping_name_2),
                getResources().getString(R.string.shopping_address_2),
                getResources().getString(R.string.shopping_description_2),
                Place.NO_IMAGE_PROVIDED,
                Place.NO_IMAGE_PROVIDED,
                getResources().getString(R.string.shopping_lat_2),
                getResources().getString(R.string.shopping_lng_2)
        ));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place currentPlace = places.get(position);
                Intent detailsIntent = new Intent(getActivity(), DetailsActivity.class);
                detailsIntent.putExtra("description", currentPlace.getDescription());
                detailsIntent.putExtra("location", currentPlace.getMapsURI());
                detailsIntent.putExtra("imageId", currentPlace.getImageResourceId());
                startActivity(detailsIntent);
            }
        });

        return view;
    }
}
