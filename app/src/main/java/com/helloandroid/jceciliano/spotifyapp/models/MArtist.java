package com.helloandroid.jceciliano.spotifyapp.models;

import java.util.List;

/**
 * Created by jceciliano on 29/11/16.
 *
 * Class used to save each artist returned in the spotify api.
 */

public class MArtist {
    private String id;
    private String name;
    private String type;
    private String uri;
    private int popularity;
    private MArtistFollower followers;
    private List<MArtistImage> images;
    private List<String> genres;

    public MArtist() {
    }

    public MArtist(String id, String name, String type, String uri, int popularity, MArtistFollower followers, List<MArtistImage> images, List<String> genres) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.uri = uri;
        this.popularity = popularity;
        this.followers = followers;
        this.images = images;
        this.genres = genres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public MArtistFollower getFollowers() {
        return followers;
    }

    public void setFollowers(MArtistFollower followers) {
        this.followers = followers;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<MArtistImage> getImages() {
        return images;
    }

    public void setImages(List<MArtistImage> images) {
        this.images = images;
    }
}
