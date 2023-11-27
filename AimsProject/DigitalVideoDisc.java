package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	
	public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
		super(id, title, category, cost, length, director);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "DVD - [" + this.getTitle() + "] - [" + this.getCategory() + "] - [" + this.getDirector() + "] - [" + this.getLength() + "]: [" + this.getCost() + "]$";
	}
	
	public boolean isMatch(String title) {
		return this.getTitle().equals(title); 
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (this.getLength() <= 0) {
			System.out.println("This DVD cannot be play.");
			return;
		}
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
}
