package Exercise2;

import java.util.Comparator;

public class EmployeeSort implements Comparator<EmployeeVo> {

	

	@Override
	public int compare(EmployeeVo o1, EmployeeVo o2) {
		int x= (int)o2.getIncometax()-(int)o1.getIncometax();
		if(x>0) {
			return 1;
		}
		else if(x==0) {
			return 0;
		}
		else if(x<0) {
			return -1;
		}
		return 0;
	}
}
