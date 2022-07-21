package com.traxcrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traxcrm.entities.Billing;
import com.traxcrm.repositories.BillingRepository;

@Service
public class BillingServiceImpl implements BillingServiceInf {
	
	@Autowired
	private BillingRepository billingRepository;
	
	@Override
	public void saveBill(Billing billing) {
		billingRepository.save(billing);
	}
	public List<Billing> getAll(){
		List<Billing> billings = billingRepository.findAll();
		return billings;
	}
	
}
