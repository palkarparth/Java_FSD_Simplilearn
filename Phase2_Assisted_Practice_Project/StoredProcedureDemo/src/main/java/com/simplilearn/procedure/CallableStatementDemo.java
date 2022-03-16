package com.simplilearn.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatementDemo {

	public static void main(String[] args) {
		Connection conn = DBUtil.getDBConnection();
		try {
			CallableStatement cstmt = conn.prepareCall("{call eproduct(?,?)}");
			cstmt.setString(1, "DELL");
			cstmt.setInt(2, 75200);
			cstmt.execute();
			System.out.println("Stored Procedure called...");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
