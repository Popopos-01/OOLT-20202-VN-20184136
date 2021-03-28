package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.disc.*;
import hust.soict.hedspi.aims.utils.*;

public class Order {
	private static final int MAX_ORDERED_NUMBER = 10;
	private static final int MAX_LIMITED_ORDER = 10;
	private static int nbOrder = 0;
	
	private int orderQty = 0;
	private MyDate dateOrdered;
	private DigitalVideoDisc orderDVD[] = new DigitalVideoDisc[MAX_ORDERED_NUMBER];
	
	public Order(String day, String month, String year) {
		this.dateOrdered = new MyDate(day, month, year);
		nbOrder++;
	}
	
	public static void setNbOrder(int nb) {
		nbOrder = nb;
	}
	
	public static int getNbOrder() {
		return nbOrder;
	}
	
	public static int getOrderLimit() {
		return MAX_LIMITED_ORDER;
	}
	
	public int getOrderQty() {
		return this.orderQty;
	}
	
	public void setOrderQty(int set_qty) { /* chi cho muc dich chay test,khi vao he thong thuc se bo di */
		this.orderQty = set_qty;			  
	}
	
	//in ra don dat hang hien tai
	public void printDvdOrder() { 
		System.out.print("Date: "); 
		this.dateOrdered.print();
		System.out.println();
		for(int i = 0; i < this.orderQty; i++) {
			System.out.println(i+1 + " " + this.orderDVD[i].toString());
		}
		System.out.println("Total cost: " + totalCost() + "$");
	}
	
	//them dvd vao don dat hang
	public int addDVD(DigitalVideoDisc disc) {
		if(orderQty == MAX_ORDERED_NUMBER) return 0;
		this.orderDVD[this.orderQty] = disc;
		this.orderQty++;
		return 1;
	}
	
	public int addDVD(DigitalVideoDisc[] dvdList) {
		if(this.orderQty + dvdList.length > MAX_ORDERED_NUMBER) return 0;
		for(int i = 0; i < dvdList.length; i++) {
			this.orderDVD[this.orderQty] = dvdList[i];
			this.orderQty++;
		}
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
