package stream.intermediate;

import java.util.List;

import common.EmpDAO;
import common.Employee;

public class StreamMapExample {
	public static void main(String[] args) {
		
		List<Employee> employee = EmpDAO.getEmpList();
		// salary가 10000 이상인 사원들 출력
		
		for(Employee emp:employee) {
			System.out.println(emp.toString());
		}
		
		
		
	}
	}

