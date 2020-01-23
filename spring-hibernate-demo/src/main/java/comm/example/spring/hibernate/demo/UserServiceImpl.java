package comm.example.spring.hibernate.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.example.spring.hibernate.demo.entity.UserDetail;

@Service("service")
public class UserServiceImpl implements UserService{

	private UserDAO dao;
	
@Autowired
	public UserServiceImpl(UserDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public UserDetail createUser(UserDetail user) {
		return dao.createUser(user);
	}
	

}
