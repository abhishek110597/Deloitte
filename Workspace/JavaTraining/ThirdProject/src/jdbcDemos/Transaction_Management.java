package jdbcDemos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction_Management {
public static void main(String[] args) {
	Connection conn=DBConnection.makeConnection();
	try {
		conn.setAutoCommit(false);
		Statement statement=conn.createStatement();
		ResultSet res=statement.executeQuery("select * from hr.customer");
		ResultSetMetaData rsmd=res.getMetaData();
		int cl=rsmd.getColumnCount();
		for(int i=1;i<=cl;i++) {
			System.out.print(rsmd.getColumnLabel(i)+"\t");
		}
		System.out.println();
		while(res.next()) {
		for(int i=1;i<=cl;i++) {
			System.out.print(res.getString(i)+"\t");
		}
		System.out.println();
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}
}
