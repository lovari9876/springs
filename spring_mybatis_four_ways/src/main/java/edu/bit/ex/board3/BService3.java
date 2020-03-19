package edu.bit.ex.board3;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

// @어노테이션으로 객체 생성하는 것
@Service
public class BService3 {

	// 의존성 주입해주는 것.
	@Inject
	BoardMapper3 boardMapper;

	public List<BoardVO> selectBoardList() throws Exception {
		return boardMapper.selectBoardList();
	}
}
