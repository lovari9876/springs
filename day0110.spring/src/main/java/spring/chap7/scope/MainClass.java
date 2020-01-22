package spring.chap7.scope;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX2.xml");

		Student student1 = ctx.getBean("student", Student.class);
		student1.setName("김가가");
		student1.setAge("10");
		System.out.println("이름: " + student1.getName());
		System.out.println("나이: " + student1.getAge());

		System.out.println("============================");

		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("김마마");
		student2.setAge("20");
		System.out.println("이름: " + student2.getName());
		System.out.println("나이: " + student2.getAge());

		System.out.println("============================");

		System.out.println("이름: " + student1.getName());
		System.out.println("나이: " + student1.getAge());
		// 잉? 놀랍게도 원래값을 뿌리는게 아니라 김마마를 뿌린다.
		// 검사해보자

		if (student1.equals(student2))
			System.out.println("student1 == student2");
		else
			System.out.println("student1 != student2");
		// 결과: 둘은 같은 객체이다. 왜? appCTX2.xml에서 Student 객체를 생성한 뒤
		// 받아와서 student1객체에 대입하고
		// student2 객체에도 아까 받아온 동일한 객체를 대입하기 때문!!
		// 동일한 객체를 공유하니까 이렇게 되는것.

		ctx.close();

	}
}
