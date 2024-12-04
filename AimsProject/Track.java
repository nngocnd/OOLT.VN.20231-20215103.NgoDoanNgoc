package hust.soict.hedspi.aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	
	public Track (String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (this.getLength() <= 0) {
			System.out.println("This track cannot be played.");
			return;
		}
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	
}
