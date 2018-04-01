package ki.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ki.entity.User;
import ki.exception.AppException;
import ki.service.UserService;

@Controller
public class RegistController {
	@Resource
	private UserService userService;
	
	@RequestMapping("to_regist")
	public String to_regist(){
		return "regist";
	}
	
	@RequestMapping("regist")
	public String regist(User user,HttpServletRequest request){
		try{
			userService.check_username(user.getUsername());
		}catch(Exception e){
			if(e instanceof AppException){
				request.setAttribute("regist_defeat_msg", e.getMessage());
				return "regist";
			}
			return "error";
			
		}
		userService.save(user);
		return "redirect:index.do";
	}
}
