package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice{
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.err.println("에러발생");
	}
}
