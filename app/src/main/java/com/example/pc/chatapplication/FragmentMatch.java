package com.example.pc.chatapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by PC on 1/4/2018.
 */

public class FragmentMatch extends Fragment {

    RecyclerView mRecyclerView;
    AdapterMatch mAdapterMatch;
    ArrayList<Model> mModelArray;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_match, container, false);
        mRecyclerView= view.findViewById(R.id.match_rcv);
        mModelArray = Model.createModelMatchList(20);
        mAdapterMatch = new AdapterMatch(mModelArray,FragmentMatch.this);
        mRecyclerView.setAdapter(mAdapterMatch);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);
        return view;
    }
}
