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
		context = new GenericXmlApplicationContext("mybatisuser/conf/beans.xml"); // conf/beans.xml(�� ���� ����)�� �о ApplicationContext�� ����
		userService = (UserServiceImpl)context.getBean("userService");
	}
	
	@Test
	public void insertUser() {
		User user = new User(0,"���̵�","�̸�","����","����");
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
		User user = new User(26,"���̵�up","�̸�up","����up","����up");
		int result = userService.insertUser(user);
		assertEquals(result, 1);
	}
	
	//@Test
	public void deleteUser() {
		int result = userService.deleteUser(24);
		assertEquals(result, 1);				
	}
	
}
