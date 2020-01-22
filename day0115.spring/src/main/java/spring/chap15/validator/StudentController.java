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

	// 유효성 검사
//	@RequestMapping("/student/create")
//	public String studentCreate(Student student, BindingResult result) {
//		String page = "createDonePage";
//
//		StudentValidator validator = new StudentValidator();
//		validator.validate(student, result); // Errors errors = result; 다형성 적용!
//
//		// errors.rejectValue() 로 등록한 에러가 있는지 검사하여 있으면 다시 가입하라고 하는 것
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
//		validator.validate(student, result); // Errors errors = result; 다형성 적용!
// 두 줄 주석 처리한 것을 @Valid와 @InitBinder가  알아서 해준다. 
		if (result.hasErrors()) {
			page = "createPage";
		}
		return page;
	}

	// @Valid 와 같이 있어야 한다.
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new StudentValidator());
	}
}
