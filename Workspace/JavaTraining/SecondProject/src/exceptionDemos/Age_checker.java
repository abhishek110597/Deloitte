package exceptionDemos;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String msg) {
		super(msg);
	}
}


class NewYearParty{
	int eligibleAge = 16;
	Scanner sc = new Scanner(System.in);
	int age;
	
	public void enterClub() throws InvalidAgeException {
		System.out.println("enter your age ");
		age = sc.nextInt();
		if(age < eligibleAge) {
			throw new InvalidAgeException("get out noob");
		}else {
			System.out.println("Come pls come women and men");
		}
	}

	@Override
	public String toString() {
		return "NewYearParty [eligibleAge=" + eligibleAge + ", age=" + age + "]";
	}
	
}
public class Age_checker {
	public static void main(String[] args) {
		NewYearParty party = new NewYearParty();
		try {
			party.enterClub();
			System.out.println(party);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}