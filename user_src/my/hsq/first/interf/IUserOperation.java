package my.hsq.first.interf;

import java.util.List;

import my.hsq.first.entity.User;

public interface IUserOperation {
	public User selectUserById(int id);
	public List<User> selectUsersLikeName(String username);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUserById(int id);
}
