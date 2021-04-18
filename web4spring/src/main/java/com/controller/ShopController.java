package com.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.AllDetails;
import com.model.Item;
import com.service.ShopService;

@Controller
@RequestMapping("/shop")


public class ShopController {
	
	@Autowired
	private ShopService shopService;
	
	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	
	@RequestMapping(value="loadshop1page", method=RequestMethod.GET)
	public ModelAndView loadshop1Form(ModelAndView mandv) {
		List<Item> list = shopService.selectItemsByCategory("Groccery");
		mandv.addObject("list",list);
		mandv.setViewName("Shop1");
		return mandv;
	}
	
	@RequestMapping(value="loadshop2form", method=RequestMethod.POST)
	public ModelAndView loadshop2Form(ModelAndView mandv, HttpServletRequest request) {
		if(request.getParameterMap().containsKey("select")){
			String[] selectedItems = request.getParameterValues("select");
			for(int i=0;i<selectedItems.length;i++) {
				String qty=request.getParameter(selectedItems[i]);
				hm.put(Integer.parseInt(selectedItems[i]),Integer.parseInt(qty));
			}
		}
		List<Item> list = shopService.selectItemsByCategory("Accessories");
		mandv.addObject("list",list);
		mandv.setViewName("Shop2");
		return mandv;
	}
	
	@RequestMapping(value="loadshop3form", method=RequestMethod.POST)
	public ModelAndView loadshop3Form(ModelAndView mandv, HttpServletRequest request) {
		if(request.getParameterMap().containsKey("select")){
			String[] selectedItems = request.getParameterValues("select");
			for(int i=0;i<selectedItems.length;i++) {
				String qty=request.getParameter(selectedItems[i]);
				hm.put(Integer.parseInt(selectedItems[i]),Integer.parseInt(qty));
			}
		}
		List<Item> list = shopService.selectItemsByCategory("Fruits");
		mandv.addObject("list",list);
		mandv.setViewName("Shop3");
		return mandv;
	}
	@RequestMapping(value="invoiceform", method=RequestMethod.POST)
	public ModelAndView invoiceForm(ModelAndView mandv, HttpServletRequest request, HttpSession session) {
		if(request.getParameterMap().containsKey("select")){
			String[] selectedItems = request.getParameterValues("select");
			for(int i=0;i<selectedItems.length;i++) {
				String qty=request.getParameter(selectedItems[i]);
				hm.put(Integer.parseInt(selectedItems[i]),Integer.parseInt(qty));
			}
		}
		int uid = (int)session.getAttribute("uid");
		AllDetails allDetails = shopService.createInvoice(uid, hm);
		session.setAttribute("allDetails", allDetails);
		System.out.println(hm);
		mandv.addObject("AllDetails", allDetails);
		mandv.setViewName("Invoice");
		return mandv;
	}
	
	@RequestMapping(value="createpdf", method=RequestMethod.GET)
	public ModelAndView createPDF(ModelAndView mandv, HttpServletRequest request, HttpSession session) {
		AllDetails allDetails = (AllDetails)session.getAttribute("allDetails");
		shopService.createPDF(allDetails);
		mandv.addObject("AllDetails", allDetails);
		mandv.setViewName("Invoice");
		return mandv;
	}
	
	@RequestMapping(value="createExcel", method=RequestMethod.GET)
	public ModelAndView createExcel(ModelAndView mandv, HttpServletRequest request, HttpSession session) {
		AllDetails allDetails = (AllDetails)session.getAttribute("allDetails");
		shopService.createExcel(allDetails);
		mandv.addObject("AllDetails", allDetails);
		mandv.setViewName("Invoice");
		return mandv;
	}
	
	@RequestMapping(value="sendMail", method=RequestMethod.GET)
	public ModelAndView sendMail(ModelAndView mandv, HttpServletRequest request, HttpSession session) {
		AllDetails allDetails = (AllDetails)session.getAttribute("allDetails");
		shopService.sendMail(allDetails);
		mandv.addObject("AllDetails", allDetails);
		mandv.setViewName("Invoice");
		return mandv;
	}
	
	@RequestMapping(value="sendSMS", method=RequestMethod.GET)
	public ModelAndView sendSMS(ModelAndView mandv, HttpServletRequest request, HttpSession session) {
		AllDetails allDetails = (AllDetails)session.getAttribute("allDetails");
		shopService.sendSMS(allDetails);
		mandv.addObject("AllDetails", allDetails);
		mandv.setViewName("Invoice");
		return mandv;
	}
	
	public final ShopService getShopService() {
		return shopService;
	}

	public final void setShopService(ShopService shopService) {
		this.shopService = shopService;
	}
	

}
