package com.wuyk.litespring.test.v1;

import com.wuyk.litespring.beans.BeanDefinition;
import com.wuyk.litespring.beans.factory.BeanFactory;
import com.wuyk.litespring.beans.factory.support.DefaultBeanFactory;
import com.wuyk.litespring.service.v1.PetStoreService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by WUYK on 2019-08-22.
 */
public class BeanFactoryTest {

    @Test
    public void testGetBean() {
        //BeanFactory为接口，new一个实例出来
        BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");

        //获取xml中petStore的bean
        BeanDefinition bd = factory.getBeanDefintion("petStore");

        //判断
        assertEquals("com.wuyk.litespring.service.v1.PetStoreService", bd.getBeanClassName());

        PetStoreService petStoreService = (PetStoreService) factory.getBean("petStore");

        assertNotNull(petStoreService);
    }
}
