package com.infinite.VizagMuncipal.controller;

import javax.validation.Valid;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.infinite.VizagMuncipal.model.Muncipal;
import com.infinite.VizagMuncipal.service.MuncipalServiceImpl;

@Controller
public class MuncipalController {
	private static final Logger logger = Logger.getLogger(MuncipalController.class);
	@Autowired
	MuncipalServiceImpl si;
	@RequestMapping(value = "/getAllusers", method = RequestMethod.GET)
	public String getAllCustomers(Model model) {
		model.addAttribute("logindata", new Muncipal());
		return "loginpage";
	}

	/*@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "redirect:/getAllCustomers";
	}*/
	@RequestMapping(value = "/loginpage", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addData(@Valid @ModelAttribute("logindata") Muncipal logindata, BindingResult result) {
		if (result.hasErrors()) {
			logger.info(result);
			return "loginpage";
		} else if (logindata.getId() == 0) {
			si.login(logindata);
		}
		return "homepage";
	}
}
