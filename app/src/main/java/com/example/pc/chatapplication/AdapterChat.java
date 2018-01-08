package com.example.pc.chatapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by PC on 1/4/2018.
 */

public class AdapterChat extends RecyclerView.Adapter<AdapterChat.RecyclerViewHolder> {

    private ArrayList<Model> mModelArray;
    private FragmentChat mContextChat;




    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txtName,txtInfo;
        public ImageView imgAvartar;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            txtName= itemView.findViewById(R.id.name_contact_tv);
            txtInfo= itemView.findViewById(R.id.info_contact_tv);
            imgAvartar= itemView.findViewById(R.id.avatar_img);
        }
        public void bindView(int position){
            txtName.setText(mModelArray.get(position).getName());
            txtInfo.setText(mModelArray.get(position).getInfo());
            imgAvartar.setImageResource(mModelArray.get(position).getImage());
        }


        @Override
        public void onClick(View view) {

        }
    }

    public AdapterChat(ArrayList<Model> mModelArray, FragmentChat mContextChat) {
        this.mModelArray = mModelArray;
        this.mContextChat = mContextChat;
    }

    public FragmentChat getmContextChat() {
        return mContextChat;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context= parent.getContext();
        LayoutInflater inflater= LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.custom_chat_item,parent,false);
        RecyclerViewHolder viewHolder= new RecyclerViewHolder(view);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        ((RecyclerViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {

        return mModelArray.size();
    }


}


