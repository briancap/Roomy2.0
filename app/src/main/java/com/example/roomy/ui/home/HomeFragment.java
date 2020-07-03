package com.example.roomy.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.roomy.R;
import com.example.roomy.adapters.AdapterGridItem;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    RecyclerView mGridBills;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        mGridBills = rootView.findViewById( R.id.home_grid_bills );
        mGridBills.setHasFixedSize( true );
        int numberOfColumns = 4;
        mGridBills.setLayoutManager(new GridLayoutManager(getActivity().getApplicationContext(), numberOfColumns));
        AdapterGridItem adapterGridItem = new AdapterGridItem();
        mGridBills.setAdapter( adapterGridItem );


        /*
        final TextView textView = root.findViewById(R.id.text_home);

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

         */
        return rootView;
    }
}