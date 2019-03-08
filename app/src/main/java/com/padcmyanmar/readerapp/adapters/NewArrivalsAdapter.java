package com.padcmyanmar.readerapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.readerapp.R;
import com.padcmyanmar.readerapp.view.holders.NewArrivalViewHolder;

public class NewArrivalsAdapter extends RecyclerView.Adapter<NewArrivalViewHolder> {

    @NonNull
    @Override
    public NewArrivalViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View viewItem = layoutInflater.inflate(R.layout.view_item_new_arrivals, viewGroup, false);
        return new NewArrivalViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull NewArrivalViewHolder newArrivalViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }
}
