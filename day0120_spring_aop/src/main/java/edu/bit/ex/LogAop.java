package edu.bit.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {

		String signatureStr = joinPoint.getSignature().toShortString();
		System.out.println(signatureStr + " is start. ");

		long st = System.currentTimeMillis();

		try {
			Object obj = joinPoint.proceed();
			// 놀랍게도 controller의 student.getStudentIfo() 가 호출된다.
			// proceed(): Proceed with the next advice or target method invocation

			return obj;

		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + "걸리는 시간: " + (et - st));
		}
	}
}
