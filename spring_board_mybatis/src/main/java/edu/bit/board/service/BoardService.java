package edu.bit.board.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.bit.board.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> selectBoardList();

	// 입력받은 3개만 저장할 것이다.
	// @Param 꼭 넣어주기
	// board.xml의 #으로 처리한 파라미터 값을 넣어주겠다는 것
	// #{bName}, #{bTitle}, #{bContent} 에 넣어준다는 것이다.
//	public void insertBoard(@Param("bName") String bName, @Param("bTitle") String bTitle,
//			@Param("bContent") String bContent);
	// @Param()이 .jsp로부터 파라미터 값 가져와서 넣어주는 것!

	// 가져올 파라미터가 많을 때 이렇게 객체로 가져온다.
	public void insertBoard(@Param("boardVO") BoardVO boardVO);

//	<input type="hidden" name="bId" value="${content_view.bId}">
//	이렇게 설정한 파라미터 가져오는 것
	public BoardVO selectBoardOne(@Param("bId") String bId);

	// 쿼리문이 짧고 한가지 값만 가져올때는 @Param 필요없이 그냥 하나씩 가져오면 된다.
//	// @Select("select * from mvc_board where bId = #{bId}")
//	public BoardVO selectBoardOne(int bId);
}
