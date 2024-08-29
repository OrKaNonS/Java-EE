// Singleton pattern(싱글톤 패턴)
// 객체를 하나만 생설할 필요가 있을 떄 사용
// 1. private static 멤버변수
// 2. private 생성자
// 3. 으로 만들어진 객체를 반환하는 public 메소드 객체


public class SingletonTest {
	
	// 1. private static 멤버변수
	private static SingletonTest obj = new SingletonTest();
	
	// 2. private 생성자 : 외부에서 객체 생성 불가
	private SingletonTest() {		
	}
	
	// 3. 만들어진 객체를 반환하는 public 메소드 객체
	public SingletonTest getInstance() {
		return obj;
	}

}
