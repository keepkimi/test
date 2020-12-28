package com.kimi.sp01.service;

import com.kimi.sp01.pojo.Order;

public interface OrderService {
	
	
	Order getOrder(String orderId);
	void addOrder(Order order);
}