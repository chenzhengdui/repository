package org.javatribe.ams.front.controller;

import org.javatribe.ams.entity.MessageBoardComments;
import org.javatribe.ams.front.service.MessageBoardCommentsService;
import org.javatribe.ams.util.TextUtility;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 
 * Time: 2014/11/16 12:44
 * 
 * @author czd
 */
@Controller
public class MessageBoardCommentsController {
	@Resource(name = "messageBoardCommentsServiceImpl")
	private MessageBoardCommentsService messageBoardCommentsService;

	/**
	 * startid----加载留言的开始id count----每次请求留言的条数：默认10条
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/getCommentsList", method = RequestMethod.GET)
	@ResponseBody
	public List<Map<String, Object>> getCommentsListByMeboId(
			HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		String meboId = request.getParameter("nid");
		System.out.println(meboId + "...3333333...");
		return messageBoardCommentsService.getMessageBoardCommentsList(Integer
				.parseInt(meboId));
	}

	/**
	 * startid----加载留言的开始id count----每次请求留言的条数：默认10条
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/postComments", method = RequestMethod.POST)
	@ResponseBody
	public boolean postComments(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		String meboId = request.getParameter("meboId");//留言id
		String userId = request.getParameter("userId");//用户id
		String content = request.getParameter("content");//评论的内容
		System.out.println(meboId+"...3333..."+userId+"...."+content);
		MessageBoardComments messageBoardComments=new MessageBoardComments();
		messageBoardComments.setMeboId(Integer.parseInt(meboId));
		messageBoardComments.setUserId(Integer.parseInt(userId));
		messageBoardComments.setMbcoContent(content);
		messageBoardComments.setMbcoCreateDate(new Date());
		if(messageBoardCommentsService.addComments(messageBoardComments)>0){
			return true;
		}
		return false;
	}
}
