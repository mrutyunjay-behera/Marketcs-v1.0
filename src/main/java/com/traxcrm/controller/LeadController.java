package com.traxcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.entities.Contact;
import com.traxcrm.entities.Lead;
import com.traxcrm.services.ContactServiceInf;
import com.traxcrm.services.LeadServiceInf;

@Controller
public class LeadController {
	
	@Autowired
	private LeadServiceInf leadService;
	
	@Autowired
	private ContactServiceInf contactService;
	
	@RequestMapping("/")
	public String pageLeadPage() {
		return "viewPage";
	}
	
	@RequestMapping("/createLead")
	public String createLeadData(@ModelAttribute("lead") Lead lead ,ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("lead",lead);
		return "view_convert";
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.getLeadById(id);
		Contact cnt = new Contact();
		cnt.setFirstName(lead.getFirstName());
		cnt.setLastName(lead.getLastName());
		cnt.setEmail(lead.getEmail());
		cnt.setMobile(lead.getMobile());
		cnt.setLeadSource(lead.getLeadSource());
		cnt.setGender(lead.getGender());
		contactService.saveContact(cnt);
		leadService.deleteById(id);
		
		List<Contact> contacts =contactService.getAllContact();
		model.addAttribute("contacts",contacts);
		return "all_list_contact";
	}
	
	@RequestMapping("/leadList")
	public String getAllLeadList(Model model) {
		List<Lead> leads = leadService.getAllLead();
		model.addAttribute("leads",leads);
		return "all_list_lead";
	}
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id")long id, ModelMap model) {
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead",lead);
		return "view_convert";
	}
	
//	@RequestMapping("/contactList")
//	public String getAllContactList(Model model) {
//		List<Contact> contacts= contactService.getAllContact();
//		model.addAttribute("contacts",contacts);
//		
//		return "all_list_contact";
//	}

}