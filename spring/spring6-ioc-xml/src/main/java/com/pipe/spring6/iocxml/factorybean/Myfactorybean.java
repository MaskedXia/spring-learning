package com.pipe.spring6.iocxml.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class Myfactorybean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
