package org.dubbo.demo.provider;

import java.io.IOException;

import org.dubbo.demo.service.GreetingsService;
import org.dubbo.demo.service.impl.GreetingsServiceImpl;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws IOException {
//		System.setProperty("java.net.preferIPv4Stack", "true");
        ServiceConfig<GreetingsService> service = new ServiceConfig<>(); // #1
        service.setApplication(new ApplicationConfig("first-dubbo-provider")); // #2
        service.setRegistry(new RegistryConfig("zookeeper://localhost:2181")); // #3
        service.setInterface(GreetingsService.class); // #4
        service.setRef(new GreetingsServiceImpl()); // #5
        service.export(); // #6
        System.in.read(); // #7
    }
}
