package com.it.dubbo.service.provider;

import java.io.IOException;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.it.dubbo.service.api.HelloService;

public class Provider {

	public static void main(String[] args) throws IOException {
		ServiceConfig<HelloService> serviceConfig = new ServiceConfig<HelloService>();
        serviceConfig.setApplication(new ApplicationConfig("dubbo-service-provider"));
        
        //RegistryConfig rc = new RegistryConfig("zookeeper://127.0.0.1:2181");
        //rc.setTimeout(timeout);
        //rc.setGroup(group);
        //rc.setProtocol(protocol);
        //rc.setRegister(register);
        //rc set ....
        serviceConfig.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
        
        //ProtocolConfig pc = new ProtocolConfig();
        //serviceConfig.setProtocol(pc);
        
        //ServiceConfig<HelloService>  sc = new ServiceConfig<>();
        //sc.setRef(new HelloServiceImpl());
        //sc.setInterface(HelloService.class);
        serviceConfig.setInterface(HelloService.class);
        serviceConfig.setRef(new HelloServiceImpl());
        
        serviceConfig.export();
        
        System.in.read();
	}
}
