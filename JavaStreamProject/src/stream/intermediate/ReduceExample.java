package stream.intermediate;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;


import common.EmpDAO;
import common.Employee;

public class ReduceExample {
	public static void main(String[] args) {
//		사원 평균급여
		List<Employee> empList = EmpDAO.getEmpList();
		//전체 사원의 컬렉션을 통해 스트림 생성
		Stream<Employee> stream = empList.stream();
		// Employee -> IntStream 매핑
		OptionalDouble avg = stream
				.filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.getJobId().contentEquals("IT_PROG");
				}
			
		})
		.flatMaptoInt(new Function<Employee, IntStream>(){

			@Override
			public IntStream apply(Employee t) {
				
				return IntStream.of(t.getSalary());
			}
			
		})
		.average();
		System.out.println("평균급여는 : " + avg.getAsDouble());
	
	}

}
