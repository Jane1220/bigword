/**
 * 
 */
package com.wangxinyu.service;


import com.github.pagehelper.PageInfo;
import com.wangxinyu.domain.User;

/**
 * @作者： 王新宇
 * @时间：2019年12月11日
 */
public interface UserService {
	
	PageInfo<User> selects(String name,Integer page,Integer pageSize);

	int updateByPrimaryKeySelective(User record);


}
