package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDBC {
	static final String DB_URL = "jdbc:mysql://localhost:3306/TEST";
	static final String USER = "sarvesh";
	static final String PASS = "sarvesh";

	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			// stmt.executeUpdate("alter table employee add address VARCHAR (24)");
			stmt.executeUpdate("UPDATE employee" + " SET address = 'thane' "
					+ "WHERE employee.id = 1");

			String updateTableSQL = "UPDATE employee SET address = ? "
					+ " WHERE employee.id = ?";

			PreparedStatement prep = con.prepareStatement(updateTableSQL);
			prep.setString(1, "Mumbai");
			prep.setInt(2, 2);

			// stored procedure

			CallableStatement stmt1 = con.prepareCall("{call insertRO(?,?)}");
			stmt1.setInt(1, 1011);
			stmt1.setString(2, "Amit");
			stmt1.executeUpdate();
			// stmt1.execute();

			System.out.println("success");

			// end stored proc

			prep.executeUpdate();

			ResultSet rs = stmt
					.executeQuery("select * from employee where id >= 2");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
						+ rs.getString(3) + " " + rs.getString(4));

			ResultSet rs1 = stmt.executeQuery("select * from user420");

			while (rs1.next())
				System.out.println(rs1.getInt(1) + "  " + rs1.getString(2));

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
