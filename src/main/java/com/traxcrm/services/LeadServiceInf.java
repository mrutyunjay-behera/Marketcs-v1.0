package com.traxcrm.services;

import java.util.List;

import com.traxcrm.entities.Lead;

public interface LeadServiceInf {
	public void saveLead(Lead lead);
	public Lead getLeadById(long id);
	public void deleteById(long id);
	public List<Lead> getAllLead();
}
