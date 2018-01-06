package com.example.pc.chatapplication;

import java.util.ArrayList;

/**
 * Created by PC on 1/4/2018.
 */

public class ModelChat {
    private int Image;
    private String name;
    private String info;

    public ModelChat(){

    }
    public ModelChat(int image, String name, String info) {
        Image = image;
        this.name = name;
        this.info = info;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    public static ArrayList<ModelChat> createModelChatList(int numMess) {
        ArrayList<ModelChat> mModelChatArray = new ArrayList<ModelChat>();

        for (int i = 0; i < numMess; i++) {
            mModelChatArray.add(new ModelChat(R.drawable.ic_person_black_24dp,"Dinh Viet Dung","21 tuoi"));
            mModelChatArray.add(new ModelChat(R.drawable.ic_person_black_24dp,"Dinh Viet Dung2","26 tuoi"));
            mModelChatArray.add(new ModelChat(R.drawable.ic_person_black_24dp,"Dinh Viet Dung3","25 tuoi"));
            mModelChatArray.add(new ModelChat(R.drawable.ic_person_black_24dp,"Dinh Viet Dung4","8 tuoi"));
        }

        return mModelChatArray;
    }
}
