package com.jarvis.service.impl;

import com.jarvis.mapper.TbItemMapper;
import com.jarvis.pojo.TbItem;
import com.jarvis.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhengtao on 2018/1/23.
 */
@Service
public class ItemServiceImpl implements ItemService{

    //打印日志
    private static final Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(Long itemId) {

        TbItem item = itemMapper.selectByPrimaryKey(itemId);

        return item;
    }
}
