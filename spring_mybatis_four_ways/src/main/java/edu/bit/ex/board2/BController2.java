package edu.bit.ex.board2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// < 방법 2 >
// 1. dao interface는 필요가 없음
// 2. sqlSession에서 제공하는 함수(selectList, selectOne..)을 이용함
// 3. 쿼리 구현을 위한 xml이 필요. 해당 xml의 namespace는 개발자가 정함

@Controller
public class BController2 {

	@Autowired
	BService2 bService;

	@RequestMapping("/list2")
	public String list1(Model model) throws Exception {
		System.out.println("list2()");

		model.addAttribute("list", bService.selectBoardList());
		return "list";
	}
}
