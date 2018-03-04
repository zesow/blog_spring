package net.thebogus.user.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import net.thebogus.user.vo.LoginDTO;
import net.thebogus.user.vo.UserVO;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Inject
	private SqlSession sqlSession;
	private static final String namespace ="net.thebogus.userMapper";
	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".login",dto);
	}
	

}
