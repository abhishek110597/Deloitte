package Inheritance;

class Order {
int i;
static {
	System.out.println("ORDER STATIC");
}

Order(){
	i=10;
	System.out.println("Order Constructor, i="+i);
}
{
	System.out.println("Order Instance, i="+i);
}
}

public class SubOrder extends Order{
	int j=9;
	static {
		System.out.println("SUBORDER STATIC");
	}

	SubOrder(){
		j=20;
		System.out.println("SubOrder Constructor, j="+j);
	}
	{
		System.out.println("SubOrder Instance, j="+j);
	}
public static void main(String[] args) {
	new SubOrder();
}	
}
