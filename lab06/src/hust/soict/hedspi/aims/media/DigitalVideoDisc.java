package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	
	public DigitalVideoDisc(String title, String director, String category, int length, float cost) {
		super();
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
	
	public String printInfo() {
		return "DVD - " + this.title + " - " + this.category + " - " + this.director + 
				" - " + this.length + " - " + this.cost + "$";
	}
	
	public boolean isTitleContain(String title) {
		String[] tokenList = title.toLowerCase().split(" ");
		for(int i = 0; i < tokenList.length; i++) {
			if(!this.title.toLowerCase().contains(tokenList[i])) {
				return false;
			}
		}
		return true;
	}
}