package fun.soops.util;

import javax.servlet.http.HttpSession;

import fun.soops.data.entity.User;

/**
 * 用户工具类
 * 
 * @author qst
 *
 */
public class SimpleSessionUtils {

	public static final String SESSION_ATTRIBUTE_NAME_USER = "user";

	/**
	 * 从会话中读取已登录用户信息 {@value #SESSION_ATTRIBUTE_NAME_USER}
	 * 
	 * @param session 会话
	 * @return 已登陆用户
	 */
	public static final User getLoginUser(HttpSession session) {
		User user = null;
		Object obj = session.getAttribute(SESSION_ATTRIBUTE_NAME_USER);
		if (null != obj || obj instanceof User) {
			user = (User) obj;
		}
		return user;
	}

	/**
	 * 设置当前会话的已登录用户信息
	 * 
	 * @param session 会话
	 * @param user    已登录用户
	 */
	public static final void setLoginUser(HttpSession session, User user) {
		session.setAttribute(SESSION_ATTRIBUTE_NAME_USER, user);
	}

	/**
	 * 从会话中读取已登录用户名
	 * 
	 * @param session 会话
	 * @return 用户名
	 */
	public static final String getLoginUsername(HttpSession session) {
		User user = getLoginUser(session);
		if (null == user) {
			return null;
		}
		return user.getUsername();
	}

}
