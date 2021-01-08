package com.offcn.controller;

import com.offcn.pojo.TbGoods;
import com.offcn.pojo.TbItem;
import com.offcn.properties.CompanyProperties;
import com.offcn.properties.CourseProperties;
import com.offcn.service.TbGoodsService;
import org.apache.solr.client.solrj.SolrClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

////开启配置参数类
//@EnableConfigurationProperties({CompanyProperties.class}) 放在这里，只能是当前controller可以使用CompanyProperties中的参数
@RestController
//@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    TbGoodsService goodsService;
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

//    @RequestMapping(value = "/goods" , method = RequestMethod.GET)
    @GetMapping("/goods")
    public List<TbGoods> goodsList(){

        redisTemplate.boundValueOps("count1").set(100);
        stringRedisTemplate.boundListOps("count2").leftPush("abc");
        stringRedisTemplate.boundListOps("count2").leftPushAll("bcd","qqq","6666");

        return goodsService.goodsList();
    }

    @Value("${spring.redis.port}")
    String redisPort;

    @Value("${java0824.stuname1}")
    String stu1;

    @Autowired
    CompanyProperties companyProperties;

    @Autowired
    CourseProperties courseProperties;

    @Autowired
    SolrTemplate solrTemplate;

    @Autowired
    SolrClient solrClient ;

    @GetMapping("/demo2")
    public String demo2(){

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

//        TbItem item = new TbItem();

//        solrClient.addBean()
        Optional<TbItem> collection1 = solrTemplate.getById("collection1", 1369284, TbItem.class);

        return redisPort + stu1 + " ," + companyProperties +","+ courseProperties + ",," + collection1.get();
    }

}
