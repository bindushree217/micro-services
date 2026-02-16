package com.flipkart.order.service;

import org.springframework.stereotype.Service;

import com.flipkart.order.request.OrderRequest;

@Service
public interface IOrderService {
	
	public int createOrder(OrderRequest orderRequest);

}
