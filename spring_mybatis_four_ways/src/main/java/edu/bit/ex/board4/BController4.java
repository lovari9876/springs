package edu.bit.ex.board4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// < ��� 4 >
// 1. ���1�� ���� �����. ��� sqlSession.getMapper �Լ��� ������� ����
// 2. �����ϰ� ������
// 3. root~.xml�� �Ʒ� �� ���� �߰�
// <!-- Mapper Interface --> 
// <mybatis-spring:scan base-package="edu.bit.ex"/> 
// 4. ���3�� ���4�� ȥ���Ͽ� �� �� �ִ�. ������ ������ @()�� ���������� �Ǵϱ�!

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
