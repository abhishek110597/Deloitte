package association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String args[]) {

		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
		
		//Employee employee3=new Employee(1222,"Kalpana");
		ContractEmployee employee2=new ContractEmployee(25000,5);
		//RegularEmployee employee=new RegularEmployee(41000, 90000);
		//employee.setEmployeeName("Arjun");
		//employee.setEmployeeId(1223);
		employee2.setEmployeeId(1224);
		employee2.setEmployeeName("Raj");
		//session.save(employee);
		session.save(employee2);
		//session.save(employee3);
		tx.commit();
		session.close();
		System.out.println("");
		factory.close();

	}
}
