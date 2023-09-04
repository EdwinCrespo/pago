package com.CAMEBOL.pago.controller;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.CAMEBOL.pago.entity.PaymentRequest;
import com.CAMEBOL.pago.entity.ReturnModelCreate;
import com.CAMEBOL.pago.entity.Venta;

import jakarta.validation.Valid;
import jakarta.ws.rs.client.Entity;



@RestController
@RequestMapping("/pago")
@CrossOrigin(origins = "*")
public class pagoController {
	@Autowired
	private RestTemplate restTemplate;
	@Value("${credenciales}")
	private String credenciales;
	private  List<String[]> iData = new ArrayList<>();
	
	@PostMapping("/crear")
    public ResponseEntity<?> nuevo(@Valid @RequestBody Venta venta){
		LocalDateTime now = LocalDateTime.now();
		UUID uuid = UUID.randomUUID();
		String uniqueId = now.toString() + "-" + uuid.toString();
		String[] array1 = {"client_phone_number", "+59177178368"};
		String[] array2 = {"customer_document_number", "5811832"};
		iData.add(array1);
		iData.add(array2);
		PaymentRequest paymentRequest=new PaymentRequest();
		int total=(int)(venta.getTotal()*100);
		String[] formOfPayments = {"CSRCSA", "QRBNB"};
		paymentRequest.setAmount(total);
		paymentRequest.setCurrencyCode("BOB");
        paymentRequest.setCredentials(credenciales);
        paymentRequest.setSystemTraceAuditNumber(uniqueId);
        paymentRequest.setEmailShooper("e.crespoparada@gmail.com");// hay que cambiar 
        // adicional data
        paymentRequest.setIData(iData);
        paymentRequest.setFormOfPayments(formOfPayments);
        paymentRequest.setRequireNIT(true);
        paymentRequest.setLinklifetimeMinutes(2);
        
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<PaymentRequest> requestEntity = new HttpEntity<>(paymentRequest, headers);
        
        
        ResponseEntity<ReturnModelCreate> responseEntity = restTemplate.exchange(
                "http://devkqtest.eastus2.cloudapp.azure.com/KXPaymentTR/HostedService.svc/CreateOrder",
                HttpMethod.POST,
                requestEntity,
                ReturnModelCreate.class
            );

          
        
		return new ResponseEntity(responseEntity.getBody(),HttpStatus.CREATED);
    }
}
