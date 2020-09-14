package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		// 컬렉션 => 외부반복자
		List<String> users = Arrays.asList("홍길동", "염길동", "신길동", "박길동");
		System.out.println("외부반복자 사용 ~~~");
		Iterator/* 반복을 가져오는 메소드 */<String> iter = users.iterator(); // 반복자 (iterator)
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str.toString());
		}

		// 스트림 => 내부반복자
		System.out.println("내부반복자 사용 ~~~~");
		Stream<String> streams = users.stream();
		// 반복된 요소를 처리하기위해 스트링이 가지고 있는 메소드를 사용할것
		// forEach를
		streams.forEach((t) -> System.out.println(t.toString())); // t의 tostring 타입으로 구현해주겠다.

	}
}
