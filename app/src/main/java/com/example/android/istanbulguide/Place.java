package com.example.android.istanbulguide;

import android.content.Context;
import android.content.res.Resources;

/**
 * Created by omar on 7/1/16.
 */
public class Place {

    /** place latitude and longitude */
    private String lat, lng;

    /** place name */
    private String name;

    /** place address */
    private String address;

    /** place description */
    private String description;

    /** Image resource ID for the place */
    private int imageResourceId = NO_IMAGE_PROVIDED;

    /** Thumbnail Image resource ID for the place */
    private int thumbResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     *
     * @param name
     * @param address
     * @param description
     * @param imageResourceId
     * @param thumbResourceId
     * @param lat
     * @param lng
     */
    public Place(String name, String address, String description, int imageResourceId, int thumbResourceId, String lat, String lng) {
        this.name = name;
        this.address = address;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.thumbResourceId = thumbResourceId;
        this.lat = lat;
        this.lng = lng;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public int getThumbResourceId() {
        return thumbResourceId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public void setThumbResourceId(int thumbResourceId) {
        this.thumbResourceId = thumbResourceId;
    }


    // https://developers.google.com/maps/documentation/android-api/intents#display_a_map
    // geo:0,0?q=latitude,longitude(label)
    public String creatMapsURI() {
        return String.format("geo:%s,%s?q=%s,%s(%s)"
                , lat
                , lng
                , lat
                , lng
                , name);
    }


}
