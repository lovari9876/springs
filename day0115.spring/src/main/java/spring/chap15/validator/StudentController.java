package spring.chap15.validator;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@RequestMapping("/studentForm")
	public String studentForm() {

		return "createPage";
	}

	// ��ȿ�� �˻�
//	@RequestMapping("/student/create")
//	public String studentCreate(Student student, BindingResult result) {
//		String page = "createDonePage";
//
//		StudentValidator validator = new StudentValidator();
//		validator.validate(student, result); // Errors errors = result; ������ ����!
//
//		// errors.rejectValue() �� ����� ������ �ִ��� �˻��Ͽ� ������ �ٽ� �����϶�� �ϴ� ��
//		if (result.hasErrors()) {
//			page = "createPage";
//		}
//
//		return page;
//	}

	@RequestMapping("/student/create")
	public String studentCreate(@Valid Student student, BindingResult result) {
		String page = "createDonePage";

//		StudentValidator validator = new StudentValidator();
//		validator.validate(student, result); // Errors errors = result; ������ ����!
// �� �� �ּ� ó���� ���� @Valid�� @InitBinder��  �˾Ƽ� ���ش�. 
		if (result.hasErrors()) {
			page = "createPage";
		}
		return page;
	}

	// @Valid �� ���� �־�� �Ѵ�.
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new StudentValidator());
	}
}
