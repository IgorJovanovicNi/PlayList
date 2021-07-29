package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlayList {
    private String name;
    private LinkedList<Song> playList;

    public PlayList(String name){
        this.name=name;
        this.playList=new LinkedList<>();
    }

   private boolean findSong(Song song){
       return playList.contains(song);
   }

   public boolean addSongToPlayList(Song song){
        if (!findSong(song)){
            playList.add(song);
            return true;
        }
       System.out.println("Song is all ready in playlist");
        return false;
   }

    public LinkedList<Song> getPlayList() {
        return playList;
    }
    public void menu(){
        System.out.println("0-Options \n " +
                "1-Song List \n" +
                "2-Next \n" +
                "3-Previous \n" +
                "4-Remove \n" +
                "5-Replay \n" +
                "6-Quit");
    }
    public void printList(){
        for (Song s:playList){
            System.out.println(s.toString());
        }
    }
    public void play(){
        ListIterator<Song > listIterator=playList.listIterator();
        Scanner scanner=new Scanner(System.in);

        boolean goingForward=false;
        boolean quit=false;
        int action=0;

        while (!quit){
            menu();
            System.out.println("Enter your choice:");
             action= scanner.nextInt();

             switch(action){
                 case 0: menu();break;
                 case 1: printList();break;
                 case 2:
                     if (!goingForward){
                         if (listIterator.hasNext()){
                             listIterator.next();
                         }
                         goingForward=true;
                     }
                     if (listIterator.hasNext()){
                         System.out.println("Now playing "+ listIterator.next());
                     }else{
                         System.out.println("You are at the end of list!");
                     }
                     break;
                 case 3: if (goingForward){
                     if (listIterator.hasPrevious()){
                         listIterator.previous();
                     }
                     goingForward=false;
                 }
                 if (listIterator.hasPrevious()){
                     System.out.println("Now playing "+listIterator.previous());
                 }else{
                     System.out.println("You are at the start!");
                 }
                 break;
                 case 4:
                     listIterator.remove(); break;
                 case 5: if (goingForward){
                     if (listIterator.hasPrevious()){
                         System.out.println("Playing again "+listIterator.previous());
                         goingForward=false;
                     } }else if (!goingForward){
                     if (listIterator.hasNext()){
                         System.out.println("Playing again "+listIterator.next());
                         goingForward=true;
                     }
                 }
                 break;
                 case 6: quit=true;break;
             }
        }
    }
}
