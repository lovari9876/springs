package edu.bit.ex.board2;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

// @어노테이션으로 객체 생성하는 것
@Service
public class BService2 {
	// 의존성 주입해주는 것.
	@Inject // root-context.xml에서 타입 찾아서 가져온다. 객체 생성이 아님
	SqlSession sqlSession;

	public List<BoardVO> selectBoardList() throws Exception {

		// getMapper 대신 쓰는 2번째 방법
		return sqlSession.selectList("board.selectBoardList");
	}
}
