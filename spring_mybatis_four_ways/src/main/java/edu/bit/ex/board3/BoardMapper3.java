package edu.bit.ex.board3;

import java.util.List;

import org.apache.ibatis.annotations.Select;

// 이제 interface에 dao가 아니라 mapper라는 이름을 붙여준다
public interface BoardMapper3 {

	@Select("select bId, bName, bTitle,bContent, bDate, bHit, bGroup, bStep, bIndent from mvc_board order by bGroup desc, bStep asc")
	public List<BoardVO> selectBoardList();

}
