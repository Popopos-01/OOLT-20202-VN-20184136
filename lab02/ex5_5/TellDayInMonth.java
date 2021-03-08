package ex5_5;

import java.util.*;

public class TellDayInMonth {
	static String[] jan = {"1","jan","january"};
	static String[] feb = {"2","feb","febuary"};
	static String[] mar = {"3","mar","march"};
	static String[] apr = {"4","apr","april"};
	static String[] may = {"5","may"};
	static String[] jun = {"6","jun","june"};
	static String[] jul = {"7","jul","july"};
	static String[] aug = {"8","aug","august"};
	static String[] sep = {"9","sep","september"};
	static String[] dec = {"10","dec","december"};
	static String[] oct = {"11","oct","october"};
	static String[] nov = {"12","nov","november"};
	
	public static int isValid(String month, int year) {
		if(year <= 0) return 0;
		String temp = month.toLowerCase();
		if(Arrays.asList(jan).contains(temp))
			return 1;
		if(Arrays.asList(feb).contains(temp))
			return 2;
		if(Arrays.asList(mar).contains(temp))
			return 3;
		if(Arrays.asList(apr).contains(temp))
			return 4;
		if(Arrays.asList(may).contains(temp))
			return 5;
		if(Arrays.asList(jun).contains(temp))
			return 6;
		if(Arrays.asList(jul).contains(temp))
			return 7;
		if(Arrays.asList(aug).contains(temp))
			return 8;
		if(Arrays.asList(sep).contains(temp))
			return 9;
		if(Arrays.asList(dec).contains(temp))
			return 10;
		if(Arrays.asList(oct).contains(temp))
			return 11;
		if(Arrays.asList(nov).contains(temp))
			return 12;
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String month;
		int year;
		int check_month;
		do {
			System.out.println("Input month: ");
			month = keyboard.nextLine();
			System.out.println("Input year: ");
			year = keyboard.nextInt();
			check_month = isValid(month, year);
			if(check_month==0) {
				System.out.println("Invalid input");
				continue;
			}
			else {
				DayInMonth date = new DayInMonth();
				date.setMonthYear(check_month, year);
				System.out.println(date.tell());
				break;
			}
		} while(true);
		keyboard.close();
	}

}
