package com.nix.jingxun.addp.rpc.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author keray
 * @date 2018/12/07 16:48
 */

 @RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:application.xml"}) //加载配置文件
public class ConsumerTest {
     @Autowired
     private ApplicationContext applicationContext;

    @Test
    public void main() throws TimeoutException, InterruptedException {

    }

    @Test
    public void transactionalTest() {
    }

    @Test
    public void asyncTest() throws InterruptedException, IOException {

    }
}
