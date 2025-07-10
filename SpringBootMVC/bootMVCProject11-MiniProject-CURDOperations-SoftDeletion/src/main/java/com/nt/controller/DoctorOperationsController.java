package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.service.IDoctorMgmtService;
import com.nt.vo.DoctorVO;

import jakarta.servlet.http.HttpSession;

@Controller
public class DoctorOperationsController {
	@Autowired
	private IDoctorMgmtService docService;

	@GetMapping("/")
	public String ShowHome() {

		return "welcome";
	}

	@GetMapping("/report")
	public String showReport(Map<String, Object> map) {
		System.out.println("DoctorOperationsController.showReport()");

		List<DoctorVO> listVO = docService.findAllDoctors();

		map.put("doctorsList", listVO);

		return "show_report";
	}

	@GetMapping("/register") // for register Doctor Form Page launching
	public String showRegisterDoctorForm(@ModelAttribute("docVO") DoctorVO vo) {
		return "register_doctor_form";
	}

	/*
	 * @PostMapping("/register") public String
	 * regsiterDcotor(@ModelAttribute("docVO") DoctorVO vo, Map<String,Object> map)
	 * { //use service String msg=docService.registerDoctor(vo); List<DoctorVO>
	 * listVO=docService.findAllDoctors(); //keep the results in Model Attribute
	 * map.put("resultMsg", msg); map.put("doctorsList", listVO); //return LVN'
	 * return "show_report"; }
	 */

	/*
	 * @PostMapping("/register") //solution 1 public String
	 * regsiterDcotor(@ModelAttribute("docVO") DoctorVO vo, Map<String,Object> map)
	 * { System.out.println("DoctorOperationsController.regsiterDcotor()"); //use
	 * service String msg=docService.registerDoctor(vo); //keep the results in Model
	 * Attribute map.put("resultMsg", msg); //return LVN' return "redirect:report";
	 * }
	 */

	/*
	 * @PostMapping("/register") //solution 1 public String
	 * regsiterDcotor(@ModelAttribute("docVO") DoctorVO vo, Map<String,String> map)
	 * { System.out.println("DoctorOperationsController.regsiterDcotor()"); //use
	 * service String msg=docService.registerDoctor(vo); //keep the results as Model
	 * Attribute map.put("resultMsg",msg); // these flash attributes are having
	 * redirectio scope //return LVN' return "redirect:report"; }
	 */
	/*
	 * @PostMapping("/register") //solution 2 public String
	 * regsiterDcotor(@ModelAttribute("docVO") DoctorVO vo, RedirectAttributes
	 * attrs) { System.out.println("DoctorOperationsController.regsiterDcotor()");
	 * //use service String msg=docService.registerDoctor(vo); //keep the results as
	 * flash Model Attribute attrs.addFlashAttribute("resultMsg",msg); // these
	 * flash attributes are having redirectio scope //return LVN' return
	 * "redirect:report"; }
	 */

	@PostMapping("/register") // solution 3 // register Dcotor form submission
	public String regsiterDcotor(@ModelAttribute("docVO") DoctorVO vo, HttpSession ses) {
		System.out.println("DoctorOperationsController.regsiterDcotor()");

		String msg = docService.registerDoctor(vo);

		ses.setAttribute("resultMsg", msg);

		return "redirect:report";
	}

	@GetMapping("/edit")
	public  String   showEditDoctorFormPage(@RequestParam("no") int no,@ModelAttribute("docVO") DoctorVO  vo) {
		
		DoctorVO  vo1=docService.showDoctorById(no);
		BeanUtils.copyProperties(vo1, vo);
		
		return  "edit_doctor_form";
		
	}

	@PostMapping("/edit")
	public String editDoctor(@ModelAttribute("docVO") DoctorVO vo, RedirectAttributes attrs) {
		System.out.println("DoctorOperationsController.editDoctor()");

		String msg = docService.editDoctor(vo);
		attrs.addFlashAttribute("resultMsg", msg);
		return "redirect:report";

	}

	@GetMapping("/delete")
	public String removeDoctor(@RequestParam("no") int no, RedirectAttributes attrs) throws Exception {
		System.out.println("DoctorOperationsController.removeDoctor()");

		String msg = docService.removeDoctor(no);

		attrs.addFlashAttribute("resultMsg", msg);

		return "redirect:report";

	}
}
