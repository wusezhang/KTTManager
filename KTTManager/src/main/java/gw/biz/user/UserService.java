package gw.biz.user;

import java.util.List;
import java.util.Map;

public interface UserService {
	public List<User> getUsers1(User user);
	public List<User> getUsers2(User user);
	public Map<String, String> getUser3(String uid);
}
