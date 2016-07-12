
public enum Month {
	JAN(1), FEB(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);
	int monthNumber;
	Month(int n){
		monthNumber = n;
	}
	
	public int getMonthNumber(){
		return monthNumber;
	}
}
