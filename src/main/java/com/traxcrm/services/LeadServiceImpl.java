package com.traxcrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.entities.Lead;

import com.traxcrm.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadServiceInf {
	
	@Autowired
	private LeadRepository leadRepository;
	
	@Override
	public void saveLead(Lead lead) {
		leadRepository.save(lead);
		
	}
	
	@Override
	public Lead getLeadById(long id) {
		Optional<Lead> optLead = leadRepository.findById(id);
		Lead lead = optLead.get();
		return lead;
	}
	
	@Override
	public void deleteById(long id) {
		leadRepository.deleteById(id);
	}
	
	@Override
	public List<Lead> getAllLead() {
		List<Lead> leads = leadRepository.findAll();
		return leads;
	}
	
	
}
