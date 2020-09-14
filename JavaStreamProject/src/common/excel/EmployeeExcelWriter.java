package common.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import common.Employee;

public class EmployeeExcelWriter {

	public void xlsWriter(List<Employee> list) {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell;

		cell = row.createCell(0);
		cell.setCellValue("1");

		cell = row.createCell(1);
		cell.setCellValue("2");

		cell = row.createCell(2);
		cell.setCellValue("3");

		cell = row.createCell(3);
		cell.setCellValue("4");

		cell = row.createCell(4);
		cell.setCellValue("5");

		Employee emp;
		for (int i = 0; i < list.size(); i++) {
			emp = list.get(i);
			// 라인신규.
			row = sheet.createRow(i + 1);

			cell = row.createCell(0);
			cell.setCellValue(emp.getEmployeeId());

			cell = row.createCell(1);
			cell.setCellValue(emp.getFirstName());

			cell = row.createCell(2);
			cell.setCellValue(emp.getLastName());

			cell = row.createCell(3);
			cell.setCellValue(emp.getEmail());

			cell = row.createCell(4);
			cell.setCellValue(emp.getSalary());
		}

		File file = new File("Emp.xls");
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(file);
			workbook.write(fos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (workbook != null)
					workbook.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
