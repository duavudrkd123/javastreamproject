package stream.collect;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import common.EmpDAO;
import common.Employee;

public class CollectionDataBaseGroupby {
	public static void main(String[] args) {
		
//  직무 - 사원
 List<Employee> emp = EmpDAO.getEmpList();
 
 Map<String, List<Employee>> map;
 
 Map<String,List<Employee>> gMap =emp.stream()
		 .collect(Collectors.groupingBy(new Function<Employee,String>(){
	@Override
	public String apply(Employee t) {
		return t.getJobId();
	}
 },Collectors.toList()));
 
 Set<String> set = gMap.keySet();
 for(String s : set) {
	 System.out.println("");
	 System.out.println("----------------------");
	 System.out.println(s);
	 List<Employee> list = gMap.get(s);
	 for (Employee e : list)
		 System.out.println(e.getLastName()+ ",  " + e.getFirstName());

	}
}
}
