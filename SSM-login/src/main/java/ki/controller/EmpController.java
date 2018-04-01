package ki.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ki.entity.Emp;
import ki.service.EmpService;

@Controller
public class EmpController {
	@Resource
	private EmpService empService;
	
	@RequestMapping("emplist")
	public String showEmpList(HttpServletRequest request){
		List<Emp> list = (List<Emp>)empService.findAll();
		request.setAttribute("list", list);
		return "emplist";
	}
	
	@RequestMapping("del")
	public String delete(HttpServletRequest request){
		int id = Integer.parseInt(request.getParameter("id"));
		empService.deleteById(id);
		return "redirect:emplist.do";
	}
	@RequestMapping("load")
	public String load(HttpServletRequest request){
		int id = Integer.parseInt(request.getParameter("id"));
		Emp emp = empService.findById(id);
		request.setAttribute("emp", emp);
		return "updateemp";
		
	}
	
	@RequestMapping("update")
	public String update(Emp emp){
		empService.update(emp);
		return "redirect:emplist.do";
	}
	
	@RequestMapping("toAdd")
	public String toAdd(){
		return "addemp";
	}
	
	@RequestMapping("add")
	public String add(Emp emp){
		empService.save(emp);
		return "redirect:emplist.do";
	}
}
