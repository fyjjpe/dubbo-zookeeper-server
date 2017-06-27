package com.impl;

import com.ConsumerServer;

/**
 * Created by Administrator on 2017/6/27.
 */
public class ConsumerServiceImpl implements ConsumerServer {
    public String sayHello(String s) {
        System.out.println("你好啊" + s);
        return s;
    }
}
