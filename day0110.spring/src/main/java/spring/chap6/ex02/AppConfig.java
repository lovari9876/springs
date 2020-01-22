package spring.chap6.ex02;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// annotation 으로 객체 생성할 때의 장점:
// => 자바코드로 객체 생성하기에 디버깅 가능(.xml은 불가능!!)
@Configuration
public class AppConfig {

	@Bean // student1 이 된다.
	public Student2 student1() {
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("수영");
		hobbies.add("요리");

		Student2 student = new Student2("김다다", 20, hobbies);
		student.setHeight(180);
		student.setWeight(80);

		return student;
	}

	@Bean // student1 이 된다.
	public Student2 student2() {
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("노래");
		hobbies.add("사진찍기");

		Student2 student = new Student2("김라라", 20, hobbies);
		student.setHeight(210);
		student.setWeight(20);

		return student;
	}

	@Bean
	public Rectangle rectangle() {
		Rectangle rec = new Rectangle(3.58, 4);

		return rec;
	}
}
