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

    @Test
    public void testHtmlMail() throws Exception {
        String content = "<html>\n" +
                "<body>\n" +
                "   <h3>hello world ! 这是一封html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("Mrli_yang@163.com", "Test simple mail", content);
    }

    @Test
    public void sendAttachmentsMail() {
        String filePath = "/Users/mac/workspace/java/SpringBootStudy/SpringBootEmail/log/springbootbegin-info.log";
        mailService.sendAttachmentsMail("Mrli_yang@163.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }
}
