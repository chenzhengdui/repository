package org.javatribe.ams.dao.mymapper;

import java.util.List;
import java.util.Map;

/**
 *@author czd
 *@version 1.0
 *@date 2014-12-25下午2:38:12
 */
public interface FrontMessageBoardCommentsMapper {
	/**
     * 获取留言列表
     * @return
     */
    public List<Map<String, Object>> selectMessageBoardCommentsList(int meboId);

}
