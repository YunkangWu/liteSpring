package com.wuyk.litespring.beans.factory;

import com.wuyk.litespring.beans.BeanDefinition;

/**
 * Created by WUYK on 2019-08-22.
 */
public interface BeanFactory {

    /**
     * 获取bean的定义
     *
     * @param beanID
     * @return
     */
    BeanDefinition getBeanDefintion(String beanID);

    /**
     * 获取bean的实例
     *
     * @param beanID
     * @return
     */
    Object getBean(String beanID);
}
