package com.it.dubbo.service.provider;

import com.it.dubbo.service.api.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String hi(String name) {
		return "Hi " + name;
	}

}
