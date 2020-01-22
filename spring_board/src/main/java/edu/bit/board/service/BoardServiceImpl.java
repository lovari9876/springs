package edu.bit.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.board.dao.BoardDAO;
import edu.bit.board.vo.BoardVO;

// 서비스 계층 만들기
@Service("boardService") // bean 등록 안해주어도 객체 생성된다
public class BoardServiceImpl implements BoardService {

	// Marks a constructor, field, setter method or config method
	// as to be autowired by Spring's dependency injection facilities.
	@Autowired // 자동 주입: 객체의 DI를 대신 처리해준다!
	private BoardDAO boardDAO; // = new BoardDAO();

	@Override
	public List<BoardVO> getBoardList() {
		return boardDAO.getBoardList();
	}

	@Override
	public int boardWrite(String bName, String bTitle, String bContent) {

		return boardDAO.write(bName, bTitle, bContent);
	}
}
