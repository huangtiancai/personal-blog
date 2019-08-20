/**
 * 
 */
package com.htc.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.htc.entity.Category;
import com.htc.entity.Menu;
import com.htc.service.CategoryService;
import com.htc.service.MenuService;

/**  
* @ClassName HomeResourceInterceptor
* @Description:
* @author htc  
* @date 2019年8月17日下午4:44:14 
*/
@Component
public class HomeResourceInterceptor implements HandlerInterceptor{
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private CategoryService categoryService;
	
	
	
	/**
     * 在请求处理之前执行，该方法主要是用于准备资源数据的，然后可以把它们当做请求属性放到WebRequest中
     */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("进入拦截器！");
		// 菜单显示 
		List<Menu> menuList = menuService.ListMenu();
		request.setAttribute("menuList", menuList);
		
		
		List<Category> categoryList = categoryService.listCategory();
		System.out.println(categoryList.get(2).getCategoryName());
		
        request.setAttribute("allCategoryList", categoryList);
		
		return true;
	}


	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		
	}


	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
	}

}
