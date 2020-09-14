package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class IntExample {
	public static void main(String[] args) {
		// 1~10까지 정수형 배열
		// 배열로부터 스트림을 생성하는 방법/
		// 스트림을 생성하고 filter를 통해서 짝수값을 최종집계처리하는
		// sum()을 구현
	
	int[] intary = {1,2,3,4,5,6,7,8,9,10};
	
	IntStream iStream = Arrays.stream(intary);
	iStream.filter((value) -> value%2 == 0 )
	.forEach((value) -> System.out.println("짝수값은 " + value));
	
	iStream = Arrays.stream(intary); //먼데 이거?

	IntStream iStream1 = Arrays.stream(intary); // 먼데 이게
	
	int sum=iStream1.filter((value) -> value%2 == 0 ) // 먼데
	.sum();
	System.out.println("짝수값의 합: " + sum);
	
	// 1~10 까지 정수형 배열.
	// 배열로 부터 스트림을 생성하는 방법.
	// 스트림을 생성하고 fillter를 통해서 짝수값을 
	// 최종 집계처리는 sum()을 가져오는 코드구현.
	
	IntStream.range(1, 10).forEach(s -> System.out.println(s));
	System.out.println("--RangeClosed");
	IntStream.rangeClosed(1, 10).filter(n->n>5).forEach(System.out::println);

	

}
}