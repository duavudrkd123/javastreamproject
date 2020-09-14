package stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class DoubleStreamExample {
	public static void main(String[] args) {
		double[] dAry = { 2.3, 4.5, 8.3, 5.5, 4.6 };
		double sum = 0.0;
		// 스트림을 생성하고 5보다 작은 반복요소를 필터하고 합을 구하세요.
		DoubleStream dda = Arrays.stream(dAry);
		double sum=dda.filter((value) -> value < 5).forEach(sum -> System.out.println("값은" + (sum)));

	}
}
