package spring.chap15.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

	// 공식이니까 외우기 => 이해 불가. 걍 외워(쌤도 모르신댔음)
	@Override
	public boolean supports(Class<?> arg0) {
		return Student.class.isAssignableFrom(arg0); // 검증할 객체의 클래스 타입 정보
	}

	// 여기서부터 검증로직 시작
	@Override
	public void validate(Object obj, Errors errors) {
		System.out.println("validate()"); // 디버깅코드 // 잘 호출되었는가 확인
		Student student = (Student) obj; // Object를 Student로 형변환

//		String studentName = student.getName(); // 검증대상 갖고와
//
//		// studentName이 널이거나 앞뒤공백잘랐는데 length가 0일때
//		if (studentName == null || studentName.trim().isEmpty()) {
//			System.out.println("studentName is null or empty");
//			errors.rejectValue("name", "trouble"); // (필드네임, 에러코드)
//		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "trouble");
		// 클래스 이름으로 호출하므로 static 함수
		// if문으로 null과 공백 거르는 로직을 함수로 대체 가능!

		int studentId = student.getId(); // 검증대상 갖고와

		if (studentId == 0) {
			System.out.println("studentId is 0");
			errors.rejectValue("id", "trouble"); // (필드네임, 에러코드)
		}
	}
}
