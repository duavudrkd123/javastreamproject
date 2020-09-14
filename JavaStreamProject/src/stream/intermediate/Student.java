package stream.intermediate;

import java.util.Objects;

public class Student {
	String name;
	int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
//	@Override
//	public int hashCode() {
//		return this.score; //점수제거
//		return this.name.hashCode(); 
//	}
//
//	@Override
//	public boolean equals(Object obj) { 
//		if (obj instanceof Student) {
//
//			Student that = (Student) obj;
////			return this.score == that.score; // 점수 같으면 제거
//			return this.name == that.name;
//		} else {
//			return false;
//		}
//	}
	@Override
	public int hashCode() {
		return Objects.hashCode(this.name) + this.score; 
	}

	@Override
	public boolean equals(Object obj) { 
		if (obj instanceof Student) {

			Student that = (Student) obj;
			return this.name.equals(that.name)&& (this.score==that.score);
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
		
	}
//여기다가 컴페어를 만들어줄수있다/.
}

