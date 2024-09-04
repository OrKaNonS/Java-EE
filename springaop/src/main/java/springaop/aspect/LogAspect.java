package springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAspect {
	
	@Pointcut("execution(* springaop.service..*Impl.get*(..))")
	public void mathodPointcut() {
		
	}
	
	// 실습
	// getPersom() Pointcut과 After/Bofore Advice를 생성해서
	// getPerson() 호출시 앞뒤로 출력
	
	@Pointcut("execution(* springaop.service..*Impl.get*(..))")
	public void getPointcut() {
		
	}
	
	@Before("getPointcut()")
	public void beforeget() {
		System.out.println("(@Before)비지니스 메소드 수행 전 실행!");
	}
	
	@After("getPointcut()")
	public void afterget() {
		System.out.println("(@Before)비지니스 메소드 수행 전 실행!");
	}
	
	@Before("mathodPointcut()")
	public void before() {
		System.out.println("(@Before)비지니스 메소드 수행 전 실행!");
	}
	
	@AfterReturning("mathodPointcut()")
	public void AfterReturning() {
		System.out.println("@AfterReturning)비지니스 메소드가 정상적으로 반환 후 실행!");
	}
	
	@AfterThrowing("mathodPointcut()")
	public void AfterThrowing() {
		System.out.println("@AfterThrowing)비지니스 메소드 수행 중 예외 발생시 실행!");
	}
	
	@After("mathodPointcut()")
	public void after() {
		System.out.println("(@After)비지니스 메소드 수행 후 무조건 실행!");
	}
	
	@Around("mathodPointcut()")
	public void Around(ProceedingJoinPoint pjp) {
		System.out.println("(@Around)비지니스 메소드 수행 전 실행");

	  try {
		System.out.println("(@Around)비지니스 클래스명 : " + pjp.getTarget().getClass().getName()); // pjp 객체의 클래스의 이름
		System.out.println("(@Around)비지니스 메소드명 : " + pjp.getSignature().getName());
		Object[] args = pjp.getArgs();
		for (Object obj : args) {
			System.out.println("(@Around)비지니스 메소드 인자" + obj);
		}
		pjp.proceed(); // 비지니스 메소드 수행
		} catch (Throwable th) {
		  th.printStackTrace();
		} System.out.println("(@Around)비지니스 메소드 수행 후 실행");
	}
	

} // class
