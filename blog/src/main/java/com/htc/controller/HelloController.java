/**
 * 
 */
package com.htc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  
* @ClassName HelloController
* @Description:
* @author htc  
* @date 2019年8月16日下午3:05:55 
*/
@Controller
@RequestMapping("/user")
public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		System.out.println("进入hello方法！");
		return "hello";
	}
}
