package spring.chap7.lifeCycle;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		// 직접 파라미터로 넣으면, load() 와 refresh() 저절로 호출함
		System.out.println("");

//		ctx.load("classpath:appCTX.xml");
//		ctx.refresh();

		System.out.println("ctx.close() 호출 전");
		ctx.close();
		System.out.println("ctx.close() 호출 후");

	}
}
