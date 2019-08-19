/**
 * 
 */
package com.htc.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**  
* @ClassName SecurityInterceptor
* @Description:
* @author htc  
* @date 2019年8月17日下午4:46:03 
*/
@Component
public class SecurityInterceptor extends HandlerInterceptorAdapter{
	@Override	
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws IOException {
        System.out.println("进入SecurityInterceptor-preHandle！");
		return true;
    }
	
	@Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView)  {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e)  {

    }
}
