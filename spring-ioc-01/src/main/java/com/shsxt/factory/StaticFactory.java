package com.shsxt.factory;
/**
 * 静态工厂模式
 * @author  wz
 *
 *   2018年3月8日
 */

import com.shsxt.bean.UserService;

public class StaticFactory {
	
	public static UserService user1(){
		
		return new UserService();
		
	} 

}
