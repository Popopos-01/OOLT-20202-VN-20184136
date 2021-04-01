package hust.soict.hedspi.aims.media;
import java.util.*;

public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book(String title, String category, String authors, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		String[] authorList;
		authorList = authors.split(",");
		for(var element : authorList)
			this.authors.add(element);
	}
		
	public String printInfo() {
		String str = "";
		for(int i = 0; i < authors.size(); i++) {
			str += authors.get(i);
			str += " ";
		}
		return "Book - " + this.title + " - " + this.category + " - <" + str.strip() + "> - " + this.cost + "$";
	}
	
	public boolean removeAuthor(String author) {
		if(!authors.contains(author))
			return false;
		authors.remove(author);
		return true;
	}
	
	public boolean addAuthor(String author) {
		if(authors.contains(author))
			return false;
		authors.add(author);
		return true;
	}
}
