package spring.chap14.ex2;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	private static final Logger logger = LoggerFactory.getLogger(RedirectController.class);

	// =============<redirect/ forward>=============================

	@RequestMapping(value = "/studentConfirm")
	public String studentConfirm(HttpServletRequest req, Model model) {
		logger.info("studentConfirm");

		String id = req.getParameter("id");

		if (id.equals("abc"))
			return "redirect:studentOk"; // 연결할 주소(아래 메소드에서 매핑해둔 주소) 입력
		// http://localhost:8282/ex/board/studentConfirm?id=abc 입력시에
		// http://localhost:8282/ex/board/studentOk 라고 주소가 바뀌며 redirect된다.

		return "redirect:studentNg";
	}

//	@RequestMapping(value = "/studentConfirm")
//	public String studentConfirm(HttpServletRequest req, Model model) {
//		logger.info("studentConfirm");
//
//		String id = req.getParameter("id");
//
//		if (id.equals("abc"))
//			return "forward:studentOk"; // 연결할 주소(아래 메소드에서 매핑해둔 주소) 입력
//		// http://localhost:8282/ex/board/studentConfirm?id=abc
//		// 입력시에 studentOk.jsp가 forward 된다. 즉, 주소 변화없이 페이지만 로드된다.
//
//		return "forward:studentNg";
//	}

	@RequestMapping(value = "/studentOk")
	public String studentOk(Model model) {
		logger.info("studentOk");

		return "chap14/studentOk";
	}

	@RequestMapping(value = "/studentNg")
	public String studentNg(Model model) {
		logger.info("studentOk");

		return "chap14/studentNg";
	}
}
