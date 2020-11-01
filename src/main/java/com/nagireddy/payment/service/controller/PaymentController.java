package com.nagireddy.payment.service.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagireddy.payment.service.entity.Payment;
import com.nagireddy.payment.service.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService service;
	
	@PostMapping("/doPayment")
	public Payment doPayment(@RequestBody Payment payment)
	{
		 return service.doPayment(payment);
	}
	@GetMapping("/{orderId}")
	public Payment findPaymentHistoryById(@PathVariable int orderId)
	{
		return service.findPaymentHistoryById(orderId);
	}
	
	
}
