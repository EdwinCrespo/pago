package com.CAMEBOL.pago.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderPaymentResponse {
	@JsonProperty("back_url")
    private String backUrl;
    private String orderCode;
    
	public OrderPaymentResponse() {
		super();
	}
	public String getBackUrl() {
		return backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
    
}
