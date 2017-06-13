package com.hxd.factory;

import com.hxd.dao.UserDao;
import com.hxd.daoimpl.UserDaoImpl;

public class UserDaoFactory {
	public static UserDao getUserDAOInstance(){	//工厂方法，用来返回DAO实现类实例
		return new UserDaoImpl();
			
		}
}
