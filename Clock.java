import java.util.*;

class Clock {
	public static void main(String[] arguments) {
		// get Current time and date
		Calendar now = Calendar.getInstance();
//		System.out.println(now);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int year = now.get(Calendar.YEAR);
		
		// display greeting
		if (hour < 12) System.out.print("Good morning.\n");
		else if (hour < 17) System.out.print("Good afternoon.\n");
		else System.out.print("Good evening.\n");
		
		// begin time message by showing the minutes
		System.out.print("It's ");
//		System.out.print( month + "It's ");
		if (minute != 0) {
			System.out.print(minute + " ");
			System.out.print((minute == 1) ? "minute" : "minutes");
			System.out.print(" pass");
		}
		
		// display the hour
		System.out.print(" ");
		System.out.print((hour <= 12) ? hour : hour - 12);
		System.out.print(" O'clock on ");
		
		// display the name of the month
		switch (month + 1) {
			case 1:
				System.out.print("January");
				break;
			case 2:
				System.out.print("February");
				break;
			case 3:
				System.out.print("March");
				break;
			case 4:
				System.out.print("April");
				break;
			case 5:
				System.out.print("May");
				break;
			case 6:
				System.out.print("June");
				break;
			case 7:
				System.out.print("July");
				break;
			case 8:
				System.out.print("August");
				break;
			case 9:
				System.out.print("September");
				break;
			case 10:
				System.out.print("October");
				break;
			case 11:
				System.out.print("November");
				break;
			case 12:
				System.out.print("December");
				break;
				
			// display the date and year
		}
		System.out.print(" " + day + ", " + year + ".");
		
	}
}