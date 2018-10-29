package org.dubbo.demo.consumer;

import org.dubbo.demo.service.GreetingsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
* @author 作者 弓步高
* @version 创建时间：2018年10月29日 下午6:47:09
* 类说明
*/
public class XmlApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        GreetingsService demoService = (GreetingsService)context.getBean("greetingsService");
        // Executing remote methods
        String hello = demoService.sayHi("hello");
        // Display the call result
        System.out.println(hello);
	}
}
