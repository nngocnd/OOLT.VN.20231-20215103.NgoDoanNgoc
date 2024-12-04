package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	
	public Book(int id, String title, String category, float cost, ArrayList<String> author) {
		// TODO Auto-generated constructor stub
		super(id, category, category, cost);
		this.authors = new ArrayList<>(authors);
	}
	
	public void addAuthor (String authorName) {
		if (!authors.contains(authorName)){
			authors.add(authorName);
		} else {
			System.out.println("Cannot add, available author name");
		}
	}
	
	public void removeAuthor (String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
		} else {
			System.out.println("Cannot remove, Author Name not available");
		}
	}
}
