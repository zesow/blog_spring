package net.thebogus.blog;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.thebogus.user.dao.UserDao;
import net.thebogus.user.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/*.xml"})
public class UserDaoTest {
	
	@Inject
	private UserDao dao;
	
	@Test
	public void testInsertUser() throws Exception{
		UserVO vo = new UserVO();
		vo.setId("gus");
		vo.setPasswd("gus");
		vo.setName("거스");
		vo.setMail("sdaasd@naver.com");
	
	}
}
