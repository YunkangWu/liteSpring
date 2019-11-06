package com.wuyk.litespring.beans.factory;

import com.wuyk.litespring.beans.BeanDefinition;

/**
 * Created by WUYK on 2019-08-22.
 */
public interface BeanFactory {

    BeanDefinition getBeanDefintion(String beanID);

    Object getBean(String beanID);
}
