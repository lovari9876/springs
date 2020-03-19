package spring.chap15.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

	// �����̴ϱ� �ܿ�� => ���� �Ұ�. �� �ܿ�(�ܵ� �𸣽Ŵ���)
	@Override
	public boolean supports(Class<?> arg0) {
		return Student.class.isAssignableFrom(arg0); // ������ ��ü�� Ŭ���� Ÿ�� ����
	}

	// ���⼭���� �������� ����
	@Override
	public void validate(Object obj, Errors errors) {
		System.out.println("validate()"); // ������ڵ� // �� ȣ��Ǿ��°� Ȯ��
		Student student = (Student) obj; // Object�� Student�� ����ȯ

//		String studentName = student.getName(); // ������� �����
//
//		// studentName�� ���̰ų� �յڰ����߶��µ� length�� 0�϶�
//		if (studentName == null || studentName.trim().isEmpty()) {
//			System.out.println("studentName is null or empty");
//			errors.rejectValue("name", "trouble"); // (�ʵ����, �����ڵ�)
//		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "trouble");
		// Ŭ���� �̸����� ȣ���ϹǷ� static �Լ�
		// if������ null�� ���� �Ÿ��� ������ �Լ��� ��ü ����!

		int studentId = student.getId(); // ������� �����

		if (studentId == 0) {
			System.out.println("studentId is 0");
			errors.rejectValue("id", "trouble"); // (�ʵ����, �����ڵ�)
		}
	}
}
