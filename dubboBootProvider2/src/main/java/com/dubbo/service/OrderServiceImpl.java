package com.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version="2.0.0",timeout=1000000)
public class OrderServiceImpl implements OrderService{

	@Override
	public String findOrderById(Long userId) {
		// TODO Auto-generated method stub
		return "第2版：provide userID="+userId;
	}

}
