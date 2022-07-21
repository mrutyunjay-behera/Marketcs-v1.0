package com.traxcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.traxcrm.entities.Contact;
import com.traxcrm.services.ContactServiceInf;

@Controller
public class ContactController {
	@Autowired
	private ContactServiceInf contactService;

	@RequestMapping("/contactList")
	public String getAllContactList(Model model) {
		List<Contact> contacts= contactService.getAllContact();
		model.addAttribute("contacts",contacts);
		
		return "all_list_contact";
	}

	@RequestMapping("/getContactById")
	public String getContactById(@RequestParam("id")long id, ModelMap model) {
		System.out.println("Hello");
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact",contact);
		return "contact_info";
	}
}
