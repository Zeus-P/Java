package com.zeus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
	// write your code here
        Album album = new Album("Maroon","Ed Shareen");
        album.addSong("Lonely",4.6);
        album.addSong("Lone",4.1);
        album.addSong("Holy man",4.8);
        album.addSong("You Can do",4);
        album.addSong("Lye",4.3);
        album.addSong("Deep Blue",4.2);
        album.addSong("Loly",5.7);
        album.addSong("holy",4.5);
        albums.add(album);

        album = new Album("Rocks","Kishore");
        album.addSong("Bheegi Bhaagi",4.67);
        album.addSong("Shuru shuru",5.67);
        album.addSong("Jao na ",7.67);
        album.addSong("Kaminey",8.67);
        album.addSong("pehli baar",3.67);
        album.addSong("Kuch Dur",2.67);
        album.addSong("pal pal",6.67);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("You Can do",playList);
        albums.get(0).addToPlaylist("Holy man",playList);
        albums.get(0).addToPlaylist("Deep Blue",playList);
        albums.get(0).addToPlaylist(7,playList);
        albums.get(1).addToPlaylist(3,playList);
        albums.get(1).addToPlaylist(6,playList);
        albums.get(1).addToPlaylist(24,playList);

        play(playList);
    }

    public static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No Songs In the Playlist");
            return;
        }
        else{
            System.out.println("Now Playing "+listIterator.next().toString());
        }
    }
}
