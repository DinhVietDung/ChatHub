package com.example.pc.chatapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by PC on 12/29/2017.
 */

public class FragmentChat extends Fragment {

    RecyclerView mRecyclerView;
    AdapterChat mAdapterChat;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.falgment_chat, container, false);
    }
}
