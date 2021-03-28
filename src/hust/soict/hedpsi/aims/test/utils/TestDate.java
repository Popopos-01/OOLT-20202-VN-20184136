package hust.soict.hedpsi.aims.test.utils;

import hust.soict.hedspi.aims.utils.*;

public class TestDate {
	public static void main(String[] args) {
		MyDate date1 = new MyDate("second", "september", "twenty twenty");
		date1.print();
		
		System.out.println();
		
		MyDate date2 = new MyDate("third", "september", "twenty twenty");
		MyDate date3 = new MyDate("first", "october", "twenty twenty one");
		MyDate date4 = new MyDate("third", "may", "twenty twenty");
		
		MyDate[] dateList = {date1, date2, date3, date4};
		DateUtil.sortDate(dateList);
		for(int i = 0; i<dateList.length; i++)
			dateList[i].print();
		
		System.out.println();
		
		date2.print("mmm d yyyy");
		date2.print("yyyy mm dd");
		int check = DateUtil.cmpDate(date1, date2);
		System.out.println(check);
	}

}
