package oops;

import java.util.Scanner;

public class Calculator {

	void add(int num1, int num2) {
		System.out.println(num1+num2);
	}

	void add(double num1, double num2) {
		System.out.println(num1 + num2);
	}

	void add(int num1, double num2) {
		System.out.println(num1+num2);
	}

	void add(double num1, int num2) {
		System.out.println(num1 + num2);
	}

	void diff(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	void diff(double num1, double num2) {
		System.out.println(num1 - num2);
	}

	void diff(int num1, double num2) {
		System.out.println(num1-num2);;
	}

	void diff(double num1, int num2) {
		System.out.println( num1 - num2);
	}

	void mul(int num1, int num2) {
		System.out.println(num1*num2);
	}

	void mul(double num1, double num2) {
		System.out.println(num1 * num2);
	}

	void mul(int num1, double num2) {
		System.out.println(num1 * num2);
	}

	void mul(double num1, int num2) {
		System.out.println(num1 * num2);
	}

	void div(int num1, int num2) {
		System.out.println(num1/num2);
	}
	
	void div(double num1, int num2) {
		System.out.println(num1/num2);
	}
	
	void div(int num1, double num2) {
		System.out.println(num1/num2);
	}
	
	void div(double num1, double num2) {
		System.out.println(num1/num2);
	}
	
	public static void main(String[] args) {
		int num1,num2;
		double x,y;
		Calculator c=new Calculator();
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		x=sc.nextDouble();
		y=sc.nextDouble();
		
		c.add(x, y);
		c.add(num1, num2);
		c.add(x, num2);
		c.add(num1, y);
		
		c.diff(x, y);
		c.diff(num1, num2);
		c.diff(x, num2);
		c.diff(num1, y);
		
		c.mul(x, y);
		c.mul(num1, num2);
		c.mul(x, num2);
		c.mul(num1, y);
		
		c.div(x, y);
		c.div(num1, num2);
		c.div(x, num2);
		c.div(num1, y);
		
		sc.close();
	}
}
