package Exercise1;
import java.util.Scanner;

public class Add extends Arthematic{

	@Override
	public int calculate(int num1, int num2) {
		int result=num1+num2;
		return result;
	}

	@Override
	public int read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		return num;
	}

	@Override
	public void display(int result) {
		System.out.println("Result="+result);
	}
}
