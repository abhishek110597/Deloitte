package Exercise2;

public class EmployeeBo {

	public void calincomeTax(EmployeeVo e) {
		
		double income=e.getAnnualincome();
		if(income<250000) {
			e.setIncometax(0);
		}
		else if(income<=500000)
		{
			e.setIncometax(0.1*income);
		}
		else
		{
			e.setIncometax(0.2*income);
		}
		
		
	}
}
