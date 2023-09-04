package com.CAMEBOL.pago.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentRequest {
	@JsonProperty("Amount")
	 private int Amount; // Monto total de pago, los últimos dos dígitos se consideran decimales
	@JsonProperty("CurrencyCode")
	 private String CurrencyCode; //Moneda de transacción
	 @JsonProperty("SystemTraceAuditNumber")
	 private String SystemTraceAuditNumber; //Identificador único creada por el comercio
	 private String credentials; // Credenciales asignadas al comercio
	 @JsonProperty("EmailShooper")
	 private String EmailShooper; // Correo electrónico del comprador
	 @JsonProperty("AdditionalData")
	private List<String[]> AdditionalData; //Información adicional requerida por el proveedor de pagos
	@JsonProperty("IData")
	 private List<String[]> IData; //Información relacionada al rubro del comercio y datos específicos del comprador. Ver Anexo 5
	 private String[] formOfPayments; //Listado de las formas de pago que se desea mostrar en el formulario de pago
	 @JsonProperty("LinklifetimeMinutes")
	 private int LinklifetimeMinutes; //Elemento que define el tiempo de vida del formulario de pagos, expresado en minutos. 
	 private boolean requireNIT; //Elemento que define si la transacción solicitará información de Nit y Razón Social. Esta información se devolverá al finalizar el pago de la transacción como parte de la notificación.
	 @JsonProperty("InvoiceData")
	 private InvoiceData InvoiceData; //Información necesaria para generar la factura del pago asociado a la transacción.
	public PaymentRequest() {
		super();
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public String getCurrencyCode() {
		return CurrencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		CurrencyCode = currencyCode;
	}
	public String getSystemTraceAuditNumber() {
		return SystemTraceAuditNumber;
	}
	public void setSystemTraceAuditNumber(String systemTraceAuditNumber) {
		SystemTraceAuditNumber = systemTraceAuditNumber;
	}
	public String getCredentials() {
		return credentials;
	}
	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}
	public String getEmailShooper() {
		return EmailShooper;
	}
	public void setEmailShooper(String emailShooper) {
		EmailShooper = emailShooper;
	}
	public List<String[]> getAdditionalData() {
		return AdditionalData;
	}
	public void setAdditionalData(List<String[]> additionalData) {
		AdditionalData = additionalData;
	}
	public List<String[]> getIData() {
		return IData;
	}
	public void setIData(List<String[]> iData) {
		IData = iData;
	}
	
	public String[] getFormOfPayments() {
		return formOfPayments;
	}
	public void setFormOfPayments(String[] formOfPayments) {
		this.formOfPayments = formOfPayments;
	}
	public int getLinklifetimeMinutes() {
		return LinklifetimeMinutes;
	}
	public void setLinklifetimeMinutes(int linklifetimeMinutes) {
		LinklifetimeMinutes = linklifetimeMinutes;
	}
	public boolean isRequireNIT() {
		return requireNIT;
	}
	public void setRequireNIT(boolean requireNIT) {
		this.requireNIT = requireNIT;
	}
	public InvoiceData getInvoiceData() {
		return InvoiceData;
	}
	public void setInvoiceData(InvoiceData invoiceData) {
		InvoiceData = invoiceData;
	}

}
