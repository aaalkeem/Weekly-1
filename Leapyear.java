package program;

public class Leapyear {

	public static void main(String[] args) {
		int year;
		year = 2100 ;
		if (year %100 ==0 && year %400 ==0) { 
			System.out.print("its a leap year");
					}else if (year%4==0 && year %100!=0) {
			System.out.print("its a leap year");
		}else { 
			System.out.print("its not a leap year");
		}

	}

}
