/**
 * 
 */
package com.htc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htc.entity.Menu;
import com.htc.mapper.MenuMapper;
import com.htc.service.MenuService;

/**  
* @ClassName MenuServiceImpl
* @Description:
* @author htc  
* @date 2019年8月17日下午5:02:59 
*/
@Service
public class MenuServiceImpl implements MenuService {
	@Autowired(required = false)
	private MenuMapper menuMapper;
	
	@Override
	public List<Menu> ListMenu() {
		List<Menu> menuList = menuMapper.listMenu();
		System.out.println(menuList);
		return menuList;
	}

}
