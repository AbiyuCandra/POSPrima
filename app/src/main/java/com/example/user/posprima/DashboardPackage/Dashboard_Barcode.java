package com.example.user.posprima.DashboardPackage;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.posprima.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Dashboard_Barcode extends Fragment {


    public Dashboard_Barcode() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard_barcode, container, false);
    }

}
