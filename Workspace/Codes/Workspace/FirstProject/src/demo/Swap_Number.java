package demo;

import java.util.Scanner;

public class Swap_Number {

	public void display(int num1, int num2) {
		System.out.println("Number 1=" + num1 + " Number 2=" + num2);
	}

	public void swap(int num1, int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Swap_Number s = new Swap_Number();
		
		System.out.println("Before swap");
		s.display(num1, num2);
		
		s.swap(num1, num2);
		
		System.out.println("After swap");
		s.display(num1, num2);

		Leap_Year ly = new Leap_Year();
		ly.check();

		sc.close();
	}
}
