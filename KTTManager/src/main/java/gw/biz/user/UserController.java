package gw.biz.user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import redis.clients.jedis.Jedis;

@Controller
@RequestMapping("/u")
public class UserController {
	@Autowired
	UserService service;
	@ResponseBody//如果不加这个注解且方法返回一个String参数"xxx"，就会跳转到view/xxx.jsp(见springmvc.xml配置)
//	@RequestMapping(value="/getu1")//即便没有写method和consumer下面由于上面的RequestBody注解存在，就相当于默认是下面配置了
	@RequestMapping(value="/getu1",method=RequestMethod.POST,consumes="application/json",produces="application/json")
	public List getUsers1(@RequestBody User user){ 
		return service.getUsers1(user);
	}
	
	@ResponseBody
	@RequestMapping(value="/getu2")
	public List getUsers2(@ModelAttribute User user){ 
		return service.getUsers2(user);
	}
	
	/**
	 * 这个案例是一个综合案例，REST风格的URL构建，从URL中接参数到后台，从redis数据库读取内容
	 * 放到模型中，跳转页面
	 * redis 数据库的数据结构为 key/value
	 * 测试数据为
	 * '123':'{"uid":"123","username":"billy","passwd":"pwd123456"}'
	 * 你可以访问@http://localhost:8080/Garden-Wall/u/123/info 看看效果其中123就是用户id
	 * 这就是restful风格的url设计，清晰明确
	 */
	/*
		接下来讨论一下方法的返回值，主要有以下情况：
		    返回一个ModelAndView，其中Model是一个Map，里面存放的是一对对的键值对，其可以直接在页面上使用，View是一个字符串，
		表示的是某一个View的名称
		    返回一个字符串，这个时候如果需要给页面传值，可以给方法一个Map参数，该Map就相当于一个Model，
		往该Model里面存入键值对就可以在页面上进行访问了返回一个View对象
		    什么也不返回，这个时候可以在方法体中直接往HttpServletResponse写入返回内容，否则将会由
	    RequestToViewNameTranslator来决定
	        任何其他类型的对象。这个时候就会把该方法返回类型对象当做返回Model模型的一个属性返回给视图使用，这个属性名称可以通过
        在方法上给定@ModelAttribute注解来指定，否则将默认使用该返回类名称作为属性名称
	 */
	@RequestMapping(value="/{uid}/info")
	public String getUser3(Map<String, String> map,@PathVariable("uid") String uid){
		//以下是错误的方式，只能往这个map中塞数据，不能重新指向一个新map
		//map = service.getUser3(uid);
		//以下是正确的方式
		Map<String, String> getUserMap = service.getUser3(uid);
		for(Iterator<String> it=getUserMap.keySet().iterator();it.hasNext();){
			String key = it.next();
			String value = getUserMap.get(key);
			map.put(key, value);
		}
		return "user/userinfo";
	}
}
