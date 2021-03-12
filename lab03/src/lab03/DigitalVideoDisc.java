package lab03;

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

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public String getCategory() {
		return category;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}
}
