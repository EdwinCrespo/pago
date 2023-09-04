package com.CAMEBOL.pago.entity;

import java.util.List;

public class InvoiceData {
	private List<InvoiceDetail> InvoiceDetails; //Información relacionada al detalle de la factura a generar.

	public InvoiceData() {
		super();
	}

	public List<InvoiceDetail> getInvoiceDetails() {
		return InvoiceDetails;
	}

	public void setInvoiceDetails(List<InvoiceDetail> invoiceDetails) {
		InvoiceDetails = invoiceDetails;
	}
	
}
