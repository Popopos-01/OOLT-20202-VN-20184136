package lab03;

public class Aims {
	//tinh huong 1
	private static void test1(Order order, DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		System.out.println("Them dvd1");
		order.addDVD(dvd1);
		order.printDvdOrder();
		System.out.println("Them dvd2");
		order.addDVD(dvd2);
		order.printDvdOrder();
		System.out.println("Bo dvd1");
		order.removeDVD(dvd1);
		order.printDvdOrder();
	}
	
	//tinh huong 2
	private static void test2(Order order, DigitalVideoDisc dvd1) {
		order.setOrderQty(10);
		if(order.addDVD(dvd1) == 0)
			System.out.println("Da qua han dat hang, khong the dat them");
	}
	
	public static void main(String[] args) {
		Order newOrder = new Order();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("film1", "director1", "comedy", 1, 1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("film2", "director2", "drama", 2, 2);
		
		test1(newOrder, dvd1, dvd2);
		//test2(newOrder, dvd1);
	}

}
