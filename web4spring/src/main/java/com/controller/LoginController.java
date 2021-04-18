package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Customer;
import com.model.Item;
import com.model.User;
import com.service.UserService;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="loadloginform", method=RequestMethod.GET)
	public ModelAndView loadLoginForm(ModelAndView mandv) {
		User user = new User();
		mandv.addObject("user",user);
		mandv.setViewName("login");
		return mandv;
	}
	
	@RequestMapping(value="submitloginform", method=RequestMethod.POST)
	public ModelAndView submitLoginForm(User user,ModelAndView mandv, HttpSession session) {
		int uid = userService.checkUser(user);
		if(uid!=0) {
			session.setAttribute("uid", uid);
			mandv.addObject("user",user);
			mandv.setViewName("welcome");
		}
		else {
			user = new User();
			mandv.addObject("user",user);
			mandv.setViewName("login");
		}
		return mandv;
	}
	
	@RequestMapping(value="loadregisterform", method=RequestMethod.GET)
	public ModelAndView loadRegisterForm(ModelAndView mandv) {
		Customer customer = new Customer();
		mandv.addObject("customer",customer);
		mandv.setViewName("register");
		return mandv;
	}
	
	@RequestMapping(value="submitregisterform", method=RequestMethod.POST)
	public ModelAndView submitRegisterForm(Customer customer,ModelAndView mandv, HttpSession session) {
		userService.createCustomer(customer);
		int uid=customer.getCustomerId();
		session.setAttribute("uid", uid);
		mandv.addObject("customer",customer);
		mandv.setViewName("welcome");
		return mandv;
	}
	
	@RequestMapping(value="loaditemform", method=RequestMethod.GET)
	public ModelAndView loadItemForm(ModelAndView mandv) {
		Item item = new Item();
		mandv.addObject("item",item);
		mandv.setViewName("Item");
		return mandv;
	}
	
	@RequestMapping(value="submititemform", method=RequestMethod.POST)
	public ModelAndView submitItemForm(Item item,ModelAndView mandv) {
		userService.createItem(item);
		mandv.addObject("item",item);
		mandv.setViewName("welcome");
		return mandv;
	}
	
	

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
