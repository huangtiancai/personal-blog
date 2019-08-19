/**
 * 
 */
package com.htc.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.session.SqlSession;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.htc.entity.Menu;
import com.htc.mapper.MenuMapper;
import com.htc.utils.DruidUtils;
import com.htc.utils.MyBatisSessionFactory;

/**  
* @ClassName Test
* @Description:测试类
* @author htc  
* @date 2019年8月17日下午9:59:01 
*/
public class Test {
	//菜单显示 测试
	@org.junit.Test
	public void findMenu(){	
		SqlSession sqlSession = MyBatisSessionFactory.getSession();
		MenuMapper MenuMapper = sqlSession.getMapper(MenuMapper.class);
		
		List<Menu> me = MenuMapper.listMenu();
		System.out.println(me);
		
		sqlSession.close();
	}
	
	@org.junit.Test
	public void testJDBC(){	
		try {
			Connection conn = DruidUtils.getConnection();
			System.out.println(conn);
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
}
