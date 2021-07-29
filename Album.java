package com.company;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songsLists;

    public Album(String name) {
        this.name = name;
        this.songsLists=new ArrayList<>();
    }

    public boolean addSongToAlbum(String title,double duration){
        Song song=new Song(title, duration);
        if (findSong(title)==null){
            songsLists.add(song);
            return true;
        }
        return false;
    }

    public boolean addSongToAlbum(Song song){
        if (!findSong(song)){
            songsLists.add(song);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongsLists() {
        return songsLists;
    }
    private boolean findSong(Song song){
        return songsLists.contains(song);
    }
    private Song findSong(String title){
        Song song=null;
        for (Song s:songsLists){
            if ( s.getTitle().equals(title)){
                song=s;
                break;
            }
            return null;
        }
        return song;
    }
}
