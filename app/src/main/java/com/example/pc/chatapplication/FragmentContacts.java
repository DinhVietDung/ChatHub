package com.example.pc.chatapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AlphabetIndexer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DINHVIETDUNG on 1/1/2018.
 */

public class FragmentContacts extends android.support.v4.app.Fragment {

    RecyclerView mRecyclerView;
    AdapterContact mAdapterContact;
    ArrayList<Model> mModelArray;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        mRecyclerView = view.findViewById(R.id.contact_rcv);
        mModelArray = Model.createNameModelList(20);
        mAdapterContact = new AdapterContact(mModelArray, FragmentContacts.this);
        mRecyclerView.setAdapter(mAdapterContact);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);
        return view;
    }

    public void split(String fullName, String name) {
        for (int i = 0; i < mModelArray.size(); i++) {
            String[] arrName = mModelArray.get(i).getName().split(" ");
            name = arrName[arrName.length - 1];
        }
    }


    public void sortModel(ArrayList<Model> mModelArray, int numContact) {
        for (int i = 0; i < numContact; i++) {
            for (int j = i + 1; j < numContact; j++) {
                String name1 = "";
                String name2 = "";


            }
        }


    }
