package demo;

import java.util.Scanner;

public class Leap_Year {
	public void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Year " + year + " is a leap year");
		} else
			System.out.println("Year " + year + " is not a leap year");
		sc.close();
	}
}
