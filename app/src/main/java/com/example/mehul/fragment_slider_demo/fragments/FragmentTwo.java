package com.example.mehul.fragment_slider_demo.fragments;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.mehul.fragment_slider_demo.R;

import java.util.ArrayList;


/**
 * Created by Mehul on 03-Dec-2015.
 */
public class FragmentTwo extends Fragment
{
    private ListView listView;
    TypedArray allContacts;
    ArrayList<String> allContactNames = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_two, null);

        return rootView;
    }


}
