package Exercise1;
import java.io.InputStream;
import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Object[] calculator= {new Add(),new Subtract(),new Multiply(),new Divide()};
	System.out.println("Enter\t1 for Add\n\t2 for Subtract\n\t3 for Multiply\n\t4 for Division");
	int choice=sc.nextInt();
	int num1=((Arthematic) calculator[choice-1]).read();
	int num2=((Arthematic) calculator[choice-1]).read();
	int result=((Arthematic) calculator[choice-1]).calculate(num1, num2);
	((Arthematic) calculator[choice-1]).display(result);

}
}
