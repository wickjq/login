package ki.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

import ki.dao.UserDao;
import ki.entity.User;
import ki.exception.AppException;

@Service
public class UserService {
	@Resource
	private UserDao userDao;
	
	public void check(User parameter_user){
		String username = parameter_user.getUsername();
		String password = parameter_user.getPassword();
		User check_user = userDao.check(username);
		if(check_user == null){
			throw new AppException("用户名不存在！");
		}
		if(!password.equals(check_user.getPassword())){
			throw new AppException("密码错误！");
		}
	}
	
	public void check_username(String username){
		if(userDao.check(username)!=null){
			throw new AppException("用户名已存在！");
		}
		
	}
	
	public void save(User user ){
		userDao.save(user);
	}
}
