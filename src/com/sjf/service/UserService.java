package com.sjf.service;

import com.sjf.spring.*;

/**
 * @author shijunfeng
 */

@Component
public class UserService implements UserInterface {

    @Autowired
    private OrderService orderService;

    private String beanName;

    @Override
    public void test() {
        System.out.println(orderService);
    }


}
