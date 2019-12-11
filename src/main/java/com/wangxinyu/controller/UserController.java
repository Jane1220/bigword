/**
 * 
 */
package com.wangxinyu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.wangxinyu.domain.User;
import com.wangxinyu.service.UserService;

/**
 * @作者： 王新宇
 * @时间：2019年12月11日
 */
@RequestMapping("user")
@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	@GetMapping("selects")
	public String selects(String name,Model model,
			@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="3")Integer pageSize) {
		
		PageInfo<User> info = userService.selects(name, page, pageSize);
		
		model.addAttribute("info", info);
		model.addAttribute("name", name);
		
		
		return "admin/user/users";
	}
	

}
