package com.example.roomy.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.roomy.R;

public class AdapterGridItem extends RecyclerView.Adapter<AdapterGridItem.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder( View view ){
            super( view );
        }

    }

    @NonNull
    @Override
    public AdapterGridItem.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.grid_item_bills, parent, false);

        return new AdapterGridItem.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterGridItem.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
