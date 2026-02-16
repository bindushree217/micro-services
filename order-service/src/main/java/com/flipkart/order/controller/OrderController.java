package com.flipkart.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.flipkart.order.OrderServiceApplication;
import com.flipkart.order.request.OrderRequest;
import com.flipkart.order.service.IOrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	IOrderService iOrderService;
	
	@PostMapping("/placeOrder")
	public ResponseEntity placeOrder(@RequestBody OrderRequest orderRequest) {
		
		iOrderService.createOrder(orderRequest);
		return ResponseEntity.ok(HttpStatus.OK);
	}

}
