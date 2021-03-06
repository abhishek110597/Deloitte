package jdbcDemos;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateTableDemo {
	public static void main(String[] args) {
		UpdateCustomer customer=new UpdateCustomer();
		customer.accept();
		Connection conn1 = DBConnection.makeConnection();
		try {
			/*Statement stat=conn1.createStatement();
			String insertQuery="insert into hr.customer values(1877,'Bibhu','Bhub',50000)";
			int rowsAffected=stat.executeUpdate(insertQuery);
			System.out.println(rowsAffected);*/
			
			PreparedStatement stat=conn1.prepareStatement("update hr.customer set customerName=? ,customerAddr=? ,billAmount=? where customerId=?");
			stat.setInt(4, customer.getCustomerid());
			stat.setString(1,customer.getCustomerName());
			stat.setString(2,customer.getCustomerAddress());
			stat.setInt(3,customer.getBillAmount());
			
			stat.executeUpdate();
			
			System.out.println(customer.getCustomerName()+", Details updated");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
