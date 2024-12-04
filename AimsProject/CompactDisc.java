package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks;
	
	public CompactDisc (int id, String title, String category, float cost, String director, int length, String artist) {
		super(id, title, category, cost, length, director);
		this.artist = artist;
		this.tracks = new ArrayList<>() ;
	}
	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track track) {
		if (!tracks.contains(track)) {
			tracks.add(track);
			System.out.println("Track added: " + track.getTitle());
		} else {
			System.out.println("Track already exists: " + track.getTitle());
		}
	}
	
	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Track removed: " + track.getTitle());
		} else {
			System.out.println("Track not found: " + track.getTitle());
		}
	}
	
	public int getLength() {
		int totalLength = 0;
		for (Track track : tracks) {
			totalLength += track.getLength();
		}
		return totalLength;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (this.getLength() <= 0) {
			System.out.println("This CD cannot be played.");
			return;
		}
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());
		for (Track track : tracks) {
			track.play();
		}
	}
}
