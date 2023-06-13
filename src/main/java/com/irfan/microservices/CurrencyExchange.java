package com.irfan.microservices;

import java.math.BigDecimal;

public class CurrencyExchange {
	
private	 Long id;
private	String from;
private	String to;
private BigDecimal quantity;
private BigDecimal conversionMultiple;
private BigDecimal totalCalculatedAmount;
private String envoirement;

public CurrencyExchange() {
	
}

public CurrencyExchange(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,
		BigDecimal totalCalculatedAmount, String envoirement) {
	super();
	this.id = id;
	this.from = from;
	this.to = to;
	this.quantity = quantity;
	this.conversionMultiple = conversionMultiple;
	this.totalCalculatedAmount = totalCalculatedAmount;
	this.envoirement = envoirement;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFrom() {
	return from;
}

public void setFrom(String from) {
	this.from = from;
}

public String getTo() {
	return to;
}

public void setTo(String to) {
	this.to = to;
}

public BigDecimal getQuantity() {
	return quantity;
}

public void setQuantity(BigDecimal quantity) {
	this.quantity = quantity;
}

public BigDecimal getConversionMultiple() {
	return conversionMultiple;
}

public void setConversionMultiple(BigDecimal conversionMultiple) {
	this.conversionMultiple = conversionMultiple;
}

public BigDecimal getTotalCalculatedAmount() {
	return totalCalculatedAmount;
}

public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
	this.totalCalculatedAmount = totalCalculatedAmount;
}

public String getEnvoirement() {
	return envoirement;
}

public void setEnvoirement(String envoirement) {
	this.envoirement = envoirement;
}

	
	

}
