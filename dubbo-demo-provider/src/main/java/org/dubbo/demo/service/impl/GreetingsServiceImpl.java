package org.dubbo.demo.service.impl;

import org.dubbo.demo.service.GreetingsService;

/**
* @author 作者 弓步高
* @version 创建时间：2018年10月26日 下午4:57:08
* 类说明
*/
public class GreetingsServiceImpl implements GreetingsService { // #1
    public String sayHi(String name) {
        return "hi, " + name; // #2
    }
}