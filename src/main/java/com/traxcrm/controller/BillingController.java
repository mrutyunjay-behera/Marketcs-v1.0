package com.traxcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.entities.Billing;
import com.traxcrm.entities.Contact;
import com.traxcrm.services.BillingServiceInf;
import com.traxcrm.services.ContactServiceInf;

@Controller
public class BillingController {
	
	@Autowired
	private ContactServiceInf contactService;
	
	@Autowired
	private BillingServiceInf billingService;
	
	@RequestMapping("saveBill")
	public String saveBill(@ModelAttribute("billing") Billing billing , ModelMap model) {
		billingService.saveBill(billing);
		List<Billing> billings = billingService.getAll();
		model.addAttribute("billings",billings);
		return "billing_list";
	}
	
	@RequestMapping("bill")
	public String getBillingPage(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact" , contact);
		return "billing_form";
	}
	
	@RequestMapping("billList")
	public String billList(ModelMap model) {
		List<Billing> billings = billingService.getAll();
		model.addAttribute("billings",billings);
		return "billing_list";
	}
}