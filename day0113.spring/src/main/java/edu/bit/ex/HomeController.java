package edu.bit.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */

@Controller // spring MVC에서 자동생성되는 Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	// url-mapping //
//	DispatcherServlet 객체가 home.jsp 호출해준다~~
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		// Model은 command, dao, dto 등을 전부 포함한 로직 덩어리이다.
		// Model의 역할: view에 데이터 혹은 객체 전달!
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		// home.jsp에 전달할 객체 serverTime을 set해준다링

		return "home"; // home.jsp (view) 리턴
	}

	@RequestMapping(value = "/board/view", method = RequestMethod.GET)
	public String view() {
		// Model은 command, dao, dto 등을 전부 포함한 로직 덩어리이다.
		// Model의 역할: view에 데이터 혹은 객체 전달!
		logger.info("/board/view 실행");
		// console에 다음과 같이 출력된다.
		// INFO : edu.bit.ex.HomeController - /board/view 실행

		return "board/view"; // board/view.jsp (view) 리턴
	}

	@RequestMapping(value = "/board/content", method = RequestMethod.GET)
	public String content(Model model) {
		logger.info("/board/content 실행");
		model.addAttribute("id", 30);

		return "board/content";
	}

}
