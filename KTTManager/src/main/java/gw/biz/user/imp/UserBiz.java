package gw.biz.user.imp;

import gw.biz.user.User;
import gw.biz.user.UserService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserBiz implements UserService{
	public List<User> getUsers1(User user) { 
		List<User> list = new ArrayList<User>();
		list.add(user); 
		return list;
	}
	public List<User> getUsers2(User user){ 
		List<User> list = new ArrayList<User>();
		list.add(user); 
		return list;
	}
	public Map<String, String> getUser3(String uid){
		Map<String, String> map=new HashMap<String, String>();
		ObjectMapper om = new ObjectMapper();
		Jedis jedis = new Jedis("127.0.0.1");
		String json = jedis.get(uid);//set(a,b)就是给redis增加一个键值对
		System.out.println(json);
		User user=null;
		try {
			user = om.readValue(json, User.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		map.put("uid", user.getUid());
		map.put("username", user.getUsername());
		map.put("passwd",user.getPasswd());
		return map;
	}
}
