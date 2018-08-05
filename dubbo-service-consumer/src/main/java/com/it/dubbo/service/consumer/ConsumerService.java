package com.it.dubbo.service.consumer;

import com.it.dubbo.service.api.HelloService;

public class ConsumerService {

	private HelloService helloService;

	public void consume() {
		for (int i = 0; i < 10; i++) {
			System.out.println("======>" + helloService.hi("Beijing"));
		}
	}

	public HelloService getHelloService() {
		return helloService;
	}

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
	
}
