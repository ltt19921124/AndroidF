package com.bignerdranch.android.materialtest2;

/**
 * Created by ltt19 on 2017/11/30.
 */

public class Fruit {
    private String name;

    private int imageId;

    public Fruit(String name,int imageId) {
        this.name = name;
        this.imageId = imageId;
    }
    public String getName() {
        return name;
    }
    public int getImageId() {
        return imageId;
    }
}
