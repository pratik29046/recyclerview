package com.abhayjeet.recyclerview;

public class ModelClass {
    private int img;
    private String name;

    ModelClass(int img,String name){
        this.img=img;
        this.name=name;
    }

    public int getImg(){
        return img;
    }
    public String getName(){
        return name;
    }

//    public void setImg(int newImg){
//        this.img=newImg;
//    }
//
//    public void setName(String newName){
//        this.name=newName;
//    }


}
