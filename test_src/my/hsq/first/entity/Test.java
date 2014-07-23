package my.hsq.first.entity;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import javax.annotation.Resource;

import my.hsq.first.interf.IUserOperation;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {
	public static SqlSessionFactory sqlSessionFactory;
	public static Reader reader;
	
	static{
		try {
			reader =Resources.getResourceAsReader("Configuration.xml");
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	/**
	 * @return the sqlSessionFactory
	 */
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}



	/**
	 * @param sqlSessionFactory the sqlSessionFactory to set
	 */
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			IUserOperation iUserOperation=sqlSession.getMapper(IUserOperation.class);
			//User user=iUserOperation.selectUserById(1);
//			User user1=new User();
//			user1.setUsername("huangshanqi02");
//			user1.setUserage(26);
//			user1.setUseraddress("yunfu");
//			iUserOperation.addUser(user1);
//			sqlSession.commit();
			List<User> uList=iUserOperation.selectUsersLikeName("%huangshanqi%");
			//User user = (User) sqlSession.selectOne("my.hsq.first.entity.UserMapper.selectUserById", 1);
			for (User user:uList) {
				System.out.println("--:" + user.getUsername() + ":"
						+ user.getUserage() + ":" + user.getUseraddress());
			}
			
			User user2=iUserOperation.selectUserById(2);
			user2.setUseraddress("shanghai");
			iUserOperation.updateUser(user2);
			sqlSession.commit();
			List<User> uList1=iUserOperation.selectUsersLikeName("%huangshanqi%");
			//User user = (User) sqlSession.selectOne("my.hsq.first.entity.UserMapper.selectUserById", 1);
			for (User user:uList1) {
				System.out.println("--:" + user.getUsername() + ":"
						+ user.getUserage() + ":" + user.getUseraddress());
			}
			
			iUserOperation.deleteUserById(2);
			sqlSession.commit();
			List<User> uList3=iUserOperation.selectUsersLikeName("%huangshanqi%");
			//User user = (User) sqlSession.selectOne("my.hsq.first.entity.UserMapper.selectUserById", 1);
			for (User user:uList1) {
				System.out.println("--:" + user.getUsername() + ":"
						+ user.getUserage() + ":" + user.getUseraddress());
			}
		} finally {
			// TODO: handle exception
			sqlSession.close();
		}
		
		
		
		

	}

}