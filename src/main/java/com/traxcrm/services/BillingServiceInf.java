package com.traxcrm.services;

import java.util.List;

import com.traxcrm.entities.Billing;

public interface BillingServiceInf {
	public void saveBill(Billing billing);
	public List<Billing> getAll();
}
