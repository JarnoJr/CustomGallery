package com.example.myapplication;

public class ImageModel {
    String image;
    String title;
    int resImg;
    boolean isSelected;

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public int getResImg() {
        return resImg;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setResImg(int resImg) {
        this.resImg = resImg;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
