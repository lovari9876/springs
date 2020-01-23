package json.eshopper.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import json.eshopper.emp.service.EmpService;
import json.eshopper.emp.vo.EmpVO;


// @Controller + @ResponseBody => 이제  @RestController로 바뀐것!!!
// @RestController를 통해 모든 객체를 json으로 바꾸어준다!! (dependency 필수!!)

@RestController
@RequestMapping("/rest/*") // EmpController 와 차이를 두기 위해 매핑
public class EmpRestController {

	@Autowired
	private EmpService empService;

	@ResponseBody // 예전 버전이라고 해~~
	@RequestMapping("/emp")
	public List<EmpVO> empList(Model model) {
		System.out.println("empList()");

		// model.addAttribute("list", list); // 셋 필요 없어!

		return empService.selectEmpList();
		// 리턴값을 List<BoardVO>로 해버린다~~
	}	
	
	

}
