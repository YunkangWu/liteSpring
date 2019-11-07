package com.litespring.beans.factory.support;

import com.litespring.beans.BeanDefinition;

/**
 * Created by WUYK on 2019-11-07.
 */
public interface BeanDefinitionRegistry {

    BeanDefinition getBeanDefinition(String beanID);

    void registerBeanDefinition(String beanID, BeanDefinition bd);
}
