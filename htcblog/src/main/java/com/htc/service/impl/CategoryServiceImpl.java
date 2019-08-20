/**
 * 
 */
package com.htc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htc.entity.Category;
import com.htc.mapper.CategoryMapper;
import com.htc.service.CategoryService;

/**  
* @ClassName CategoryServiceImpl
* @Description:
* @author htc  
* @date 2019年8月20日下午4:50:09 
*/
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;

	@Override
	public List<Category> listCategory() {
		List<Category> categoryList = null;
		
		categoryList = categoryMapper.listCategory();
		
		return categoryList;
	}

}
