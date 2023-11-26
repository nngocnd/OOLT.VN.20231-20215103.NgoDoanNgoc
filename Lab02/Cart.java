
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrder[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		// TODO Auto-generated method stub
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrder[qtyOrdered++] = dvd;
		} else {
			System.out.println("Cannot add, cart is full");
		}
	}
	
	public double totalCost() {
		// TODO Auto-generated method stub
		float sum = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += itemsOrder[i].getCost();
		}
		return sum;
	}
}
