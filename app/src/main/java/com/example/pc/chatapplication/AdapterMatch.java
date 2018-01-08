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
 * Created by PC on 1/6/2018.
 */

public class AdapterMatch extends RecyclerView.Adapter {

    private ArrayList<Model> mModelArray;
    private FragmentMatch mContextMatch;

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txtName,txtInfo1,txtInfo2,txtChatMatch;
        public ImageView imgAvartar;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            txtName= itemView.findViewById(R.id.name_match_tv);
            txtInfo1= itemView.findViewById(R.id.info1_match_tv);
            txtInfo2=itemView.findViewById(R.id.info2_match_tv);
            txtChatMatch= itemView.findViewById(R.id.chat_match_tv);
            imgAvartar= itemView.findViewById(R.id.match_imv);
        }
        public void bindView(int position){
            txtName.setText(mModelArray.get(position).getName());
            txtInfo1.setText(mModelArray.get(position).getInfo());
            txtInfo2.setText(mModelArray.get(position).getInfo2());
            txtChatMatch.setText(mModelArray.get(position).getChat());
            imgAvartar.setImageResource(mModelArray.get(position).getImage());
        }


        @Override
        public void onClick(View view) {

        }
    }

    public AdapterMatch(ArrayList<Model> mModelArray, FragmentMatch mContextMatch) {
        this.mModelArray = mModelArray;
        this.mContextMatch = mContextMatch;
    }

    public FragmentMatch getmContextMatch() {
        return mContextMatch;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context= parent.getContext();
        LayoutInflater inflater= LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.custom_match_item,parent,false);
        AdapterMatch.RecyclerViewHolder viewHolder= new AdapterMatch.RecyclerViewHolder(view);
        return new AdapterMatch.RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((RecyclerViewHolder)holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return mModelArray.size();
    }
}
