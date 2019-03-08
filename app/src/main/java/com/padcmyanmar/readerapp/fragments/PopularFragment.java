package com.padcmyanmar.readerapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.readerapp.R;

public class PopularFragment extends Fragment {

    public static final String POPULAR_LIST_FRAGMENT = "POPULAR_LIST_FRAGMENT";

    public static PopularFragment newInstance(String dataToFragment) {
        PopularFragment fragment = new PopularFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_popular, container, false);
        return view;
    }
}
