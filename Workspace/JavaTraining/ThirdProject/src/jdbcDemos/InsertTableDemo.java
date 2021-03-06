package jdbcDemos;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertTableDemo {
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.accept();
		Connection conn1 = DBConnection.makeConnection();
		try {
			/*Statement stat=conn1.createStatement();
			String insertQuery="insert into hr.customer values(1877,'Bibhu','Bhub',50000)";
			int rowsAffected=stat.executeUpdate(insertQuery);
			System.out.println(rowsAffected);*/
			
			PreparedStatement stat=conn1.prepareStatement("insert into hr.customer values(?,?,?,?)");
			stat.setInt(1,customer.getCustomerid());
			stat.setString(2,customer.getCustomerName());
			stat.setString(3,customer.getCustomerAddress());
			stat.setInt(4,customer.getBillAmount());
			stat.executeUpdate();
			System.out.println(customer.getCustomerName()+", Imma kill you");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
