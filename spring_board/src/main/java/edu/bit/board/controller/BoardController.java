package edu.bit.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.board.service.BoardService;
import edu.bit.board.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	// 이미 엮어둔 객체를 부른다.

	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");

		List<BoardVO> list = boardService.getBoardList();

		model.addAttribute("list", list);

		return "list";
	}

	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view()");

		return "write_view";
	}

	@RequestMapping("/write")
	public String write(BoardVO boardVO) {
		// form 태그 내부의 parameter이름과 command 객체에 등록된 이름이 같으면 저절로 받아옴
		System.out.println("write_view()");

		int rn = boardService.boardWrite(boardVO.getbName(), boardVO.getbTitle(), boardVO.getbContent());
		System.out.println("결과 값: " + rn); // 쿼리 수행한 개수. 0은 수행한 것 없음

		return "redirect:list"; // list로 주소 바뀌면서 페이지 띄운다.
	}

}
