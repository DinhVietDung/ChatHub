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
 * Created by PC on 12/29/2017.
 */

public class FragmentChat extends Fragment {

    RecyclerView mRecyclerView;
    AdapterChat mAdapterChat;
    ArrayList<Model> mModelArray;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_chat, container, false);
        mRecyclerView= view.findViewById(R.id.chat_rcv);
        mModelArray = Model.createModelChatList(20);
        mAdapterChat = new AdapterChat(mModelArray,FragmentChat.this);
        mRecyclerView.setAdapter(mAdapterChat);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);
        return view;




    }




}
