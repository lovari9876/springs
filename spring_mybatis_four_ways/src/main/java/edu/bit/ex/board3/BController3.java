package edu.bit.ex.board3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// < ��� 3 >
// 1. �������̽� ���� @ �� ���̴� ����
// 2. xml�� �ʿ� ����, sqlSession ��ü �ʿ� ����.
// 3. root~.xml�� �Ʒ� �� ���� �߰�
// (������̼� ��ĵ�Ͽ� ��ü �������ִ� ��)
// <!-- Mapper Interface --> 
// <mybatis-spring:scan base-package="edu.bit.ex"/> 
// 3. ������ ������� ����ϱ� ����(@ �� ��ȣ �ȿ� �� ���� �����..)

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
