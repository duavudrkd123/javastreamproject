package common.excel;

import java.sql.SQLException;
import java.util.List;

import common.EmpDAO;
import common.Employee;

public class ExcelExample {
	public static void main(String[] args) throws SQLException {
		EmployeeExcelWriter writer = new EmployeeExcelWriter();
		List<Employee> list = EmpDAO.getEmpList();
		writer.xlsWriter(list);
		System.out.println("엑셀 완료.");
	}
}
