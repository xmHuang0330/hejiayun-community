package com.hxm.hjycommunity.log;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: xm_Wong
 * @Description: TODO
 * @DateTime: 2024/6/9 18:17
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogDemo {

    private final Logger logger = LoggerFactory.getLogger(LogDemo.class);


    @Test
    public void testLog(){
        Logger logger = LoggerFactory.getLogger(LogDemo.class);
        logger.info("Hello LogBack!");
    }
}