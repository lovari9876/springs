package edu.bit.ex.board1;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

// @������̼����� ��ü �����ϴ� ��
@Service
public class BService1 {
	// ������ �������ִ� ��.
	@Inject // root-context.xml���� Ÿ�� ã�Ƽ� �����´�. ��ü ������ �ƴ�
	SqlSession sqlSession;

	public List<BoardVO> selectBoardList() throws Exception {
		IBDao dao = sqlSession.getMapper(IBDao.class); // board1.xml �о �����´�.
		return dao.listDao();
	}
}
