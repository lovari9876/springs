package spring.chap6.ex01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configLocation = "classpath:appCTX_student.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);

		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		studentInfo.getStudentInfo();

		// student2의 정보도 뿌리고 싶을때!
		Student student2 = ctx.getBean("student2", Student.class);
		studentInfo.setStudent(student2);
		studentInfo.getStudentInfo();

		ctx.close();

	}

}
