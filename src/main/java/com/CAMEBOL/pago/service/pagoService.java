package com.CAMEBOL.pago.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.CAMEBOL.pago.entity.PaymentRequest;
import com.CAMEBOL.pago.entity.ReturnModelCreate;
import com.CAMEBOL.pago.entity.Venta;



@Service
public class pagoService {

	public PaymentRequest crearLink(Venta venta){
    	
		PaymentRequest paymentRequest=new PaymentRequest();
    	return paymentRequest;
    }
	
}
