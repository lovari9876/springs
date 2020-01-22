package edu.bit.ex.board3;

import java.util.List;

import org.apache.ibatis.annotations.Select;

// ���� interface�� dao�� �ƴ϶� mapper��� �̸��� �ٿ��ش�
public interface BoardMapper3 {

	@Select("select bId, bName, bTitle,bContent, bDate, bHit, bGroup, bStep, bIndent from mvc_board order by bGroup desc, bStep asc")
	public List<BoardVO> selectBoardList();

}
