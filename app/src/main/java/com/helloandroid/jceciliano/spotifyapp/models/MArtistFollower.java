package com.helloandroid.jceciliano.spotifyapp.models;


/**
 * Created by jceciliano on 29/11/16.
 *
 * Class used to store the followers object inside the json response in spotify api
 */

public class MArtistFollower {
    private String href;
    private int total;

    public MArtistFollower() {
    }

    public MArtistFollower(String href, int total) {
        this.href = href;
        this.total = total;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
