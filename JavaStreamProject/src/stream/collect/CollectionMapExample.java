package stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionMapExample {
	public static void main(String[] args) {
		Student s1 = new Student("허성준", 23, Gender.MALE);
		Student s2 = new Student("Ali", 27, Gender.FEMALE);
		Student s3 = new Student("인성문제있O~~", 45, Gender.MALE);
		Student s4 = new Student("홍우조", 25, Gender.FEMALE);
		List<Student> students = Arrays.asList(s1, s2, s3, s4);

		Map<String, Integer> map = students.stream().filter(s -> s.age > 20) // 이거 이름이랑 나이가져오는거
				.collect(Collectors.toMap(new Function<Student, String>(/* 구현객체 */) {

					@Override
					public String apply(Student t) {
						return t.name;
					}
					/* 구현객체 라고 함 */}, new Function<Student, Integer>() {

						@Override
						public Integer apply(Student t) {
							return t.age;
						}
					}));
		Set<String> keys = map.keySet();
		for (String s : keys) { 
			System.out.println("이름: " + s + ", 나이: " + map.get(s));
		}
	}

}
