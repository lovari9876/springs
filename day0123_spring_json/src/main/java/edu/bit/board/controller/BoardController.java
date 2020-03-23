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

	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		List<BoardVO> list = boardService.selectBoardList();

		model.addAttribute("list", list);

		return "list";
	}

	@RequestMapping("/write_view")
	public String write_view() {
		System.out.println("write_view()");

		return "write_view";
	}

	@RequestMapping("/write")
	public String write(BoardVO boardVO) {
		System.out.println("write()");

		// 객체로 바로 넘기기
		boardService.insertBoard(boardVO);

//		boardService.insertBoard(boardVO.getbName(), boardVO.getbTitle(), boardVO.getbContent());

		return "redirect:list";
	}

	@RequestMapping("/content_view")
	public String content_view(BoardVO boardVO, Model model) {
		System.out.println("content_view()");

		BoardVO content_view = boardService.selectBoardOne(Integer.toString(boardVO.getbId()));

		model.addAttribute("content_view", content_view);

		return "content_view";
	}

//	@RequestMapping("/delete")
//	public String write(BoardVO boardVO, Model model) {
//		System.out.println("write()");
//
//		// 객체로 바로 넘기기
//		boardService.insertBoard(boardVO);
//
////		boardService.insertBoard(boardVO.getbName(), boardVO.getbTitle(), boardVO.getbContent());
//
//		return "redirect:list";
//	}

}
