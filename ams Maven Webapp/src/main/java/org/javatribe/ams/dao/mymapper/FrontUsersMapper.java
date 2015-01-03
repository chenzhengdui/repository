package org.javatribe.ams.dao.mymapper;

import org.javatribe.ams.entity.Users;

/**
 *@author czd
 *@version 1.0
 *@date 2014-12-25下午2:38:12
 */
public interface FrontUsersMapper {
	/**
     * 通过userNo获取用户密码
     * @param userNo
     * @return
     */
    public String getPasswordByUserNo(String userNo);
    /**
     * 通过userNo获取用户
     * @param userNo
     * @return
     */
    Users getUsersByUserNo(String userNo);
}
