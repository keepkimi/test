package com.kimi.sp01.service;

import com.kimi.sp01.pojo.User;

public interface UserService {
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}