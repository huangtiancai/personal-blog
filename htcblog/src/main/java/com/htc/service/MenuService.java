/**
 * 
 */
package com.htc.service;

import java.util.List;

import com.htc.entity.Menu;

/**  
* @ClassName MenuService
* @Description:
* @author htc  
* @date 2019年8月17日下午4:58:54 
*/
public interface MenuService {
	/**
	 * 
	 * @describe 获得菜单列表
	 * @author ks0pc23-PC 
	 * @date 2019年8月17日 下午5:00:20
	 * @return
	 * @return List<Menu>
	 * @throws Exception
	 */
	List<Menu> ListMenu();
}
