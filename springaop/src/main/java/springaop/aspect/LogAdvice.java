package springaop.aspect;

public class LogAdvice {
	public void printLog_before() {
		System.out.println("전에 실행해라");
	}
	
	public void printLog_ing() {
		System.out.println("중에 실행해라");
	}
	
	public void printLog_after() {
		System.out.println("후에 실행해라");
	}

}
