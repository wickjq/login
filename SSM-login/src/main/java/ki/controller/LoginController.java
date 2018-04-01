package ki.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ki.dao.UserDao;
import ki.entity.User;
import ki.exception.AppException;
import ki.service.UserService;

@Controller
public class LoginController {
	@Resource
	private UserService userService;
	
	
	@RequestMapping("index")
	public String index(){
		return "login";
	}
	
	@RequestMapping("login")
	public String login(User user,HttpServletRequest request){
		//System.out.println(user);
		try{
			userService.check(user);
		}catch(Exception e){
			if(e instanceof AppException){
				e.printStackTrace();
				request.setAttribute("login_defeat_message", e.getMessage());
				return "login";
			}
			return "error";
		}
		
		return "redirect:emplist.do";
	}
	
	
	
}
