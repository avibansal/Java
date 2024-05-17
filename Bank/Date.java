package Bank;

public class Date {
	private int day,month,year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date() {
		this.day = 1;
		this.month = 19;
		this.year = 1890;
	}
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	
	
}
