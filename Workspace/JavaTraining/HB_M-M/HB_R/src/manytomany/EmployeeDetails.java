package manytomany;

import java.util.Set;

public class EmployeeDetails {
private int employeeId;
private String employeeName;
private int employeeSalary;
private Set employeeAdddress;

public EmployeeDetails() {
	// TODO Auto-generated constructor stub
}

public EmployeeDetails(int employeeId, String employeeName, int employeeSalary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
}

public EmployeeDetails(int employeeId, String employeeName, int employeeSalary, Set employeeAdddress) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeSalary = employeeSalary;
	this.employeeAdddress = employeeAdddress;
}

@Override
public String toString() {
	return "EmployeeDetails [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
			+ employeeSalary + ", employeeAdddress=" + employeeAdddress + "]";
}

public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public int getEmployeeSalary() {
	return employeeSalary;
}

public void setEmployeeSalary(int employeeSalary) {
	this.employeeSalary = employeeSalary;
}

public Set getEmployeeAdddress() {
	return employeeAdddress;
}

public void setEmployeeAdddress(Set employeeAdddress) {
	this.employeeAdddress = employeeAdddress;
}


}
