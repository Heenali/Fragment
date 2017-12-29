package com.example.mehul.fragment_slider_demo.fragments;


import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.mehul.fragment_slider_demo.R;

import java.util.ArrayList;

/**
 * Created by Mehul Rughani on 01-Dec-2015.
 */
public class FragmentOne extends Fragment {

    private GridView gridView;
    ArrayList<Drawable> allDrawableImages = new ArrayList<>();
    private TypedArray allImages;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_one, null);

        return rootView;
    }


}
