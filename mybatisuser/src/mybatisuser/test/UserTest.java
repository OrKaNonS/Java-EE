package mybatisuser.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import mybatisuser.domain.User;
import mybatisuser.service.UserService;
import mybatisuser.service.UserServiceImpl;

public class UserTest {
	
	private ApplicationContext context;
	
	@Autowired
	private UserService userService;
	
	@Before
	public void init() {
		context = new GenericXmlApplicationContext("mybatisuser/conf/beans.xml"); // conf/beans.xml(빈 설정 파일)을 읽어서 ApplicationContext를 생성
		userService = (UserServiceImpl)context.getBean("userService");
	}
	
	@Test
	public void insertUser() {
		User user = new User(0,"아이디","이름","성별","도시");
		int result = userService.insertUser(user);
		assertEquals(result, 1);
	}
	
	//@Test
	public void selectUserList() {
		List<User> userList = userService.getUserList();
		System.out.println(userList);
	}
	
	//@Test
	public void selectUser() {
		User user = userService.getUser(22);
		System.out.println(user);
	}
		
	//@Test
	public void updateUser() {
		User user = new User(26,"아이디up","이름up","성별up","도시up");
		int result = userService.insertUser(user);
		assertEquals(result, 1);
	}
	
	//@Test
	public void deleteUser() {
		int result = userService.deleteUser(24);
		assertEquals(result, 1);				
	}
	
}
