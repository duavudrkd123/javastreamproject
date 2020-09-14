package stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionMapGroupByExample {
	public static void main(String[] args) {
		Student s1 = new Student("허성준", 23, Gender.MALE);
		Student s2 = new Student("Ali", 27, Gender.FEMALE);
		Student s3 = new Student("인성문제있O~~", 45, Gender.MALE);
		Student s4 = new Student("홍우조", 25, Gender.FEMALE);
		List<Student> students = Arrays.asList(s1, s2, s3, s4);
		
		Map<Gender, List<Student>> map; //Map<Gender, Student> map; 이렇게 하면 그룹으로 안묶여서 저렇게 해주어야된다.
		
		//Gender.MALE - Student1, Student2;
//		GenDer.FEMALE - Student3, Student4;
		
		
		Map<Gender, List<Student>> gMap = students.stream()
				.collect(Collectors.groupingBy(new Function<Student, Gender>() {
			@Override
			public Gender apply(Student t) {
				return t.gender;
			}
			}, Collectors.toList()));
			
		Set<Gender> set = gMap.keySet();
		for (Gender g : set) {
			System.out.println(g);
			List<Student> list = gMap.get(g);
			for (Student s : list) {
				System.out.println("이름은: "+ s.name+"\t나이는:"+s.age);
			}
		
	}
}
}
