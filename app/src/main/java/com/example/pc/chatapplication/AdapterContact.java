package com.example.pc.chatapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 1/6/2018.
 */

public class AdapterContact extends RecyclerView.Adapter implements SectionIndexer {
    private ArrayList<Model> mModelArray;
    private FragmentContacts mContextContact;
    private ArrayList<Integer> mSectionPositions;


    public List<String> AlphabetList(){
        List<String> Alphabet= new ArrayList<>();
        Alphabet.add("A");
        Alphabet.add("B");
        Alphabet.add("C");
        Alphabet.add("D");
        Alphabet.add("E");
        Alphabet.add( "F");
        Alphabet.add( "G");
        Alphabet.add(   "H");
        Alphabet.add(   "I");
        Alphabet.add(   "J");
        Alphabet.add(   "K");
        Alphabet.add(  "L");
        Alphabet.add(  "M");
        Alphabet.add(   "N");
        Alphabet.add(  "O");
        Alphabet.add(   "P");
        Alphabet.add(   "Q");
        Alphabet.add(   "R");
        Alphabet.add(   "S");
        Alphabet.add(   "T");
        Alphabet.add(   "U");
        Alphabet.add(   "V");
        Alphabet.add(  "W");
        Alphabet.add(  "X");
        Alphabet.add(   "Y");
        Alphabet.add(  "Z");

        return Alphabet;
    }



    @Override
    public Object[] getSections() {
        List<String> sections = new ArrayList<>(26);
        mSectionPositions = new ArrayList<>(26);
        for (int i = 0, size = AlphabetList().size(); i < size; i++) {
            String section = String.valueOf(  AlphabetList().get(i).charAt(0)).toUpperCase();
            if (!sections.contains(section)) {
                sections.add(section);
                mSectionPositions.add(i);
            }
        }
        return sections.toArray(new String[0]);

    }

    @Override
    public int getPositionForSection(int i) {
        return mSectionPositions.get(i);
    }

    @Override
    public int getSectionForPosition(int i) {
        return 0;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txtName;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            txtName= itemView.findViewById(R.id.contact_tv);
        }
        public void bindView(int position){

            txtName.setText(mModelArray.get(position).getName());
        }

        @Override
        public void onClick(View view) {

        }
    }
    public AdapterContact(ArrayList<Model> mModelArray, FragmentContacts mContextContact) {
        this.mModelArray = mModelArray;
        this.mContextContact = mContextContact;
    }

    public FragmentContacts getmContextContact() {
        return mContextContact;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context= parent.getContext();
        LayoutInflater inflater= LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.custom_contact_item,parent,false);
        AdapterContact.RecyclerViewHolder viewHolder= new AdapterContact.RecyclerViewHolder(view);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((RecyclerViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return mModelArray.size();
    }
}
