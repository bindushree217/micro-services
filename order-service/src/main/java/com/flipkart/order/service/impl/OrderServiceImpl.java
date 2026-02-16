package com.flipkart.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.order.entity.OrderEntity;
import com.flipkart.order.repository.OrderRepository;
import com.flipkart.order.request.OrderRequest;
import com.flipkart.order.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService{

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public int createOrder(OrderRequest orderRequest) {
		
		OrderEntity entity = new OrderEntity();
		entity.setItemName(orderRequest.getItemName());
		entity.setStatus(orderRequest.getStatus());
		entity.setPrice(orderRequest.getPrice());
		entity.setQuantity(orderRequest.getQuantity());;
		entity.setDescription(orderRequest.getDescription());
		
		orderRepository.save(entity);
		
		int orderId = entity.getOrderId();
		
		return orderId;
	}

}
