package hust.soict.hedspi.aims.media;

public abstract class Media {
	protected String title;
	protected String category;
	protected float cost;
	
	public abstract String printInfo();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCattegory() {
		return category;
	}

	public void setCattegory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
}
