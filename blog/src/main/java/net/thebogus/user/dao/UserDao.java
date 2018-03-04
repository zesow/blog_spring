package net.thebogus.user.dao;

import net.thebogus.user.vo.LoginDTO;
import net.thebogus.user.vo.UserVO;

public interface UserDao {
	
	public UserVO login(LoginDTO dto) throws Exception;
}
