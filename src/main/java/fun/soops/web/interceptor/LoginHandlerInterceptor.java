package fun.soops.web.interceptor;

import fun.soops.data.entity.User;
import fun.soops.util.SimpleSessionUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginHandlerInterceptor implements HandlerInterceptor  {

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        //如果已经登陆就放行，否则就返回到登陆页面
        HttpSession session = httpServletRequest.getSession();
        User user = SimpleSessionUtils.getLoginUser(session);
        if(null == user){
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/user/login.action");
            return false;
        }else
        {
            return true;
        }

        //return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
