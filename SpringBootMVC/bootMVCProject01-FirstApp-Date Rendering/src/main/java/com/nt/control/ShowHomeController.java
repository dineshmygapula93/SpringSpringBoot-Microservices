package com.nt.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class ShowHomeController {

	private ServletConfig scg;
	private ServletContext scnt;

	@RequestMapping("/home")
	public String showHome() {
		System.out.println("ShowHomeController.showHome()");
		System.out.println("servlet name " + scg.getServletName());
		System.out.println("servlet context path " + scnt.getContextPath());
		return "welcome";
	}

	@RequestMapping("/homeresponse")
	public String showHomeresponse(HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("<h1>hello</h1>");
		return null;
	}

	@RequestMapping("/")
	public String showHome1(Map<String, Object> map) {
		System.out.println("Shared Memory class" + map.getClass() + "Hashcode of class" + map.hashCode());
		map.put("name", "dinesh");
		map.put("course", "Full Stack Java");
		System.out.println("ShowHomeController.showHome1()");
		return "welcome";
	}

	@RequestMapping("/home1")
	public String showHome1(BindingAwareModelMap map) {
		System.out.println("Shared Memory class" + map.getClass() + "Hashcode of class" + map.hashCode());
		map.put("name", "dinesh");
		map.put("course", "Full Stack Java");
		// we can add attribute also
		map.addAttribute("batch", "Regular");
		map.addAttribute("currentclass", "SpringBootMVC");
		System.out.println("ShowHomeController.showHome1()");
		return "welcome";
	}

	@RequestMapping("/home2")
	public String showHome2(ModelMap modelmap) {
		System.out.println("Shared Memory class" + modelmap.getClass() + "Hashcode of class" + modelmap.hashCode());
		modelmap.put("name", "dinesh1");
		modelmap.put("course", "Full Stack Java");
		// we can add attribute also
		modelmap.addAttribute("batch", "Regular");
		modelmap.addAttribute("currentclass", "SpringBootMVC");
		System.out.println("ShowHomeController.showHome1()");
		return "welcome";
	}

	@RequestMapping("/home3")
	public String showHome3(Model model) {
		System.out.println("Shared Memory class" + model.getClass() + "Hashcode of class" + model.hashCode());
		model.addAttribute("name", "dinesh1");
		model.addAttribute("course", "Full Stack Java");
		// we can add attribute also

		System.out.println("ShowHomeController.showHome1()");
		return "welcome";
	}

	@RequestMapping("/home4")
	public Model showHome4() {
		Model model = new BindingAwareModelMap();
		System.out.println("Shared Memory class" + model.getClass() + "Hashcode of class" + model.hashCode());
		model.addAttribute("name", "dinesh1");
		model.addAttribute("course", "Full Stack Java");
		// we can add attribute also

		System.out.println("ShowHomeController.showHome1()");
		return model;
	}

	@RequestMapping("/homemv")
	public ModelAndView showHomemv() {
		ModelAndView mav = new ModelAndView();
		System.out.println("Shared Memory class" + mav.getClass() + "Hashcode of class" + mav.hashCode());
		mav.addObject("name", "dinesh");
		mav.addObject("course", "Full Stack Java");
		mav.setViewName("welcome");
		return mav;
	}

	@RequestMapping("/process")
	public String showHomep(Map<String, Object> map) {
		System.out.println("Shared Memory class" + map.getClass() + "Hashcode of class" + map.hashCode());
		map.put("name", "dinesh");
		map.put("course", "Full Stack Java");
		System.out.println("ShowHomeController.showHome1()");
		return null;
	}

	@RequestMapping("/homefor")
	public String showHomefor(Map<String, Object> map) {
		System.out.println("Shared Memory class" + map.getClass() + "Hashcode of class" + map.hashCode());
		map.put("name", "dinesh");
		map.put("course", "Full Stack Java");
		System.out.println("ShowHomeController.showHome1()");
		return "forward:report";
	}

	@RequestMapping("/report")
	public String showreport() {
		System.out.println("Show report");
		return "show_report";
	}

	@RequestMapping("/homere")
	public String showHomere(Map<String, Object> map) {
		System.out.println("Shared Memory class" + map.getClass() + "Hashcode of class" + map.hashCode());
		map.put("name", "dinesh");
		map.put("course", "Full Stack Java");
		System.out.println("ShowHomeController.showHome1()");
		return "redirect:reportre?p1=dinesh&p2=java";
	}

	@RequestMapping("/reportre")
	public String showreportre() {
		System.out.println("Show report");
		return "show_reportre";
	}

	@RequestMapping("/homehttp")
	public String showHomehttp(Map<String, Object> map, HttpServletRequest req, HttpServletResponse res) {
		System.out.println("Request path" + req.getServletPath());
		System.out.println("Response path" + res.getContentType());
		map.put("name", "dinesh");
		map.put("course", "Full Stack Java");
		System.out.println("ShowHomeController.showHome1()");
		return "welcome";
	}

	@RequestMapping("/homeses")
	public String showHomeses(HttpSession ses) {
		ses.setAttribute("name", "dinesh");
		ses.setAttribute("course", "fsj");
		return "welcome";
	}
}
