package com.price.price.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.price.price.entity.PricingEntity;

public class PricingServiceImpl {

	@Autowired
	PricingRepository pricingRepository;
	
	public Integer addPrices(PricingEntity pricingEntity) {
		PricingEntity pricingEntity2 = pricingRepository.save(pricingEntity);
		return pricingEntity2.getPricingId();
	}
	
	public void deletePriceById(Integer id) {
		pricingRepository.deleteById(id);
	}
	
	public void updatePrices(PricingEntity pricingEntity) {
		pricingRepository.save(pricingEntity);
	}
}
