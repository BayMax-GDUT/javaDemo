package com.demo.framework.spring.factoryBean;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.registerBean(DemoBean.class, () -> {
            DemoBean demoBean = new DemoBean();
            demoBean.setName("XXXX");
            return demoBean;
        });
//        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//        /**
//         * 这里设置的Bean类型为MyFactoryBean，实际上会生成两个对象
//         * 1、&demoBean，实际上是MyFactoryBean类的对象
//         * 2、demoBean，是MyFactoryBean中声明的demoBean对象
//         */
//        beanDefinition.setBeanClass(MyFactoryBean.class);
//        annotationConfigApplicationContext.registerBeanDefinition("demoBean", beanDefinition);
        DemoBean demoBean = annotationConfigApplicationContext.getBean("demoBean", DemoBean.class);
        MyFactoryBean bean = annotationConfigApplicationContext.getBean("&demoBean", MyFactoryBean.class);

    }
}
