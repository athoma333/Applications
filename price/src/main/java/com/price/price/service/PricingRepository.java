package com.price.price.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.price.price.entity.PricingEntity;

public interface PricingRepository extends JpaRepository<PricingEntity, Integer>{

}
