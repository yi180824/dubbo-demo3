package com.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version="1.0.0",timeout=1000000)
public class OrderServiceImpl implements OrderService{

	@Override
	public String findOrderById(Long userId) {
		// TODO Auto-generated method stub
		return "第1版本：provide userID="+userId;
	}

}
