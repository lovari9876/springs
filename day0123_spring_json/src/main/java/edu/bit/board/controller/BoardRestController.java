package edu.bit.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.bit.board.service.BoardService;
import edu.bit.board.vo.BoardVO;


@RestController
@RequestMapping("/rest/*") // BoardController 와 차이를 두기 위해 매핑
public class BoardRestController {

	@Autowired
	private BoardService boardService;

	@RequestMapping("/list")
	public List<BoardVO> list(Model model) {
		System.out.println("list()");

		// model.addAttribute("list", list); // 셋 필요 없어!

		return boardService.selectBoardList();
		// 리턴값을 List<BoardVO>로 해버린다~~
	}

	

}
