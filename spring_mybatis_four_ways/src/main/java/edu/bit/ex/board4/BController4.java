package edu.bit.ex.board4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// < 방법 4 >
// 1. 방법1과 같은 방식임. 대신 sqlSession.getMapper 함수를 사용하지 않음
// 2. 간단하고 심플함
// 3. root~.xml에 아래 두 줄을 추가
// <!-- Mapper Interface --> 
// <mybatis-spring:scan base-package="edu.bit.ex"/> 
// 4. 방법3과 방법4를 혼용하여 쓸 수 있다. 간단한 쿼리는 @()에 때려넣으면 되니까!

@Controller
public class BController4 {

	@Autowired
	BService4 bService;

	@RequestMapping("/list4")
	public String list1(Model model) throws Exception {
		System.out.println("list4()");

		model.addAttribute("list", bService.selectBoardList());
		return "list";
	}
}
