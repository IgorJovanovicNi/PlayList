package com.company;

import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Album> albums;

    public Artist(String name) {
        this.name = name;
        this.albums=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }
}
