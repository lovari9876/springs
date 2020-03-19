package spring.chap6.ex02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Student2 student1 = ctx.getBean("student1", Student2.class);
		System.out.println("이름: " + student1.getName());
		System.out.println("나이: " + student1.getAge());
		System.out.println("취미: " + student1.getHobbies());
		System.out.println("신장: " + student1.getHeight());
		System.out.println("몸무게: " + student1.getWeight());

		System.out.println("======================");

		Student2 student2 = ctx.getBean("student2", Student2.class);
		System.out.println("이름: " + student2.getName());
		System.out.println("나이: " + student2.getAge());
		System.out.println("취미: " + student2.getHobbies());
		System.out.println("신장: " + student2.getHeight());
		System.out.println("몸무게: " + student2.getWeight());

		System.out.println("======================");

		Rectangle rec = ctx.getBean("rectangle", Rectangle.class);
		System.out.println("넓이: " + rec.getArea());

		ctx.close();
	}
}