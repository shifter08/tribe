/*
 * Copyright (c) 2018. Garry Dexter Bayucan
 */

package com.garry.tribe_weather.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;

import com.garry.tribe_weather.R;
import com.garry.tribe_weather.fragments.DetailActivityFragment;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRASCURRENTDAY = "EXTRAS_CURRENT_DAY";
    private static final String LOG_TAG = DetailActivityFragment.class.getSimpleName();

    //Used for social sharing
    private ShareActionProvider mShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new DetailActivityFragment())
                    .commit();
        }
    }
}