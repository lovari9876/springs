package json.eshopper.emp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import json.eshopper.emp.mapper.EmpMapper;
import json.eshopper.emp.vo.EmpVO;

@Service
public class EmpService {

	@Autowired
	EmpMapper empMapper;

	// 게시판 List를 위한 출력하는 비즈니스로직
	public ArrayList<EmpVO> selectEmpList() {
		return empMapper.selectEmpList();
	}

	public EmpVO selectEmpOne(int empno) {
		return empMapper.selectEmpOne(empno);
	}


}
