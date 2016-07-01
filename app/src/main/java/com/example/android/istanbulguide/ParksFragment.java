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
 * Fragment that displays Parks
 */
public class ParksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_parks, container, false);

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getResources().getString(R.string.park_name_1),
                getResources().getString(R.string.park_address_1),
                getResources().getString(R.string.park_description_1),
                R.drawable.gulhane_parki,
                R.drawable.gulhane_parki_thumb,
                getResources().getString(R.string.park_lat_1),
                getResources().getString(R.string.park_lng_1)
        ));

        places.add(new Place(getResources().getString(R.string.park_name_2),
                getResources().getString(R.string.park_address_2),
                getResources().getString(R.string.park_description_2),
                R.drawable.emirgan_korusu,
                R.drawable.emirgan_korusu_thumb,
                getResources().getString(R.string.park_lat_2),
                getResources().getString(R.string.park_lng_2)
        ));

        places.add(new Place(getResources().getString(R.string.park_name_3),
                getResources().getString(R.string.park_address_3),
                getResources().getString(R.string.park_description_3),
                R.drawable.yildiz_park,
                R.drawable.yildiz_park_thumb,
                getResources().getString(R.string.park_lat_3),
                getResources().getString(R.string.park_lng_3)
        ));



        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) view.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return view;
    }

}
