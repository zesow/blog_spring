package net.thebogus.user.controller;

import javax.inject.Inject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.WebUtils;

import net.thebogus.user.service.UserService;
import net.thebogus.user.vo.LoginDTO;
import net.thebogus.user.vo.UserVO;

@Controller
@RequestMapping("/user/*")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Inject
	private UserService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public void loginGET(@ModelAttribute("dto") LoginDTO dto) throws Exception{
		logger.info("login get.....");
	}
	
	@RequestMapping(value="/loginPost", method=RequestMethod.POST)
	public void loginPOST(LoginDTO dto,HttpSession session,Model model) throws Exception{
		logger.info("login post.....");
		UserVO vo = service.login(dto);
		if(vo == null)
			return;
		
		model.addAttribute("userVO",vo);
	}
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public void signupGET(UserVO userVO,Model model) throws Exception{
		logger.info("login.....");
	}
	
	  @RequestMapping(value = "/logout", method = RequestMethod.GET)
	  public void logout(HttpServletRequest request, 
	      HttpServletResponse response, HttpSession session) throws Exception {

	    Object obj = session.getAttribute("login");
	    Object dest = session.getAttribute("dest");
	    if (obj != null) {
	      UserVO vo = (UserVO) obj;

	      session.removeAttribute("login");
	      session.invalidate();


	      response.sendRedirect(dest != null ? (String) dest : "/");
//	      Cookie loginCookie = WebUtils.getCookie(request, "loginCookie");
//
//	      if (loginCookie != null) {
//	        loginCookie.setPath("/");
//	        loginCookie.setMaxAge(0);
//	        response.addCookie(loginCookie);
//	        service.keepLogin(vo.getuId(), session.getId(), new Date());
//	      }
	    }
	  }
}
