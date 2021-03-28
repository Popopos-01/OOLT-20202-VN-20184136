package hust.soict.hedpsi.aims;

import hust.soict.hedspi.aims.disc.*;
import hust.soict.hedspi.aims.order.*;
import hust.soict.hedspi.aims.utils.*;

import java.util.*;

public class AIMS {
	private static int currentOrder = 0;
	private static ArrayList<Order> orderList = new ArrayList<Order>();
	
	private static void changeCurOrder(int order_index) {
		if(order_index > orderList.size()) {
			System.out.printf("Order #%d doesn't exist\n", order_index);
			return;
		}
		currentOrder = order_index-1;
	}
	
	private static void whichOrderIsThis() {
		System.out.printf("this is order #%d/#%d\n", currentOrder+1, orderList.size());
	}
	
	private static void makeNewOrder(String day, String month, String year) {
		if(orderList.size() == Order.getOrderLimit()) {
			System.out.printf("Da dat toi da so luong order trong ngay (%d|%d)", Order.getNbOrder(), Order.getOrderLimit());
			return;
		}
		Order newOrder = new Order(day, month, year);
		orderList.add(newOrder);
		System.out.printf("Tao thanh cong order#%d\n", orderList.size());
		changeCurOrder(orderList.size());
	}
	
	//tinh huong 1
	private static void testDisc1(Order order, DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		System.out.printf("\n**********\nThem dvd1\n");
		order.addDVD(dvd1);
		order.printDvdOrder();
		System.out.printf("\n**********\nThem dvd2\n");
		order.addDVD(dvd2);
		order.printDvdOrder();
		System.out.println("\n*********\nBo dvd1\n");
		order.removeDVD(dvd1);
		order.printDvdOrder();
	}
		
	//tinh huong 2
	private static void testDisc2(Order order, DigitalVideoDisc dvd1) {
		order.setOrderQty(10);
		if(order.addDVD(dvd1) == 0)
			System.out.println("Da qua han dat hang, khong the dat them");
	}
		
		
	public static void main(String[] args) {
		//Order.setNbOrder(Order.getMaxNbOrder());
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("film1", "director1", "comedy", 1, 1); 
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("film2", "director2", "drama", 2, 2);
		
		makeNewOrder("second", "april", "twenty twenty one");
		whichOrderIsThis();
		testDisc1(orderList.get(currentOrder), dvd1, dvd2);
		
		System.out.println("----------------");
		
		makeNewOrder("first", "may", "twenty twenty");
		whichOrderIsThis();
		testDisc2(orderList.get(currentOrder), dvd1);
		
		System.out.println("----------------");
		
		changeCurOrder(1);
		whichOrderIsThis();
		orderList.get(currentOrder).printDvdOrder();
	}
}
