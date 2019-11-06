package com.litespring.test.v1;

import com.litespring.beans.BeanDefinition;
import com.litespring.beans.factory.BeanCreationException;
import com.litespring.beans.factory.BeanDefinitionStoreException;
import com.litespring.beans.factory.BeanFactory;
import com.litespring.beans.factory.support.DefaultBeanFactory;
import com.litespring.service.v1.PetStoreService;
import org.junit.Assert;
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
        assertEquals("com.litespring.service.v1.PetStoreService", bd.getBeanClassName());

        PetStoreService petStoreService = (PetStoreService) factory.getBean("petStore");

        assertNotNull(petStoreService);
    }

    @Test
    public void testInvalidBean() {
        BeanFactory factory = new DefaultBeanFactory("petstore-v1.xml");
        try {
            factory.getBean("invalidBean");
        } catch (BeanCreationException e) {
            //测试成功应该在这里抛出异常
            return;
        }
        Assert.fail("expect BeanCreationException");
    }

    @Test
    public void testInvalidXml() {
        try {
            new DefaultBeanFactory("xxx.xml");
        } catch (BeanDefinitionStoreException e) {
            //测试成功应该在这里抛出异常
            return;
        }
        Assert.fail("expect BeanDefinitionStoreException");
    }
}
