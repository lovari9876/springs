package edu.bit.ex.board1;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

// @어노테이션으로 객체 생성하는 것
@Service
public class BService1 {
	// 의존성 주입해주는 것.
	@Inject // root-context.xml에서 타입 찾아서 가져온다. 객체 생성이 아님
	SqlSession sqlSession;

	public List<BoardVO> selectBoardList() throws Exception {
		IBDao dao = sqlSession.getMapper(IBDao.class); // board1.xml 읽어서 가져온다.
		return dao.listDao();
	}
}
