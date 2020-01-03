package Inheritance;

interface ChangePassword {
	String password = "pass@123";
	void doEncrypt();
}

public class DemoInnerClass {
	public static void main(String[] args) {
		ChangePassword pa = new ChangePassword() {

			@Override
			public void doEncrypt() {
				System.out.println("Password="+password);		
			}
		};

		pa.doEncrypt();
	}
}
