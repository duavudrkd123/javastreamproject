package stream.intermediate;
import java.lang.reflect.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

enum Gender { //열거형 타입, male, female 두개만 올수있다.
MALE, FEMALE;
}

public class Employee2 {
	String name;
	Gender gender;
	LocalDate dateOfBirth;
	double income;
	
	public Employee2(String name, Gender gender, LocalDate dateOfBirth, double income) {
		super();
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.income = income;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public boolean isMale() {
		return this.gender == Gender.MALE;
	}
	public boolean isFemale() {
		return this.gender == Gender.FEMALE;
	}
	@Override
	public String toString() {
		String str = String.format("(%s, %s, %s, %.2f)", name, gender, dateOfBirth, income); //%.2f는 인트타입, 다른건 스트링 타입
		return str;
	}
	public static List<Employee2> employees() {
		Employee2 e1 = new Employee2("Hong", Gender.MALE, LocalDate.of(1991, Month.JANUARY,1), 2343.0);
		Employee2 e2 = new Employee2("kang", Gender.FEMALE, LocalDate.of(1994, Month.FEBRUARY,14), 12343.0);
		Employee2 e3 = new Employee2("sang", Gender.MALE, LocalDate.of(1992, Month.JULY,12), 23.0);
		Employee2 e4 = new Employee2("dang", Gender.FEMALE, LocalDate.of(1993, Month.AUGUST,21), 23443.0);
		Employee2 e5 = new Employee2("wang", Gender.MALE, LocalDate.of(1997, Month.NOVEMBER,9), 5343.0);
		Employee2 e6 = new Employee2("tang", Gender.FEMALE, LocalDate.of(1999, Month.MARCH,15), 9413.0);
		List<Employee2> employees = Arrays.asList(e1, e2,e3,e4,e5,e6);
		return employees;
	}

}
