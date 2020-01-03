package oops;

public class Z {
W w=new W();
{
	System.out.println("Instance is reached");
}
static {
	System.out.println("STATIC BLOCK");
}
public Z() {
	System.out.println("Z is called");
}

public static void main(String[] args) {
	new Z();
 	new Z();
}
}
