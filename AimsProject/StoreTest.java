package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc (4, "Matrix", "Cate1", 12.43f, 100, "director");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc (5, "Mathem", "Cate2", 13.43f, 120, "direc_tor");
		
		store.addMedia(dvd1);
		store.addMedia(dvd2);
		
		store.removeMedia(dvd1);
	}
}
