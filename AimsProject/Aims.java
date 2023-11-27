package hust.soict.hedspi.aims.Aims;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new cart
		Cart anOrder = new Cart();
		// Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation",19.95f, 87, "Roger Allers");
		anOrder.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", 24.95f, 87, "George Lucas");
		anOrder.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", 18.99f, 87, "Guy Richie");
		anOrder.addMedia(dvd3);
		
		//print total cost of the items in the cart
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
	}

}

