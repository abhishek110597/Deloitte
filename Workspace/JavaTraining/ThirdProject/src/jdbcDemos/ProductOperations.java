package jdbcDemos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ProductOperations {

	static void updateProduct(Product product) {

		Connection conn1 = DBConnection.makeConnection();
		try {

			PreparedStatement stat1 = conn1
					.prepareStatement("update hr.product set 	prodName=? ,price=? ,qoh=? where prodId=?");
			stat1.setInt(4, product.getProdid());
			stat1.setString(1, product.getProdName());
			stat1.setInt(2, product.getPrice());
			stat1.setInt(3, product.getQoh());

			stat1.executeUpdate();

			System.out.println(product.getProdName() + ", Details updated");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void insertProduct(Product product) {

		Connection conn1 = DBConnection.makeConnection();
		try {

			PreparedStatement stat1 = conn1.prepareStatement("insert into hr.product values(?,?,?,?)");
			stat1.setInt(1, product.getProdid());
			stat1.setString(2, product.getProdName());
			stat1.setInt(3, product.getPrice());
			stat1.setInt(4, product.getQoh());

			stat1.executeUpdate();

			System.out.println(product.getProdName() + ", Details inserted");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void displayProduct() {

		Connection conn1 = DBConnection.makeConnection();
		try {
			Statement stat = conn1.createStatement();
			String displayQuery = "select * from hr.product";
			ResultSet res = stat.executeQuery(displayQuery);
			while (res.next()) {
				System.out.print(res.getString(1) + " ");
				System.out.print(res.getString(2) + " ");
				System.out.print(res.getString(3) + " ");
				System.out.print(res.getString(4) + " ");
				System.out.println();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void deleteProduct() {
		Connection conn1 = DBConnection.makeConnection();
		Scanner sc = new Scanner(System.in);
		System.out.println("ID to be deleted");
		int id = sc.nextInt();
		try {
			String deleteQuery = "DELETE FROM HR.PRODUCT WHERE PRODID=?";
			PreparedStatement stat = conn1.prepareStatement(deleteQuery);
			stat.setInt(1, id);
			stat.executeUpdate();
			System.out.println("Deleted values at ProdID : " + id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		System.out.println("Enter choice\n1:Insert\n2:Update\n3:Delete\n4:Display");
		int choice = sc.nextInt();
		switch (choice) {
		case 2:
			product.accept();
			updateProduct(product);
			break;
		case 1:
			product.accept();
			insertProduct(product);
			break;
		case 4:
			displayProduct();
			break;
		case 3:
			deleteProduct();
			break;
		default:
			System.out.println("Invalid Entry");
			break;
		}
		sc.close();
	}

}