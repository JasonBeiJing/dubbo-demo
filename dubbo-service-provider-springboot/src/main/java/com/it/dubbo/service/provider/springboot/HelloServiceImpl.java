package com.it.dubbo.service.provider.springboot;

import com.it.dubbo.service.api.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String hi(String name) {
		return "Hello " + name;
	}

}
