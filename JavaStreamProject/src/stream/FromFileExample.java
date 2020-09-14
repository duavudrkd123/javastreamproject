package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileExample {
	public static void main(String[] args) {
		String file = "src/stream/StreamExample.java"; //최상위 위치는 프로젝트가 있는 위치
		Path path = Paths.get(file);
		try {
			Stream<String> stream = Files.lines(path);
			stream.forEach(s -> System.out.println(s));
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
