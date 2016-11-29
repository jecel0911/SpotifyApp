package com.helloandroid.jceciliano.spotifyapp.models;

/**
 * Created by jceciliano on 29/11/16.
 *
 * Class used to represent the image object inside the spotify api.
 */

public class MArtistImage {
    private int height;
    private int width;
    private String url;

    public MArtistImage() {
    }

    public MArtistImage(int height, int width, String url) {
        this.height = height;
        this.width = width;
        this.url = url;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
