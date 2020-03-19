package edu.bit.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	Student student;

	@Autowired
	Worker worker;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Welcome home!");

		student.getStudentInfo();
		worker.getWorkerInfo();

		return "home";
	}

	// 콘솔 출력 로그
//	INFO : edu.bit.ex.HomeController - Welcome home!
//	Student.getStudentInfo() is start. 
//	이름은 : 홍길동
//	나이는 : 10
//	학년은 : 3
//	반은 : 5
//	Student.getStudentInfo() is finished.
//	Student.getStudentInfo()걸리는 시간: 9
//	Worker.getWorkerInfo() is start. 
//	이름은 : 홍길순
//	나이는 : 35
//	직업은 : 개발자
//	Worker.getWorkerInfo() is finished.
//	Worker.getWorkerInfo()걸리는 시간: 4

}
