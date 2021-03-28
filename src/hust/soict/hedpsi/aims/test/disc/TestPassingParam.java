package hust.soict.hedpsi.aims.test.disc;

import hust.soict.hedspi.aims.disc.*;

public class TestPassingParam {
	 public static void main(String[] args) { 
		 // TODO Auto-generated method stub
		 DigitalVideoDisc jungleDvd = new DigitalVideoDisc("Jungle"); 
		 DigitalVideoDisc cinderellaDvd = new DigitalVideoDisc("Cinderella");
	  
		 swap(jungleDvd, cinderellaDvd); 
		 System.out.println("jungle dvd title: " + jungleDvd.getTitle()); 
		 System.out.println("cinderella dvd title: " +
				 cinderellaDvd.getTitle());
	  
		 changeTitle(jungleDvd, cinderellaDvd.getTitle());
		 System.out.println("jungle dvd title: " + jungleDvd.getTitle()); }
	 
	
	 public static void swap(Object dvd1, Object dvd2) {
		 Object tmp = dvd1;
		 dvd1 = dvd2;
		 dvd2 = tmp;
	 }
	
	public static void changeTitle(DigitalVideoDisc dvd, String newTitle) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(newTitle);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
