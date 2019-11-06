package com.wuyk.litespring.beans.factory.support;


import com.wuyk.litespring.beans.BeanDefinition;
import com.wuyk.litespring.beans.factory.BeanFactory;

public class DefaultBeanFactory implements BeanFactory {

    public DefaultBeanFactory(String configFile) {

    }


    @Override
    public BeanDefinition getBeanDefintion(String beanID) {
        return null;
    }

    @Override
    public Object getBean(String beanID) {
        return null;
    }
}
