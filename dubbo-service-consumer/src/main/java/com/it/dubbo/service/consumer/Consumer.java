package com.it.dubbo.service.consumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.it.dubbo.service.api.HelloService;

public class Consumer {


	public static void main(String[] args) {
		ReferenceConfig<HelloService> referenceConfig = new ReferenceConfig<HelloService>();
       
		referenceConfig.setApplication(new ApplicationConfig("first-dubbo-consumer"));
        referenceConfig.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
       //referenceConfig.setConsumer(consumer);
        
        referenceConfig.setInterface(HelloService.class);
        HelloService helloService = referenceConfig.get();
        
        //referenceConfig.setMethods(methods); MethodConfig --> ArgumentConfig
        
        ConsumerService cs = new ConsumerService();
        cs.setHelloService(helloService);
        cs.consume();
        
	}
}
