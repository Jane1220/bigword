/**
 * 
 */
package com.wangxinyu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangxinyu.dao.UserMapper;
import com.wangxinyu.domain.User;
import com.wangxinyu.service.UserService;

/**
 * @作者： 王新宇
 * @时间：2019年12月11日
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	/* (non-Javadoc)
	 * @see com.wangxinyu.service.UserService#selects(java.lang.String, java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public PageInfo<User> selects(String name, Integer page, Integer pageSize) {
		
		PageHelper.startPage(page, pageSize);
		List<User> list = userMapper.selects(name);
		
		return new PageInfo<User>(list);
	}

	/* (non-Javadoc)
	 * @see com.wangxinyu.service.UserService#updateByPrimaryKeySelective(com.wangxinyu.domain.User)
	 */
	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}


}
