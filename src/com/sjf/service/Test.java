package com.sjf.service;

import com.sjf.spring.SjfApplicationContext;

/**
 * @author shijunfeng
 */
public class Test {

    public static void main(String[] args) {
        SjfApplicationContext applicationContext = new SjfApplicationContext(AppConfig.class);

        UserInterface userService = (UserInterface) applicationContext.getBean("userService");
        userService.test();

//        System.out.println(applicationContext.getBean("userService"));


    }

}
