package com.jarvis.test;

import com.jarvis.pojo.TbItem;
import com.jarvis.service.TestService;
import org.junit.Test;

import com.jarvis.testUtil.CommonApi;

/**
 * Created by zhengtao on 2018/1/27.
 */
public class ItemTest extends CommonApi{

    @Test
    public void getItemById(){
        long itemId=738388;
        TbItem tbitem = itemService.getItemById(itemId);
        if ( tbitem != null) {
            assert true : "成功";
        }
    }

    //多线程测试
    @Test
    public void test(){
        System.out.println("##############"+Thread.currentThread().getName());
    }


}
