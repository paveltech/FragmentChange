package com.example.lolipop.fragmentchange;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Fragment_2 extends Fragment {


    @BindView(R.id.edit_college)
    EditText college_name;
    @BindView(R.id.edit_varsity)
    EditText varsityName;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_2 , container , false);
        ButterKnife.bind(this , view);
        return view;
    }
}
