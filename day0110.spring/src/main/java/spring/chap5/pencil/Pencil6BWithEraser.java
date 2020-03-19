package spring.chap5.pencil;

public class Pencil6BWithEraser extends Pencil6B implements Pencil {

	@Override
	public void use() {
		System.out.println("6B 연필에 지우개도 있습니다.");
	}

}
