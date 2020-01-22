package edu.bit.board.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.bit.board.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> selectBoardList();

	// �Է¹��� 3���� ������ ���̴�.
	// @Param �� �־��ֱ�
	// board.xml�� #���� ó���� �Ķ���� ���� �־��ְڴٴ� ��
	// #{bName}, #{bTitle}, #{bContent} �� �־��شٴ� ���̴�.
//	public void insertBoard(@Param("bName") String bName, @Param("bTitle") String bTitle,
//			@Param("bContent") String bContent);
	// @Param()�� .jsp�κ��� �Ķ���� �� �����ͼ� �־��ִ� ��!

	// ������ �Ķ���Ͱ� ���� �� �̷��� ��ü�� �����´�.
	public void insertBoard(@Param("boardVO") BoardVO boardVO);

//	<input type="hidden" name="bId" value="${content_view.bId}">
//	�̷��� ������ �Ķ���� �������� ��
	public BoardVO selectBoardOne(@Param("bId") String bId);

	// �������� ª�� �Ѱ��� ���� �����ö��� @Param �ʿ���� �׳� �ϳ��� �������� �ȴ�.
//	// @Select("select * from mvc_board where bId = #{bId}")
//	public BoardVO selectBoardOne(int bId);
}
