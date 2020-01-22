package edu.bit.ex.board4;

import java.util.List;

import org.apache.ibatis.annotations.Select;

// ���� interface�� dao�� �ƴ϶� mapper��� �̸��� �ٿ��ش�
public interface BoardMapper4 {

	public List<BoardVO> selectBoardList();

	// �̷� ������ ���3�� ���4 ���鼭 ȥ�� ����!
	// ������ ������ ���3����, ������ ������ xml ���� ���4��!
	@Select("select * from mvc_board order by bGroup desc, bStep asc")
	public List<BoardVO> selectBoardList1();

}
