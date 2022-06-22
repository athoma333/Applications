package com.price.price.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PricingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pricingId;
	private Double price;
	public Integer getPricingId() {
		return pricingId;
	}
	public void setPricingId(Integer pricingId) {
		this.pricingId = pricingId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public PricingEntity(Integer pricingId, Double price) {
		super();
		this.pricingId = pricingId;
		this.price = price;
	}
	public PricingEntity() {
		super();
	}
}
