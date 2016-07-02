package com.example.android.istanbulguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        TextView descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);
        Button goToMapsButton = (Button) findViewById(R.id.goToMapsButton);

        // Get any data passed in from Fragment
        Intent detailsIntent = getIntent();

        // set image
        int imageId = detailsIntent.getIntExtra("imageId", -1);
        if (imageId!=-1){
            imageView.setImageResource(imageId);
        } else {
            imageView.setVisibility(View.GONE);
        }

        descriptionTextView.setText(detailsIntent.getStringExtra("description"));


        // Use the geographic coordinates to launch Google maps with pin at location
        final String locationURI = detailsIntent.getStringExtra("location");

        if (goToMapsButton != null) {

            goToMapsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.v("Coordinates", locationURI);
                    Uri gmmIntentUri = Uri.parse(locationURI);
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
            });
        }
    }
}
