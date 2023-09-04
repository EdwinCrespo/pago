package com.CAMEBOL.pago.entity;

public class ReturnModelCreate {
	   private OrderPaymentResponse item;
	   private String message;
	   private int status;
	   
	   
	public ReturnModelCreate() {
		super();
	}
	public OrderPaymentResponse getItem() {
		return item;
	}
	public void setItem(OrderPaymentResponse item) {
		this.item = item;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	   

}
