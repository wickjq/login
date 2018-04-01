package ki.dao;

import ki.entity.User;

public interface UserDao {
	public User check(String username);
	public void save(User user);
}
