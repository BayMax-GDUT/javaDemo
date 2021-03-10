package com.demo.framework.spring.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("demoBean")
public class MyFactoryBean implements FactoryBean<DemoBean> {
    @Override
    public DemoBean getObject() throws Exception {
        // demoBean本来不是一个Bean，但是FactoryBean将其变成了Bean
        DemoBean demoBean = new DemoBean();
        return demoBean;
    }

    @Override
    public Class<?> getObjectType() {
        return DemoBean.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
