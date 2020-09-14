package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample3 {
	static int sum = 0, cnt = 0;
	
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90), new Student("염길동", 88), 
				new Student("신길동", 83), new Student("박길동", 86));
		
		Stream<Student> streams = list.stream();
		// forEach ( 총점수ㅡ 평균 가지고 오는 기능 구현.);
		streams.forEach(new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				// TODO Auto-generated method stub
				sum += t.score;
				cnt++;
			}
			
		});
		System.out.println("총점: "+sum + ", 평균:" + (sum/(double) cnt));
		
		
		//reduction으로 했다는데 뭔지 모르겠음
//		int sum = list.stream()
//				.mapToInt(Student :: getScore)
//				.sum();
//		System.out.println("sum: " + sum);
	

			}
		}