package com.example.pc.chatapplication;

import java.util.ArrayList;

/**
 * Created by PC on 1/4/2018.
 */

public class Model {
    private int Image;
    private String name;
    private String info;
    private String info2;
    private String chat;

    public Model(String name) {
        this.name = name;
    }

    public Model(){

    }
    public Model(int image, String name, String info) {
        Image = image;
        this.name = name;
        this.info = info;
    }

    public Model(int image, String name, String info, String info2, String chat) {
        Image = image;
        this.name = name;
        this.info = info;
        this.info2 = info2;
        this.chat = chat;
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
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


    public static ArrayList<Model> createModelChatList(int numMess) {
        ArrayList<Model> mModelArray = new ArrayList<Model>();

        for (int i = 0; i < numMess; i++) {
            mModelArray.add(new Model(R.drawable.ic_person_black_24dp,"A Dinh Viet Dung","21 tuoi"));
            mModelArray.add(new Model(R.drawable.ic_person_black_24dp,"B Dinh Viet Dung2","26 tuoi"));
            mModelArray.add(new Model(R.drawable.ic_person_black_24dp,"C Dinh Viet Dung3","25 tuoi"));
            mModelArray.add(new Model(R.drawable.ic_person_black_24dp,"Dinh Viet Dung4","8 tuoi"));
        }

        return mModelArray;
    }
    public static ArrayList<Model> createModelMatchList(int numMess) {
        ArrayList<Model> mModelArray = new ArrayList<Model>();

        for (int i = 0; i < numMess; i++) {
            mModelArray.add(new Model(R.drawable.ic_person_black_24dp,"Dinh Viet Dung","21 tuoi","cao 1m6","chao ban rat vui duoc lam quen voi ban. minh hoc o truong dai hoc giao thong van tai ha noi"));
            mModelArray.add(new Model(R.drawable.ic_person_black_24dp,"Dinh Viet Dung","8 tuoi","cao 1m6","chao ban rat vui duoc lam quen voi ban. minh hoc o truong dai hoc giao thong van tai ha noi"));
            mModelArray.add(new Model(R.drawable.ic_person_black_24dp,"Dinh Viet Dung","10 tuoi","cao 1m6","chao ban rat vui duoc lam quen voi ban. minh hoc o truong dai hoc giao thong van tai ha noi"));
            mModelArray.add(new Model(R.drawable.ic_person_black_24dp,"Dinh Viet Dung","21 tuoi","cao 1m6","chao ban rat vui duoc lam quen voi ban. minh hoc o truong dai hoc giao thong van tai ha noi"));
        }
        return mModelArray;
    }
    public static  ArrayList<Model> createNameModelList(int numContact){
        ArrayList<Model> mModelArray = new ArrayList<Model>();
        mModelArray.add(new Model("A Dinh Viet Dung"));
        mModelArray.add(new Model("B Dinh Viet Dung"));
        mModelArray.add(new Model("C Dinh Viet Dung"));
        mModelArray.add(new Model("D Dinh Viet Dung"));
        mModelArray.add(new Model("E Dinh Viet Dung"));
        mModelArray.add(new Model("F Dinh Viet Dung"));
        mModelArray.add(new Model("G Dinh Viet Dung"));
        mModelArray.add(new Model("H Dinh Viet Dung"));
        mModelArray.add(new Model("I Dinh Viet Dung"));
        mModelArray.add(new Model("K Dinh Viet Dung"));
        mModelArray.add(new Model("L Dinh Viet Dung"));
        mModelArray.add(new Model("M Dinh Viet Dung"));
        mModelArray.add(new Model("N Dinh Viet Dung"));
        mModelArray.add(new Model("O Dinh Viet Dung"));
        mModelArray.add(new Model("P Dinh Viet Dung"));
        mModelArray.add(new Model("Q Dinh Viet Dung"));
        mModelArray.add(new Model("R Dinh Viet Dung"));
        mModelArray.add(new Model("S Dinh Viet Dung"));
        mModelArray.add(new Model("T Dinh Viet Dung"));
        mModelArray.add(new Model("U Dinh Viet Dung"));
        mModelArray.add(new Model("V Dinh Viet Dung"));
        mModelArray.add(new Model("W Dinh Viet Dung"));
        mModelArray.add(new Model("X Dinh Viet Dung"));
        mModelArray.add(new Model("Z Dinh Viet Dung"));
        mModelArray.add(new Model("N Dinh Viet Dung"));


        return  mModelArray;
    }
}
