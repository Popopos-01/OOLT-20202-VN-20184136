package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String director;
	private String category;
	private int length;
	private float cost;
	
	public DigitalVideoDisc(String title, String director, String category, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public int getLength() {
		return length;
	}
	public void setLength(int len) {
		this.length = len;
	}
	
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "DVD - " + this.title + " - " + this.category + " - " + this.director + 
				" - " + this.length + " - " + this.cost + "$";
	}
}