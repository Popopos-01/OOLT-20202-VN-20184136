package lab03;

public class Order {
	private static final int MAX_ORDERED_NUMBER = 10;
	
	private int orderQty;
	private DigitalVideoDisc orderDVD[] = new DigitalVideoDisc[MAX_ORDERED_NUMBER];
	
	public Order() {
		super();
		this.orderQty = 0;
	}
	
	public int getOrderQty() {
		return this.orderQty;
	}
	
	public void setOrderQty(int set_qty) { /* chi cho muc dich chay test,khi vao he thong thuc se bo di */
		this.orderQty = set_qty;			  
	}
	
	//in ra don dat hang hien tai
	public void printDvdOrder() { 
		for(int i = 0; i < this.orderQty; i++) {
			System.out.println(i+1+": "+ orderDVD[i].getTitle() + ", " + orderDVD[i].getDirector() + ", "
					+ orderDVD[i].getCategory() + ", " + orderDVD[i].getLength());
		}
		System.out.println("Total cost: " + totalCost());
	}
	
	//them dvd vao don dat hang
	public int addDVD(DigitalVideoDisc disc) {
		if(orderQty == MAX_ORDERED_NUMBER) return 0;
		this.orderDVD[this.orderQty] = disc;
		this.orderQty++;
		return 1;
	}
	
	//loai dvd khoi don dat hang
	public boolean removeDVD(DigitalVideoDisc disc) {
		int i = 0;
		boolean removed = false;
		for(; i < orderQty; i++) {
			if(this.orderDVD[i].getTitle() == disc.getTitle()) {
				this.orderQty--;
				removed = true;
				break;
			}
		}
		if(removed == true)
			for(; i < orderQty; i++) {
				this.orderDVD[i] = this.orderDVD[i+1];
			}
		return removed;
	}
	
	//tinh tong tien don hang dvd
	public float totalCost() {
		float sum = 0;
		for(int i = 0; i < orderQty; i++) {
			sum += orderDVD[i].getCost();
		}
		return sum;
	}
}
