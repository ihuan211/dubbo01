package com.aaa;

import com.aaa.bean.Person;
import com.aaa.service.RedisService;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
public class AppTest 
{
    @Autowired
    RedisService redisService;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        List<Person> l = JSON.parseArray(redisService.getCacheObject("test3"),Person.class);
        System.out.println(redisService.getCacheObject("test3"));
        for (Person person : l) {
            System.out.println(person.getName());
        }
    }
}
