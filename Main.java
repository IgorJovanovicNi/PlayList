package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Song song1 = new Song("song1", 4.50d);
        Song song2 = new Song("song2", 4.51d);
        Song song3 = new Song("song3", 4.52d);
        Song song4 = new Song("song4", 4.53d);
        Song song5 = new Song("song5", 4.54d);
        Song song6 = new Song("song6", 4.54d);
        Song song7 = new Song("song7", 4.56d);
        Song song8 = new Song("song8", 4.57d);

        Album album1 = new Album("Ever");
        Album album2 = new Album("Never");
        Album album3 = new Album("Bad");

        album1.addSongToAlbum(song1);
        album1.addSongToAlbum(song2);
        album1.addSongToAlbum(song3);
        album2.addSongToAlbum(song4);
        album2.addSongToAlbum(song5);
        album2.addSongToAlbum(song6);
        album3.addSongToAlbum(song7);
        album3.addSongToAlbum(song8);

        ArrayList<Album> albumArrayList = new ArrayList<Album>();
        albumArrayList.add(album1);
        albumArrayList.add(album2);
        albumArrayList.add(album3);

        PlayList playlist = new PlayList("Rock");
        playlist.addSongToPlayList(song1);
        playlist.addSongToPlayList(song2);
        playlist.addSongToPlayList(song3);
        playlist.addSongToPlayList(song4);
        playlist.addSongToPlayList(song5);
        playlist.addSongToPlayList(song6);
        playlist.addSongToPlayList(song7);
        playlist.addSongToPlayList(song8);

        for (Song s:playlist.getPlayList()){
            System.out.println(s.toString());
        }
        System.out.println("-----------------");

        playlist.play();
    }
}
