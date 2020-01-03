import finance.Salary;

public class Welcome {

	public static void main(String[] args) {
		System.out.println("Welcome to Eclipse IDE");
		Training t = new Training();
		t.display();
		Deloitte d = new Deloitte();
		d.displayDeloitte();
		Bye b = new Bye();
		b.sayThanks();
		Salary s = new Salary();
		int ctc = s.calculateSalary(37000, 2000);
		System.out.println(ctc);
		Exit e = new Exit();
		e.end();

	}
}
