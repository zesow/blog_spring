package net.thebogus.user.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import net.thebogus.user.dao.UserDao;
import net.thebogus.user.vo.LoginDTO;
import net.thebogus.user.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserDao userDao;
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return userDao.login(dto);
	}

}
