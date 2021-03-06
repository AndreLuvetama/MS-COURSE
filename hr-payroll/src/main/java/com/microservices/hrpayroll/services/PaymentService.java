package com.microservices.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.microservices.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	public Payment getPayment(long worked, int days) {
		return new Payment("Bob", 200.0, days);
		
	}

}
