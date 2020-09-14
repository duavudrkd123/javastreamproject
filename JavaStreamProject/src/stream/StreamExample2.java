package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Student {
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	int score;

}

public class StreamExample2 {
	public static void main(String[] args) {
		// 최재영, 90 / 민해주 88 / 김상민 83/ 최형준 86 리스트 컬렉션에 넣ㅎ어보자
		// score >= 85 몇명인지 rcnt 변수에 담아주세요.
		// 출력.
		List<Student> list = Arrays.asList(new Student("홍길동", 90), new Student("염길동", 88), new Student("신길동", 83),
				new Student("박길동", 86));

		Stream<Student> students = list.stream();
		long iCnt = 0;
		students.filter((t) -> t.score >= 85) 
				.peek((t) -> System.out.println("peek => " + t.name + ", " + t.score)) //
				.filter(t -> t.name.startsWith("염")) // for이치에서 걸러서 보여준다.
				.forEach(new Consumer<Student>() {

					@Override
					public void accept(Student t) {
						// TODO Auto-generated method stub
						System.out.println("forEach = >" + t.name+", " + t.score);
					}

				});
		System.out.println("총인원: " + iCnt);
	}
}
