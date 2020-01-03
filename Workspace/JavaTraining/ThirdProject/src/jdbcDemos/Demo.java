package jdbcDemos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Connection conn=DBConnection.makeConnection();
	
	Statement stat=conn.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
	
	ResultSet res=stat.executeQuery("select hr.customer.* from hr.customer");
	
	while(res.next()) {
		System.out.print(res.getString(1)+" ");
		System.out.print(res.getString(2)+" ");
		System.out.print(res.getString(3)+" ");
		System.out.print(res.getString(4)+" ");
		System.out.println();
	}
	
	//res.moveToInsertRow();
	//res.update("Colname or colnum","value")
	//res.insertRow();
	//res.updateRow();
	
	
	//String query="create table hr.salary(basic integer,hra integer,bonus integer)";
	//stat.execute(query);
	
	stat.close();
	conn.close();
	
}
}
