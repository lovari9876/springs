package spring.chap5.pencil;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass_Pencil {

	public static void main(String[] args) {
		String configLocation = "classpath:appCTX_Pencil.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);

		Pencil pencil = ctx.getBean("pencil", Pencil.class); // 다형성!
		// Pencil.class를 파라미터로 받아도
		// .xml에서 Pencil 인터페이스를 구현한 어느클래스라도 class=""에 있다면 가져올 수 있다.
		pencil.use();

		ctx.close();

	}

}
