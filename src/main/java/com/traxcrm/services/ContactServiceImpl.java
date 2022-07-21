package com.traxcrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.entities.Contact;
import com.traxcrm.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactServiceInf {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public void saveContact(Contact contact) {
		contactRepository.save(contact);
	}
	
	@Override
	public List<Contact> getAllContact() {
		List<Contact> contacts = contactRepository.findAll();
		return contacts;
	}
	
	@Override
	public Contact getContactById(long id) {
		Optional<Contact> contactBy = contactRepository.findById(id);
		return contactBy.get();
	}
}
