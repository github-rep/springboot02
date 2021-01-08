package com.offcn.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.offcn.pojo.TbGoods;
import com.offcn.service.TbGoodsService;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

//@Service
@Service
//@Component
public class TbGoodsServiceImpl implements TbGoodsService {

    @Override
    public List<TbGoods> goodsList() {

        TbGoods goods = new TbGoods();
        goods.setId(101L);
        goods.setName("华为nova5se手机");

        List<TbGoods> tbGoods = Arrays.asList(goods);

        return tbGoods;
    }

}
