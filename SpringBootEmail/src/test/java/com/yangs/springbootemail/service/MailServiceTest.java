package com.yangs.springbootemail.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Descriptions
 * @Version 1.0.0
 * @Author Target Lee
 * @Date 2018/7/1 下午2:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MailServiceTest {

    @Autowired
    private IMailService mailService;

    @Test
    public void testSimpleMail() throws Exception {
        mailService.sendSimpleMail("Mrli_yang@163.com", "Test simple mail", "Hello, this is simple mail.");
    }

}
