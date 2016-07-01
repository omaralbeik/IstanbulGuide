package com.example.android.istanbulguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by omar on 7/1/16.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (convertView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        Place currentPlace = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.nameTextView);
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.addressTextView);

        imageView.setImageResource(currentPlace.getThumbResourceId());

        nameTextView.setText(currentPlace.getName());
        addressTextView.setText(currentPlace.getAddress());

        return listItemView;
    }
}
