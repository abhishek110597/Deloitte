import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
	int num1, num2; double result;
	String name;
	Scanner sc=new Scanner(System.in);
	void display() throws  InterruptedException{
		Thread.sleep(1000);
		try {
			System.out.println("Enter numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			result=(num1)/(num2);
			System.out.println("Result = "+result);
		} catch (InputMismatchException e) {
			System.out.println("Enter only numbers");
		}catch (Exception e) {
			System.out.println("Give only non zero numbers");;
		}
	}
	public static void main(String[] args) throws Exception {
		Demo d=new Demo();
		d.display();
		System.out.println("BYE BYE");
}
}