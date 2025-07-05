package com.sjf.spring;

/**
 * @author shijunfeng
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(String beanName, Object bean);

    Object postProcessAfterInitialization(String beanName, Object bean);

}
