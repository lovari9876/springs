package edu.bit.ex.board2;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

// @������̼����� ��ü �����ϴ� ��
@Service
public class BService2 {
	// ������ �������ִ� ��.
	@Inject // root-context.xml���� Ÿ�� ã�Ƽ� �����´�. ��ü ������ �ƴ�
	SqlSession sqlSession;

	public List<BoardVO> selectBoardList() throws Exception {

		// getMapper ��� ���� 2��° ���
		return sqlSession.selectList("board.selectBoardList");
	}
}
