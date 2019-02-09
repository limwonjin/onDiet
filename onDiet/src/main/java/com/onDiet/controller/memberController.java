package com.onDiet.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onDiet.service.memberService;
import com.onDiet.vo.Member;

@Controller
public class memberController {
	
	@Autowired
	memberService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( Model model, HttpSession session) {
		String id = (String) session.getAttribute("id");
		if(id ==null) {
			return "redirect:/login";
		}
		model.addAttribute("id", id);  
		return "home";
	} 
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {	return "login";	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginProcess(Model model, HttpSession session, String id, String pass) {
		
		System.out.println("============id,pass"+id+pass);
		String result  = service.login(id, pass);
		if(result.equals("success")) {
			session.setAttribute("id",id);
			return "redirect:/";
		}
		model.addAttribute("msg", result);
		return "login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.setAttribute("id", null);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String signIn(@ModelAttribute Member member) {	return "signin";	}
	
	
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String signInProcess(HttpSession session ,@ModelAttribute Member member) {
		service.signIn(member);
		session.setAttribute("id",member.getId());
		return "redirect:/";
	}
	
	@RequestMapping(value = "/signout", method = RequestMethod.GET)
	public String signOutProcess(HttpSession session) {
		String id = (String)session.getAttribute("id");
		service.siginOut(id);
		session.setAttribute("id", null);
		return "redirect:/";
	}
}
