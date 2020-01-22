package edu.bit.ex.board2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// < ��� 2 >
// 1. dao interface�� �ʿ䰡 ����
// 2. sqlSession���� �����ϴ� �Լ�(selectList, selectOne..)�� �̿���
// 3. ���� ������ ���� xml�� �ʿ�. �ش� xml�� namespace�� �����ڰ� ����

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
