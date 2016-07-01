package com.example.android.istanbulguide;

/**
 * Created by omar on 7/1/16.
 */
public class Place {

    /** place latitude and longitude */
    private double lat, lng;

    /** place name */
    private String name;

    /** place description */
    private String description;

    /** Image resource ID for the place */
    private int imageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * create a new place
     * @param name
     * @param description
     * @param imageResourceId
     * @param lat
     * @param lng
     */
    public Place(String name, String description, int imageResourceId, double lat, double lng) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.lat = lat;
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }


    // https://developers.google.com/maps/documentation/android-api/intents#display_a_map
    // geo:0,0?q=latitude,longitude(label)
    public String creatMapsURI() {
        return String.format("geo:%f,%f?q=%f,%f(%s)"
                , lat
                , lng
                , lat
                , lng
                , name);
    }


}
