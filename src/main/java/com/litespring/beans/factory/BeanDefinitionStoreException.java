package com.litespring.beans.factory;

import com.litespring.beans.BeansException;

/**
 * Created by WUYK on 2019-11-07.
 */
public class BeanDefinitionStoreException extends BeansException {

    public BeanDefinitionStoreException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
