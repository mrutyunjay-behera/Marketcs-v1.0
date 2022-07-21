package com.traxcrm.services;

import java.util.List;

import com.traxcrm.entities.Contact;

public interface ContactServiceInf {
	public void saveContact(Contact contact);
	public List<Contact> getAllContact();
	public Contact getContactById(long id);
}