package spring.chap7.lifeCycle;

import javax.annotation.*;

public class OtherStudent {
	private String name;
	private String age;
	private String gradeNum;
	private String classNum;

	// 이 annotation들은 안먹음. 자바 1.8이상의 버젼에서 금지된 용법. 쓰지말기.
	@PostConstruct
	public void initMethod() {
		System.out.println("initMethod() 호출");
	} 

	@PreDestroy
	public void destroyMethod() {
		System.out.println("destroyMethod() 호출");
	}

	public OtherStudent() {
	};

	public OtherStudent(String name, String age, String gradeNum, String classNum) {
		super();
		this.name = name;
		this.age = age;
		this.gradeNum = gradeNum;
		this.classNum = classNum;
	}

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
