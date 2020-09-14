package stream.collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


import stream.intermediate.Student;

public class CollectionExample {
	public static void main(String[] args) {
		Set<String> setStr = new HashSet<>();//문자열을 담고싶으면, set은 순서가 없이 저장
		setStr.add(new String("최재영"));// 문자를 담을소 있다
		setStr.add(new String("재영"));
		setStr.add(new String("최재"));
		setStr.add(new String("최영"));
		
		//출력하기
	Iterator<String> iter= setStr.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
		}
		
		List<Student> student = new ArrayList<>();
//		여기는 스튜던트의 인스턴스만 담을수있다
		student.add(new Student("허성준", 80));
		student.add(new Student("성준", 120));
		//출력하기
		for(Student s : student) {
			System.out.println(s);
		}
		
		List<Student> studentw = new ArrayList<>();
//		여기는 스튜던트의 인스턴스만 담을수있다
		studentw.add(new Student("김도은", 75));
		studentw.add(new Student("김다희", 140));
		
		List<Student> studentr = new ArrayList<>();
		studentr.add(new Student("김정은", 26));
		studentr.add(new Student("김정은동지", 36));
		studentr.add(new Student("정은동지", 46));
		studentr.add(new Student("김정일", 76));
		
		Map<String, Integer> map = new HashMap<>(); //키하고 벨류형ㅅ ㅣㄱ을 저장함Map<Key, Value>
		map.put("동광희", 30);
		map.put("김시무", 33);
		Set<String> key = map.keySet(); //key를 기준으로 벨류를 가져올수있다. key는 String을 담고있는 Set컬렉션이다.
		 Iterator<String> itr = key.iterator();
		 while(itr.hasNext()) {
			 String k = itr.next(); //key에 해댕되ㅡㄴ 값을 가지고
			 System.out.println(map.get(k)); // value값을 가지고 온다.
		 }
		
		Map<String, List<Student>> stMap = new HashMap<>();
		stMap.put("남자", student);
		stMap.put("여자", studentw);
		stMap.put("재평가", studentr);
		
		Set<String> setk = stMap.keySet();
		for(String s : setk) {
			System.out.println(s);
			List<Student> valueList = stMap.get(s); // key에 해당하는 ㅂ=value를 가져옴
			for(Student st : valueList) {
				System.out.println(st);
			}
		}
	}

}

