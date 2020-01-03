package exceptionDemos;

public class Source {
	public static void main(String[] args) {
		Product p1=new Product(1,"Chair",5,1500);
		Product p2=new Product(1,"Chair",3,1800);
		System.out.println(p1);
		p1.setQoh(3);
		p1.setPrice(1800);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
	}
}