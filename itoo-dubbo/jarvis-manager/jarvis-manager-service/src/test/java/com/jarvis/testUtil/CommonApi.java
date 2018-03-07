package com.jarvis.testUtil;

import com.jarvis.service.ItemService;
import org.junit.Before;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CommonApi {

    public BeanFactory factory;
    public ItemService itemService;

    @Before
    public void setUp() {
        factory = new ClassPathXmlApplicationContext("classpath:spring/applicationContext*.xml");
        itemService = (ItemService) factory.getBean("itemServiceImpl");
    }
}
