package com.traxcrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traxcrm.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
