package edu.bit.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/error")
public class ErrorController {
	
	private static final Logger logger = LoggerFactory.getLogger(ErrorController.class);
	
	@RequestMapping(value = "/404")
	public String error404(Model model) {
		logger.info("error404");
		logger.info("에러 처리 매핑");
		// 404 에러 발생 시 처리할 내용이 있으면 처리를 시킴
		// => http://localhost:8282/board/error/404 를 치면 에러페이지로 이동
		// =>> 매핑에 따라서 return값으로 이동하는 것!
		
		return "error/error404";
	}
	
}
