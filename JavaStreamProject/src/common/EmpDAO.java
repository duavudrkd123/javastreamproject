package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import stream.intermediate.connectDB;

public class EmpDAO {
	// List<Employee> getEmpList();

	Employee emp = new Employee();

	public static List<Employee> getEmpList() {
		String sql = "select * from employees";
		List<Employee> list = new ArrayList<Employee>();
		try {
			Connection conn = connectDB.getDB();

			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee(
						rs.getInt("EMPLOYEE_ID"), 
						rs.getString("FIRST_NAME"),
						rs.getString("LAST_NAME"), 
						rs.getString("EMAIL"), 
						rs.getDate("HIRE_DATE").toLocalDate(),
						rs.getString("JOB_ID"), rs.getInt("SALARY"));
				list.add(emp);
			}
			;

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return list;
	}
}
