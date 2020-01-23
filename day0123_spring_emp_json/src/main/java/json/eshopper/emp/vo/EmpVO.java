package json.eshopper.emp.vo;


// 이게 있어야 jackson이 인식을 해서 json으로 변환된다.
public class EmpVO {
	int empno;
	String ename;
	String job;
	int sal;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public EmpVO() {
		
	}
	
	public EmpVO(int empno, String ename, String job,int sal) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}
	
}