package user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import user.domain.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public List<User> listUser() throws Exception {
		System.out.println("listUser ȣ���!");
		return null;
	}

	@Override
	public User getUser(int id) throws Exception {
		System.out.println("getUser ȣ���!" + id);
		return null;
	}

	@Override
	public int insertUser(User user) throws Exception { 
		System.out.println("insertUer ȣ���!");
		return 0;
	}

	@Override
	public int updatetUser(User user) throws Exception {
		System.out.println("updateUser ȣ���!");
		return 0;
	}

	@Override
	public int deleteUser(int id) throws Exception {
		System.out.println("deleteUser ȣ���!");
		return 0;
	}

}
