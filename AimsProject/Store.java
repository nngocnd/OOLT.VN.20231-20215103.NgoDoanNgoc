package hust.soict.hedspi.aims.store;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Media;

public class Store {
	private static final int MAX_ITEM_IN_STORE = 50;
	private ArrayList<Media> itemsInStore = new ArrayList<>();
	
	public void addMedia (Media media) {
		if (itemsInStore.size() < MAX_ITEM_IN_STORE) {
			itemsInStore.add(media);
			System.out.println("Added to store");
		} else System.out.println("Cannot add to store. Exceed quantity.");
	}
	
	public void removeMedia (Media media){
		if (itemsInStore.add(media)) {
			itemsInStore.remove(media);
			System.out.println("Remove " + media.getTitle() + " successfully");
		} else {
			System.out.println("Cannot found: " + media.getTitle());
		}
	}
}
