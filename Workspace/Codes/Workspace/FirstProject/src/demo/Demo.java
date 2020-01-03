package demo;

//To demonstrate the use of Instance and Local variables

public class Demo {
	int i;
	int num = 10;

	public void display() {
		int j = 20;
		if (num == 10)
			j = 20;
		System.out.println((i + num) - j);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
	}
}
