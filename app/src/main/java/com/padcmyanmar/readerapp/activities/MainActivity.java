package com.padcmyanmar.readerapp.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.padcmyanmar.readerapp.R;
import com.padcmyanmar.readerapp.adapters.NewArrivalsAdapter;
import com.padcmyanmar.readerapp.fragments.FeatureFragment;
import com.padcmyanmar.readerapp.fragments.PopularFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        showFeatureFragment();

        showPopularFragment();

        RecyclerView rvNewArrivals = findViewById(R.id.rv_arrivalNews);
        rvNewArrivals.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        NewArrivalsAdapter newArrivalAdapter = new NewArrivalsAdapter();
        rvNewArrivals.setAdapter(newArrivalAdapter);


    }

    private void showPopularFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frag_popular, PopularFragment.newInstance("showPopularFragment"))
                .commit();
    }

    private void showFeatureFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frag_feature, FeatureFragment.newInstance("showFeatureFragment"))
                .commit();
    }

}
