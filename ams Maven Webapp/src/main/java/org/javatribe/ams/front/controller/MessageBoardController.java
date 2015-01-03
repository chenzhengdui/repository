package org.javatribe.ams.front.controller;

import org.javatribe.ams.front.service.MessageBoardService;
import org.javatribe.ams.util.TextUtility;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Time: 2014/11/16 12:44
 * @author czd
 */
@Controller
public class MessageBoardController {

	@Resource(name = "messageBoardServiceImpl")
	private MessageBoardService messageBoardService;
	
	/**
	 * startid----加载留言的开始id
	 * count----每次请求留言的条数：默认10条
	 * @param request
	 * @param response
	 * @return
	 */
    @RequestMapping(value="/getMessageBoardList",method=RequestMethod.GET)
    @ResponseBody
    public List<Map<String, Object>> getMessageListByCount(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html;charset=UTF-8");
    	String count = request.getParameter("count");
    	String startId=request.getParameter("startid");
    	System.out.println(count+"...3333333..."+startId);
    	if(count!=null&&!"".equals(count)){
    		if(startId!=null&&!"".equals(startId)){
    			Map<String, Object> data = new HashMap<String, Object>();
    	    	data.put("count", Integer.parseInt(count));
    	    	data.put("startId", Integer.parseInt(startId));
    			return messageBoardService.getMessageBoardList(data);
    		}
    	}
    	return null;
    }
}
