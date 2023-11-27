package hust.soict.hedspi.aims.cart;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(media);
			System.out.println(media.getTitle() + "added to cart.");
		} else {
			System.out.println("Cannot add, cart is full");
		}
	}
	
	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println(media.getTitle() + "removed from cart.");
		} else {
			System.out.println(media.getTitle() + "not found in the cart");
		}
	}
	
	public double totalCost() {
		// TODO Auto-generated method stub
		float sum = 0;
		for (Media media : itemsOrdered) {
			sum += media.getCost();
		}
		return sum;
	}
	
	public void print() {
		System.out.println("*****************************CART*****************************");
		System.out.println("Ordered Items:");
		for (int i = 0 ; i < itemsOrdered.size(); i++) {
			Media media = itemsOrdered.get(i);
			System.out.println((i+1) + media.toString());
		}
		System.out.println("Total cost: " + totalCost());
	}
	
	public void searchByID (int t) {
		for (Media media : itemsOrdered) {
			if (media.getId() == t) {
				System.out.println("Found");
				return;
			}
		}
		System.out.println("not found");
	}
	
	public void searchByTitle (String title) {
		for (Media media : itemsOrdered) {
			if (((DigitalVideoDisc) media).isMatch(title)) {
				System.out.println("Found");
				return;
			}
		}
		System.out.println("Not found");
	}
}
