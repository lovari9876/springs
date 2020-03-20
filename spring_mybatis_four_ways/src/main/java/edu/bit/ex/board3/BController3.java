package edu.bit.ex.board3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// < 방법 3 >
// 1. 인터페이스 위에 @ 을 붙이는 형식
// 2. xml이 필요 없음, sqlSession 객체 필요 없음.
// 3. root~.xml에 아래 두 줄을 추가
// (어노테이션 스캔하여 객체 생성해주는 것)
// <!-- Mapper Interface --> 
// <mybatis-spring:scan base-package="edu.bit.ex"/> 
// 3. 쿼리가 길어지면 사용하기 힘듦(@ 의 괄호 안에 다 적기 힘들다..)

@Controller
public class BController3 {

	@Autowired
	BService3 bService;

	@RequestMapping("/list3")
	public String list1(Model model) throws Exception {
		System.out.println("list3()");

		model.addAttribute("list", bService.selectBoardList());
		return "list";
	}
}
