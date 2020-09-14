package stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class DistinctExample {
	public static void main(String[] args) {
		String[] strAry = {"Hong", "Park", "Choi", "Hong" };
		Stream<String> sStream = Arrays.stream(strAry);
		sStream.distinct().forEach(System.out::println); //distinct는 중복되는거 제거 해주는 거
		//위에꺼는 중복제거가 되는데
		//밑에꺼는 안된다. 주소값이라서
		Student[] students = {
				new Student("뽀삐", 50), 
				new Student("파다코코넛", 60), 
				new Student("조영베이비", 70), 
				new Student("조영베이비", 80),
				new Student("떵쟁이", 70) };
		Stream<Student> tStream = Arrays.stream(students);
		tStream.distinct().forEach(System.out::println);
		
		///////////////////////////////////////////////////sort하기
		System.out.println("---------------------Sort 하기--------------------------");
		String[] sstrAry = {"Hong", "Park", "Choi", "Hong" };
		Stream<String> ssStream = Arrays.stream(sstrAry);
		
		sStream = Arrays.stream(sstrAry);
		sStream.sorted().forEach(System.out::println);
		Student[] sstudents = {
				new Student("뽀삐", 50), 
				new Student("파다코코넛", 60), 
				new Student("조영베이비", 70), 
				new Student("조영베이비", 80),
				new Student("떵쟁이", 70) };
		Stream<Student> stStream = Arrays.stream(sstudents);
		stStream.sorted(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.score - o1.score;
			
			}
		}).forEach(System.out::println);
		
		
		}
		
	}


