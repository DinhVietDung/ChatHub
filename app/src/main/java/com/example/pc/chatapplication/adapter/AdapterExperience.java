package com.example.pc.chatapplication.adapter;

import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pc.chatapplication.R;
import com.example.pc.chatapplication.datatest.Model;
import com.example.pc.chatapplication.fragment.FragmentContacts;

import java.util.ArrayList;

/**
 * Created by PC on 1/12/2018.
 */

public class AdapterExperience extends RecyclerView.Adapter<AdapterExperience.RecyclerViewHolder> {

    ArrayList<Model> mModelArray= new ArrayList<>();

    public AdapterExperience(ArrayList<Model> mModelArray) {
        this.mModelArray = mModelArray;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.custom_experience_item,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
       holder.txtName.setText(mModelArray.get(position).getName());
        holder.txtInfo.setText(mModelArray.get(position).getInfo());
        holder.txtTime.setText(mModelArray.get(position).getInfo());
        holder.txtChat.setText(mModelArray.get(position).getChat());
        holder.imgAvatar.setImageResource(mModelArray.get(position).getImage());

    }



    @Override
    public int getItemCount() {
        return mModelArray.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        AppCompatImageView imgAvatar;
        AppCompatButton btnEdit;
        AppCompatTextView txtName, txtInfo, txtTime, txtChat;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            txtName= itemView.findViewById(R.id.name_experience_tv);
            txtInfo= itemView.findViewById(R.id.info_experience_tv);
            txtTime= itemView.findViewById(R.id.time_experience_tv);
            txtChat= itemView.findViewById(R.id.chat_experience_tv);
            imgAvatar=itemView.findViewById(R.id.experience_img);
            btnEdit=itemView.findViewById(R.id.edit_experience_img_btn);
        }
    }

}
