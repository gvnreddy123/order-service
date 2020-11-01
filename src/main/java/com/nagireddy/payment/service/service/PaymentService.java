package com.nagireddy.payment.service.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagireddy.payment.service.entity.Payment;
import com.nagireddy.payment.service.repository.PaymentRepository;

@Service
public class PaymentService {

@Autowired
private PaymentRepository repo;


public Payment doPayment(Payment payment)
{
	payment.setPaymentId(200);
	payment.setTransactionId(UUID.randomUUID().toString());
	payment.setStatus(processingPayment());
	return repo.save(payment);
}
public String processingPayment()
{
	return new Random().nextBoolean()?"success":"failed";
}

public Payment findPaymentHistoryById(int orderId)
{
	return repo.findByOrderId(orderId);
}

}
