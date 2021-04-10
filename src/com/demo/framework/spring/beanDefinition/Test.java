package com.demo.framework.spring.beanDefinition;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        /**
         * 声明bean的几种方式
         * <bean></bean>
         * @Bean
         * @Component
         * BeanDefinition 上面几种方式的底层都是通过BeanDefinition实现的
         */

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        // 通过builder获取一个BeanDefinition的对象，通过该对象声明目标对象
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(DemoBean.class);
        annotationConfigApplicationContext.registerBeanDefinition("demoBean", beanDefinition);
        annotationConfigApplicationContext.refresh();
        DemoBean demoBean = annotationConfigApplicationContext.getBean("demoBean", DemoBean.class);
        demoBean.sout();
    }
}
