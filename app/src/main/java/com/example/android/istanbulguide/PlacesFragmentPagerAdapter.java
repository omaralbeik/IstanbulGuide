package com.example.android.istanbulguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by omar on 7/1/16.
 */
public class PlacesFragmentPagerAdapter extends FragmentPagerAdapter {

    public PlacesFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new HistoricalFragment();
            case 1:
                return new ParksFragment();
            case 2:
                return new FoodFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "HISTORICAL";
            case 1:
                return "PARKS";
            case 2:
                return "FOOD";
            default:
                return super.getPageTitle(position);
        }
    }
}
