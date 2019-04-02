package com.dubbo.consumer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Reference(version="2.0.0",timeout=100000,check=false)
	OrderService orderService;
	
	@RequestMapping("/find")
	public String find() {
		String result=orderService.findOrderById(18L);
		return result;
	}
}

