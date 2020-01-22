package spring.chap12.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.chap13.ex.Member;
import spring.chap14.ex2.StudentInformation;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/board") // root다음에 나오는 주소...
// 이후에 RequestMapping 시 주소를 /board 이후만 매핑해주면 된다.
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "board/home";
	}

	// ===================객체의 값 가져오기=========================

	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write(Model model) {
		logger.info("write");

		return "board/write";
		// http://localhost:8282/ex/board/write 를 치면 write.jsp가 뜬다.
	}

	@RequestMapping(value = "/confirm", method = RequestMethod.GET)
	public String confirm(HttpServletRequest req, Model model) {
		logger.info("confirm");

		String id = req.getParameter("id");
		String pw = req.getParameter("pw");

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "board/confirm";
		// http://localhost:8282/ex/board/confirm 를 치면 confirm.jsp가 뜬다.
	}

	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public String confirm(@RequestParam("id") String id, @RequestParam("pw") int pw, Model model) {
		// @RequestParam을 사용시 request객체에서 가져온 파라미터 값도 String to int로 형변환 해준다.
		// 스프링컨테이너가 숫자에 한해 형변환 해주기에 그냥 저렇게 사용하면 된다.
		logger.info("check");

		model.addAttribute("id", id);
		model.addAttribute("pw", pw);

		return "board/check";

	}

	// =======================================================
	// 그냥 객체만 만들어두는 방식..

	@RequestMapping(value = "/member/join", method = RequestMethod.GET)
	public String join(Member member) {
		logger.info("join");

		return "member/join";
	}

	// ======================<form 받아오기>===========================

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		logger.info("index");

		return "chap14/index";
	}

	// form action 도착지
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String student(HttpServletRequest req, Model model) {
		logger.info("student");

		System.out.println("RequestMethod.POST"); // 이것은 디버깅코드. 잘 실행되는지 확인용
		String id = req.getParameter("id");
		System.out.println("id: " + id);
		model.addAttribute("id", id);

		return "chap14/student";
	}

	// return ModelAndView => 매핑 시에 /안붙여줌!
	@RequestMapping(value = "indexStudent", method = RequestMethod.GET)
	public ModelAndView student(HttpServletRequest req) {
		logger.info("RequestMethod.GET");// 디버깅코드

		String id = req.getParameter("id");
		System.out.println("id : " + id);

		ModelAndView mv = new ModelAndView(); // 리턴하기 위해 객체 생성!
		mv.addObject("id", id);
		mv.setViewName("chap14/indexStudent");

		return mv;
	}

	@RequestMapping(value = "/studentView")
	public String studentView(@ModelAttribute("studentInfo") StudentInformation studentInformation) {
		logger.info("studentView");

		// 파라미터가 다음과 같은 로직을 처리
		// model.addAttribute("studentInfo", studentInformation);
		return "chap14/studentView";
	}

}
