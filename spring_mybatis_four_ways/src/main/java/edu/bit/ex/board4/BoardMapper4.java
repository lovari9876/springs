package edu.bit.ex.board4;

import java.util.List;

import org.apache.ibatis.annotations.Select;

// 이제 interface에 dao가 아니라 mapper라는 이름을 붙여준다
public interface BoardMapper4 {

	public List<BoardVO> selectBoardList();

	// 이런 식으로 방법3을 방법4 쓰면서 혼용 가능!
	// 간단한 쿼리는 방법3으로, 복잡한 쿼리는 xml 통해 방법4로!
	@Select("select * from mvc_board order by bGroup desc, bStep asc")
	public List<BoardVO> selectBoardList1();

}
