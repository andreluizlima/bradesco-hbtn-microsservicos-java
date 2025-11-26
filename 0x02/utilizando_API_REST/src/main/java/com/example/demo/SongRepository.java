package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SongRepository {
   private List<Song> list = new ArrayList<Song>();

   
   public SongRepository() {
       Song song1 = new Song(1, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "1975");
       Song song2 = new Song(2, "Imagine", "John Lennon", "Imagine", "1971");
       list.add(song1);
       list.add(song2);
   }
   
   public List<Song> getAllSongs() {
    return list;
   }

   public Song getSongById(Integer id) {
       return list.stream()
               .filter(song -> song.getId().equals(id))
               .findFirst()
               .orElse(null);
   }

   public void addSong(Song s) {
	   list.add(s);
   }

   public void updateSong(Song s) {
	   int index = list.indexOf(s);
       if (index != -1) {
           list.set(index, s);
       }
   }

   public void removeSong(Song s) {
	   list.remove(s);
   }
}
