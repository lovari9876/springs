package spring.chap7.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// IoC container 즉 spring이 객체 생성을 담당하기에 
// 객체가 생성되고 죽는 lifeCycle 관리를 개발자가 완벽히 control할 수 없다. 
// 만약 입금을 마치기 전에 객체가 close() 되어 죽는다면 큰 문제가 발생할 것.
// 그래서 반드시 destroy() 메소드 등을 제공해주어야 한다!!!!
// 객체가 죽기 전에 반드시 수행해야 할 로직을 {} 에 서술해야함
public class Student implements InitializingBean, DisposableBean {
	private String name;
	private String age;
	private String gradeNum;
	private String classNum;

	public Student() {
		System.out.println("생성자 호출");
	};

	public Student(String name, String age, String gradeNum, String classNum) {
		super();
		this.name = name;
		this.age = age;
		this.gradeNum = gradeNum;
		this.classNum = classNum;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() 호출");
	} // 객체가 죽을 때 호출된다. ctx.close() 하고나서 호출된다.

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() 호출");
	} // 생성자 호출되고 나서야 호출된다.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGradeNum() {
		return gradeNum;
	}

	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}

	public String getClassNum() {
		return classNum;
	}

	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}

}
