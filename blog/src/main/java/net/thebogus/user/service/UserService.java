package net.thebogus.user.service;

import net.thebogus.user.vo.LoginDTO;
import net.thebogus.user.vo.UserVO;

public interface UserService {

	public UserVO login(LoginDTO dto) throws Exception;
}
