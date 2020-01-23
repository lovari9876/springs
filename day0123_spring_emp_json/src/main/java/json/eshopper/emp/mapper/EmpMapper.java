package json.eshopper.emp.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;

import json.eshopper.emp.vo.EmpVO;

//전에 dao 만들고 @Repository 붙여서 영속계층을 만들었다면,
//mapper class가 이제 영속계층!!(persistent interface)
public interface EmpMapper {
	@Select("select empno, ename, job, sal from emp order by empno")
	public ArrayList<EmpVO> selectEmpList();

	@Select("select empno, ename, job, sal from emp where empno = #{empno}")
	public EmpVO selectEmpOne(int empno);

	// @Param 안적어도 어느정도 허용하는 중...
}
