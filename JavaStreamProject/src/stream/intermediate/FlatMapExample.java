package stream.intermediate;

import java.time.LocalDate;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class FlatMapExample { // 매칭하는거
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		stream.flatMap(new Function<Integer/* 이게 매게값 */, Stream/* 이건 반환값 */<Integer>>() {

			@Override
			public Stream<Integer> apply(Integer t) {
				return Stream.of(t * 2);
			}

		}).forEach(System.out::println);// 2가 곱해진다.
// 값을 출력하고 더하는거
		OptionalDouble result = Employee2.employees().stream().flatMapToDouble(new Function<Employee2, DoubleStream>() {

			@Override
			public DoubleStream apply(Employee2 t) {
				return DoubleStream.of(t.income);
			}
		}).reduce(new DoubleBinaryOperator() {

			@Override
			public double applyAsDouble(double left, double right) {
				System.out.println(left + ", " + right);
				return left + right;
			}

		});

		if (result.isPresent()) // 이게 참이면
			System.out.println("결과: " + result); // 출력
		else // 거짓이면
			System.out.println("결과가 없음"); // 출력
		Employee2.employees().stream().flatMap(new Function<Employee2, Stream<String>>() {

			@Override
			public Stream<String> apply(Employee2 t) {
				return Stream.of(t.getName());
			}

		}).findFirst().ifPresent(/* consumer);( */System.out::println);
		System.out.println("-----------------------------날짜 가져오는거");
		Optional<LocalDate> result2 = Employee2.employees().stream()
				.flatMap(new Function<Employee2, Stream<LocalDate>>() {

					@Override
					public Stream<LocalDate> apply(Employee2 t) {
						return Stream.of(t.getDateOfBirth());
					}

				}).reduce(new BinaryOperator<LocalDate>() {

					@Override
					public LocalDate apply(LocalDate t, LocalDate u) {
						System.out.println(t + ", " + u);
						return t.isBefore(u) ? u : t;
					}
				});
		System.out.println("min 값: " + result2);
//	.forEach(System.out::println); //날짜 출력해주는거
		// babottongGaeya homemart siji bojimara
	}
}
