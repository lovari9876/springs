package edu.bit.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application content page.
 */

@Controller // spring MVC에서 자동생성되는 Controller
public class ContentController {

	private static final Logger logger = LoggerFactory.getLogger(ContentController.class);

	// url-mapping //
//	DispatcherServlet 객체가 /board/content.jsp 호출해준다~~
	@RequestMapping(value = "/board/content", method = RequestMethod.GET)
	public String content(Model model) {
		logger.info("/board/content 실행");
		model.addAttribute("id", 30);

		return "board/content";
	}

}
