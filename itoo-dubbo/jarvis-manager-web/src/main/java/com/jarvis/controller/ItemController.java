package com.jarvis.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jarvis.pojo.TbItem;
import com.jarvis.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PipedReader;


/**
 * Created by zhengtao on 2018/1/24.1111
 */

@Controller
@RequestMapping("/web-item")
public class ItemController {

    //打印日志
    private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    private ItemService itemService;

    @RequestMapping(value={"/item/{itemId}"},method = RequestMethod.GET)
    @ResponseBody
    private TbItem getItemById(@PathVariable("itemId") Long itemId){

        TbItem item = itemService.getItemById(itemId);
        return item;
    }

}
