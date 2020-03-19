package edu.bit.aop;

public class Student { // 핵심기능

	private String name;
	private int age;
	private int gradeNum;
	private int classNum;

	public Student() {

	}

	public void getStudentInfo() {
		System.out.println("이름은 : " + getName());
		System.out.println("나이는 : " + getAge());
		System.out.println("학년은 : " + getGradeNum());
		System.out.println("반은 : " + getClassNum());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGradeNum() {
		return gradeNum;
	}

	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

}
