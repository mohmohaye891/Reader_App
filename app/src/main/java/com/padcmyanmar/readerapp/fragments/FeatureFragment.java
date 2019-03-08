package com.padcmyanmar.readerapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.readerapp.R;

public class FeatureFragment extends Fragment {

    private static final String ARG_DATA_TO_FRAGMENT = "ARG_DATA_TO_FRAGMENT";

    public static FeatureFragment newInstance(String dataToFragment) {
        FeatureFragment fragment = new FeatureFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_DATA_TO_FRAGMENT, dataToFragment);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feature, container, false);
        return view;
    }
}
