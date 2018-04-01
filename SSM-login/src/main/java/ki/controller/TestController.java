package ki.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
import ki.entity.Emp;
import ki.service.EmpService;

@Controller
public class TestController {
	@Resource
	private EmpService empService;
	
	
	@RequestMapping("hello")
	public String hello(){
		return "hello";
	}
	
	@RequestMapping("e")
	public ModelAndView empShow() {
		Map<String, Object> data = new HashMap<String,Object>();
		String name = "name";
		data.put("name", name);
		
		return new ModelAndView("emp",data);
	}
	
	@RequestMapping("emp")
	public String  listShow(HttpServletRequest request){
		List<Emp> list = empService.findAll();
		
		request.setAttribute("list",list);
		return "emp";
	}
}
