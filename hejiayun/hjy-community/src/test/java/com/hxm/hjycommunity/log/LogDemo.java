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
    public void testLog() {
        logger.info("Hello LogBack!");
    }

    @Test
    public void testLog2() {
        logger.trace("trace。。。。");
        logger.debug("debugger、、、、");
        logger.info("Hello LogBack、、、、、");
        logger.warn("warning!!!");
        logger.error("error!!!!");
    }

    @Test
    public void testLog3() {
        String name = "kkkkkk";
        logger.info("hello:" + name);
        logger.info("hello {}", name);

        String userId = "10019";
        String orderId = "sdvfvfbdfbdbfbdbgngf";
        logger.info("记录当前订单的userId:[{}]和orderId:[{}]", userId, orderId);

        try {
            int i = 1 / 0;
        } catch (Exception e) {
            logger.error("/ by zero", e
            );
        }

        if (logger.isDebugEnabled()) {
            logger.debug("hello" + name);

        }
    }


}