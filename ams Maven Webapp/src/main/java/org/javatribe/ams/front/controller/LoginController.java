package org.javatribe.ams.front.controller;

import org.javatribe.ams.entity.Users;
import org.javatribe.ams.front.service.UsersService;
import org.javatribe.ams.util.EncrypMD5;
import org.javatribe.ams.util.TextUtility;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Time: 2014/11/16 12:44
 * @author czd
 */
@Controller
public class LoginController {

	@Resource(name = "usersServiceImpl")
	private UsersService usersService;
	
	
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public Boolean toLogin(HttpServletRequest request, HttpServletResponse response) {
    	response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username+",1111111,"+password);
		if(!"".equals(username)&&username!=null){//判断用户名是否为空
			if(!"".equals(password)&&password!=null){//判断输入的密码是否为空
				String passwordByMD5=usersService.getPasswordByUserNo(username);
				if(!"".equals(passwordByMD5)&&passwordByMD5!=null){//判断数据库返回的密码是否为空
					if(passwordByMD5.equals(EncrypMD5.eccrypt(password))){
						return true;
					}
				}
			}
		}
		return false;
    }
    /**
     * 通过用户的账号查找用户
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value="/getUsersByUserNo",method=RequestMethod.GET)
    @ResponseBody
    public Users getUsersByUserNo(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html;charset=UTF-8");
    	String userNo=request.getParameter("userNo");
    	System.out.println("3333333...."+userNo);
    	if(userNo!=null&&!"".equals(userNo)){
    		Users users=usersService.getUsersByUserNo(userNo);
    		if(users!=null){
    			return users;
    		}
    	}
    	return null;
    }
    
}
