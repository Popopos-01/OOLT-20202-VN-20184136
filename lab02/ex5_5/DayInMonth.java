package ex5_5;
import java.util.Arrays;

public class DayInMonth {
	private int month;
	private int year;
	
	public void setMonthYear(int month, int year) {
		this.month = month;
		this.year = year;
	}
	
	public int isLeapYear() {
		if(this.year%4==0) {
			if(this.year%100==0 && this.year%400!=0)
				return 0;
			else return 1;
		}
		else return 0;
	}
	
	public int tell() {
		int[] month30days = {4, 6, 9, 11};
		if(this.month == 2) {
			if(isLeapYear()==1) return 29;
			return 28;
		}
		if(Arrays.asList(month30days).contains(this.month))
			return 30;
		return 31;
	}
}
