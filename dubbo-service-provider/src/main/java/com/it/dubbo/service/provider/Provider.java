package com.it.dubbo.service.provider;

import java.io.IOException;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.it.dubbo.service.api.HelloService;

public class Provider {

	public static void main(String[] args) throws IOException {
		ServiceConfig<HelloService> serviceConfig = new ServiceConfig<HelloService>();
        
		serviceConfig.setApplication(new ApplicationConfig("dubbo-service-provider"));
        serviceConfig.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
//        serviceConfig.setProtocol(protocol);
//        serviceConfig.setProvider(provider);
       
        serviceConfig.setInterface(HelloService.class);
        serviceConfig.setRef(new HelloServiceImpl());
        //serviceConfig.setMethods(methods); MethodConfig --> ArgumentConfig
        
        serviceConfig.export();
        
        System.in.read();
	}
}
