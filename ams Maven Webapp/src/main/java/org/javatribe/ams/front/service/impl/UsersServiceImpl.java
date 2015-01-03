package org.javatribe.ams.front.service.impl;

import org.javatribe.ams.dao.mapper.UsersMapper;
import org.javatribe.ams.dao.mymapper.FrontUsersMapper;
import org.javatribe.ams.entity.Users;
import org.javatribe.ams.front.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Time : 2014/12/16 10:08
 * 
 * @author czd
 */
@Service(value = "usersServiceImpl")
public class UsersServiceImpl implements UsersService {

	@Resource(name = "frontUsersMapper")
	private FrontUsersMapper frontUsersMapper;

	@Resource(name="usersMapper")
	private UsersMapper usersMapper;
	
	@Override
	public String getPasswordByUserNo(String userNo) {
		return frontUsersMapper.getPasswordByUserNo(userNo);
	}
	
	@Override
	public Users getUsersByUserNo(String userNo){
		return frontUsersMapper.getUsersByUserNo(userNo);
	}
}
