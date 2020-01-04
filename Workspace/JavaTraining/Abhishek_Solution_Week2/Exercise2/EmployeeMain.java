package Exercise2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Employees:");
		int n = sc.nextInt();
		EmployeeBo b = new EmployeeBo();
		EmployeeVo[] emps = new EmployeeVo[n];
		for (int i = 0; i < emps.length; i++) {
			System.out.println("Enter Employee ID of "+i+" employee");
			long employeeId=sc.nextLong();
			System.out.println("Enter Employee Name of "+i+" employee");
			String employeeName=sc.next();
			System.out.println("Enter Employee Annual Income of "+i+" employee");
			double annualIncome=sc.nextDouble();
			emps[i] = new EmployeeVo(employeeId,employeeName, annualIncome, 0);
		}
		sc.close();
		for (EmployeeVo e : emps) {
			b.calincomeTax(e);
			System.out.println(e);
		}
		
		// Sorting
		List<EmployeeVo> list = Arrays.asList(emps);
		Collections.sort(list, new EmployeeSort());

		System.out.println("===Sorted Array===");
		System.out.println(list);
	}

}

