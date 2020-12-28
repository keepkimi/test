package com.kimi.sp01.service;

import java.util.List;

import com.kimi.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}