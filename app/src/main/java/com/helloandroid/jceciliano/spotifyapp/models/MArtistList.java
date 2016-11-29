package com.helloandroid.jceciliano.spotifyapp.models;

import java.util.List;

/**
 * Created by jceciliano on 29/11/16.
 *
 * Class used to store the result list of artists.
 */

public class MArtistList {
    private List<MArtist> artists;

    public MArtistList() {
    }

    public MArtistList(List<MArtist> artists) {
        this.artists = artists;
    }

    public List<MArtist> getArtists() {
        return artists;
    }

    public void setArtists(List<MArtist> artists) {
        this.artists = artists;
    }
}
