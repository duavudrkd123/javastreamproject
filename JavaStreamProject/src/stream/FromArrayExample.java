package stream;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FromArrayExample {
	public static void main(String[] args) {
		int[] intAry = { 3, 6, 4, 9, 7, 8 }; // int배열의 intary라는 배열변수를 주는거
		IntStream iStream = Arrays.stream(intAry); // 변수형 배열을 받았다. 정수들을 받아서
		iStream.filter((value) -> value > 5) // 5이상만 출력해주겠다
		.forEach((value) -> System.out.println("value: " + value));
		
		iStream = Arrays.stream(intAry);
//		long cnt = iStream.count(); //세어주는거 기본함수
		long cnt = iStream.sum(); // 더해주는거 기본 함수
		System.out.println("cnt: " + cnt); 
		
		iStream = Arrays.stream(intAry, 0, 4); // 인덱스값이 4이상의 값은 제외 하겠다  시작위치는 0 종료위치는 3 
//		cnt = iStream.count();
//		cnt = iStream.sum();
		cnt = iStream.peek(t -> System.out.println("peek: " + t)).count();
		System.out.println("cnt: " + cnt);
	}
}