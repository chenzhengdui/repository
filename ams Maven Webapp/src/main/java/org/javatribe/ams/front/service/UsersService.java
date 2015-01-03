package org.javatribe.ams.front.service;

import org.javatribe.ams.entity.Users;


/**
 * Time		: 2014/12/16 10:08
 *
 * @author czd
 */
public interface UsersService {

    
    public String getPasswordByUserNo(String userNo);
    
    public Users getUsersByUserNo(String userNo);
}
