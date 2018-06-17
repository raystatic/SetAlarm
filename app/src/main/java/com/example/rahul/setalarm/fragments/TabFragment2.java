package com.example.rahul.setalarm.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahul.setalarm.R;

/**
 * Created by rahul on 17/6/18.
 */

public class TabFragment2 extends Fragment {

    public TabFragment2() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab2_fragment_layout,container,false);

        return view;
    }
}
