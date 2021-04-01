package hust.soict.hedspi.aims.order;
import java.util.*;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.utils.*;

public class Order {
	private static final int MAX_ORDERED_NUMBER = 10;
	private static final int MAX_LIMITED_ORDER = 10;
	private static int nbOrder = 0;
	
	private int orderQty = 0;
	private MyDate dateOrdered;
	private ArrayList<Media> itemList = new ArrayList<Media>();
	
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
	public void printOrder() { 
		System.out.print("Date: "); 
		this.dateOrdered.print();
		System.out.println();
		for(int i = 0; i < this.orderQty; i++) {
			System.out.println(i+1 + " " + this.itemList.get(i).printInfo());
		}
		System.out.println("Total cost: " + totalCost() + "$");
	}
	
	//them item vao order 
	public int addItem(Media item) {
		if(orderQty == MAX_ORDERED_NUMBER) return 0;
		this.itemList.add(item);
		this.orderQty++;
		return 1;
	}
	
	// them 1 list cac item vao order
	public int addItems(Media[] addList) {
		if(this.orderQty + addList.length > MAX_ORDERED_NUMBER) return 0;
		for(int i = 0; i < addList.length; i++) {
			this.itemList.add(addList[i]);
			this.orderQty++;
		}
		return 1;
	}
	
	// loai bo 1 item trong order
	public boolean removeItem(Media item) {
		this.orderQty--;
		return this.itemList.remove(item);
	}
	
	//tinh tong tien don hang dvd
	public float totalCost() {
		float sum = 0;
		for(int i = 0; i < orderQty; i++) {
			sum += this.itemList.get(i).getCost();
		}
		return sum;
	}
	
	// lay ra 1 item may man trong order
	public Media getALuckyItem() {
		int luckyNum = (int)Math.random();
		Media removed_item = itemList.get(luckyNum);
		removeItem(itemList.get(luckyNum));
		return removed_item;
	}
}
