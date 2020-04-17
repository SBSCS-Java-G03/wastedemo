package com.ishang.wastedemo.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ishang.wastedemo.admin.entity.User;
import com.ishang.wastedemo.admin.service.UserService;
import com.ishang.wastedemo.core.http.HttpResult;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService service;
	
	/* todo
	 * 1 登录 1
	 * 2修改密码  1
	 * 3修改个人信息
	 * 4添加业主 1
	 * 5删除
	 * 6查找所有 1
	 * 7模糊查找
	 * */
	
	@PostMapping(value="/login")
	public HttpResult userlogin(@RequestParam String name,@RequestParam String passwd) {
		User u = new User();
		u.setName(name);
		u.setPassword(passwd);
		List<User> rst = service.findUser(u);
		if(!rst.get(0).getPassword().equals(passwd)) return HttpResult.error("wrong password");
		else return HttpResult.ok("login succeed");
	}
	
	@PostMapping(value = "/password")
	public HttpResult userpasswd(@RequestParam int id, @RequestParam String p1, @RequestParam String p2) {
		if(!p1.equals(p2)) return HttpResult.error("The two passwords are inconsistent, please re-enter.");
		else {
			User u = new User();
			u.setId(id);
			u.setPassword(p1);
			service.updateUser(u);
			return HttpResult.ok("password updated");
		}
	}
	
	@PostMapping(value = "/update")
	public HttpResult userupdate(@RequestBody User record) {
		return HttpResult.ok(service.updateUser(record));
	}
	
	@PostMapping(value = "/insert")
	public HttpResult useradd(@RequestBody User record) {
		if(record.getName()==null || record.getPassword()==null) 
			return HttpResult.error("username and password cannot be empty.");
		if(record.getRole()==null) record.setRole(1);
		record.setPoint(0);
		record.setDelFlag(1);
		return HttpResult.ok(service.save(record));
	}
	
	@PostMapping(value = "/delete")
	public HttpResult userdelete(@RequestParam int id) {
		User u = new User();
		u.setId(id);
		return HttpResult.ok(service.delete(u));
	}
	
	@PostMapping(value="/findAll")
	public HttpResult userfindall() {
		return HttpResult.ok(service.findAll());
	}
	
	@PostMapping(value="/findLike")
	public HttpResult userfindlike(@RequestParam String name) {
		User u = new User();
		u.setName(name);
		return HttpResult.ok(service.findUser(u));
	}
}
