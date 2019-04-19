package com.ssm.wuye.appcomm;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	
	private static SqlSessionFactory  factory;
	
	
	
	public MyBatisUtil() {
		System.out.println(" MyBatisUtil()..............  ");
	}
	
	//静块：和类级别的 
	static{
		System.out.println("  static{}................... ");
		
		String resource="configuration.xml";
		try {
			factory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	

	/**
	 * 打开SqlSession
	 *  true 打开自动提交事务
	 *  false 不打自动提交事
	 * @return session
	 */
	public static SqlSession openSession(Boolean  auto) {
		
		SqlSession  session=factory.openSession(auto);//   true 自动提交事务  commit()  提交  rollback() 回滚
		return session;

	}

	/**
	 * 打开SqlSession
	 * 
	 * @return session
	 */
	public static SqlSession openSession() {
		
		SqlSession  session=factory.openSession(true);//   true 自动提交事务  commit()  提交  rollback() 回滚
		return session;

	}

	/**
	 * 关闭
	 */
	public static void closeSession(SqlSession session) {

		if (session != null) {
			session.close();
			session = null;
		}

	}

}
