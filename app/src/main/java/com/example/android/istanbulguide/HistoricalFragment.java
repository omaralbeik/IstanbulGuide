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
import android.widget.ListView;
import android.widget.AdapterView;

import com.example.android.istanbulguide.R;

import java.util.ArrayList;

/**
 * Fragment that displays Historical Places
 */
public class HistoricalFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_historical, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getResources().getString(R.string.historical_name_1),
                getResources().getString(R.string.historical_address_1),
                getResources().getString(R.string.historical_description_1),
                R.drawable.hagia_sophia,
                R.drawable.hagia_sophia_thumb,
                getResources().getString(R.string.historical_lat_1),
                getResources().getString(R.string.historical_lng_1)
        ));

        places.add(new Place(getResources().getString(R.string.historical_name_2),
                getResources().getString(R.string.historical_address_2),
                getResources().getString(R.string.historical_description_2),
                R.drawable.sultan_ahmad,
                R.drawable.sultan_ahmad_thumb,
                getResources().getString(R.string.historical_lat_2),
                getResources().getString(R.string.historical_lng_2)
        ));

        places.add(new Place(getResources().getString(R.string.historical_name_3),
                getResources().getString(R.string.historical_address_3),
                getResources().getString(R.string.historical_description_3),
                R.drawable.topkapi_palace,
                R.drawable.topkapi_palace_thumb,
                getResources().getString(R.string.historical_lat_3),
                getResources().getString(R.string.historical_lng_3)
        ));

        places.add(new Place(getResources().getString(R.string.historical_name_4),
                getResources().getString(R.string.historical_address_4),
                getResources().getString(R.string.historical_description_4),
                R.drawable.basilica_cistern,
                R.drawable.basilica_cistern_thumb,
                getResources().getString(R.string.historical_lat_4),
                getResources().getString(R.string.historical_lng_4)
        ));


        places.add(new Place(getResources().getString(R.string.historical_name_5),
                getResources().getString(R.string.historical_address_5),
                getResources().getString(R.string.historical_description_5),
                R.drawable.galata_tower,
                R.drawable.galata_tower_thumb,
                getResources().getString(R.string.historical_lat_5),
                getResources().getString(R.string.historical_lng_5)
        ));

        places.add(new Place(getResources().getString(R.string.historical_name_6),
                getResources().getString(R.string.historical_address_6),
                getResources().getString(R.string.historical_description_6),
                R.drawable.grand_bazaar,
                R.drawable.grand_bazaar_thumb,
                getResources().getString(R.string.historical_lat_6),
                getResources().getString(R.string.historical_lng_6)
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
