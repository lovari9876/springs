package edu.bit.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.bit.board.service.BoardService;
import edu.bit.board.vo.BoardVO;

// @Controller + @ResponseBody => 이제  @RestController로 바뀐것!!!
// @RestController를 통해 모든 객체를 json으로 바꾸어준다!! (dependency 필수!!)

@RestController
@RequestMapping("/rest/*") // BoardController 와 차이를 두기 위해 매핑
public class BoardRestController {

	@Autowired
	private BoardService boardService;

	@ResponseBody // 예전 버전이라고 해~~
	@RequestMapping("/list")
	public List<BoardVO> list(Model model) {
		System.out.println("list()");

		// model.addAttribute("list", list); // 셋 필요 없어!

		return boardService.selectBoardList();
		// 리턴값을 List<BoardVO>로 해버린다~~
	}

	

}
