package stream.collect;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

enum Gender {
	MALE, 
	FEMALE;
}
class Student{
	String name;
	int age;
	Gender gender;
	public Student(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
}

public class CollectionToListExample {
	public static void main(String[] args) {
		Student s1 = new Student("허성준", 23, Gender.MALE);
		Student s2 = new Student("Ali", 27, Gender.FEMALE);
		Student s3 = new Student("인성문제있O~~", 45, Gender.MALE);
		Student s4 = new Student("홍우조", 25, Gender.FEMALE);
		List<Student> students = Arrays.asList(s1,s2, s3, s4);
		
//		students.stream().filter(s ->s.gender == Gender.MALE)
//		.forEach(s ->System.out.println(s.name + ", " + s.age));
//		// male인  거만 뽑아오기
//		Collector<Student, ?, List<Student>> collector = Collectors.toList();
//		List<Student> newList = students.parallelStream() //
//				.filter(s -> s.gender == Gender.MALE) //
//		.collect(collector);
//		
//		newList.stream()//
//		.forEach(s->System.out.println(s.name + "," + s.age));
		// Set을 사용해서 25세 이상만 불러오기
		Set<Student> set = students.parallelStream().filter(s -> s.age > 25)
				.collect(Collectors.toSet());
		
		Iterator<Student> iter = set.iterator();
		while (iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s.name + ", "+ s.age);
		}
		
	}

}
