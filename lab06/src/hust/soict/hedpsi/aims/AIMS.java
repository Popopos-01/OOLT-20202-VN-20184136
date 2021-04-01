package hust.soict.hedpsi.aims;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.order.*;

import java.util.*;

public class AIMS {
	private static int currentOrder = 0;
	private static ArrayList<Order> orderList = new ArrayList<Order>();
	
	private static void changeCurOrder(int order_index) {
		if(order_index > orderList.size()) {
			System.out.printf("Khong ton tai Order #%d\n", order_index);
			return;
		}
		currentOrder = order_index-1;
	}
	
	private static void whichOrderIsThis() {
		System.out.printf("Day la order #%d (/%d)\n", currentOrder+1, orderList.size());
	}
	
	private static void makeNewOrder(String day, String month, String year) {
		if(orderList.size() == Order.getOrderLimit()) {
			System.out.printf("Da dat toi da so luong order trong ngay (%d|%d)", Order.getNbOrder(), Order.getOrderLimit());
			return;
		}
		Order newOrder = new Order(day, month, year);
		orderList.add(newOrder);
		System.out.printf("Tao thanh cong order #%d\n", orderList.size());
		changeCurOrder(orderList.size());
	}
	
	public static void showMenu() {
		System.out.println("Order Management Application");
		System.out.println("----------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("----------------------------");
		System.out.println("Choose a function <0-1-2-3-4>");
	}
	
	//tinh huong 1
	private static void testDisc1(Order order, DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		System.out.printf("\n**********\nThem dvd1\n");
		order.addItem(dvd1);
		order.printOrder();
		System.out.printf("\n**********\nThem dvd2\n");
		order.addItem(dvd2);
		order.printOrder();
		System.out.println("\n*********\nBo dvd1\n");
		order.removeItem(dvd1);
		order.printOrder();
		System.out.println("\n******************\n");
		System.out.println(dvd1.isTitleContain(" Cinderella fIlm "));
	}
		
	//tinh huong 2
	private static void testDisc2(Order order, DigitalVideoDisc dvd1) {
		order.setOrderQty(10);
		if(order.addItem(dvd1) == 0)
			System.out.println("Da qua han dat hang, khong the dat them");
	}
	
	//tinh huong 3
	private static void testOrder(Order order, Book book1, Book book2, DigitalVideoDisc dvd1) {
		order.addItem(book1);
		System.out.println("\n**********\nThem book1\n");
		order.printOrder();
		order.addItem(dvd1);
		System.out.println("\n**********\nThem dvd1\n");
		order.printOrder();
		order.addItem(book2);
		System.out.println("\n**********\nThem book2\n");
		order.printOrder();
		order.removeItem(dvd1);
		System.out.println("\n**********\nBo dvd1\n");
		order.printOrder();
	}
		
		
	public static void main(String[] args) {
		//Order.setNbOrder(Order.getMaxNbOrder());
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("a film about cinderella", "director1", "comedy", 1, 1); 
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("film2", "director2", "drama", 2, 2);
		Book book1 = new Book("book1", "guide", "Author1a,Author1b", 3);
		Book book2 = new Book("book2", "novel", "Author2a,Author2b", 4);
		
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
		orderList.get(currentOrder).printOrder();
		
		System.out.println("----------------");
		
		makeNewOrder("ninth", "june", "twenty nineteen");
		whichOrderIsThis();
		testOrder(orderList.get(currentOrder), book1, book2, dvd1);
	}
}
