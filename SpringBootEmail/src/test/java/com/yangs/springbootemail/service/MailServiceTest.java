package com.yangs.springbootemail.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

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

    @Autowired
    private TemplateEngine templateEngine;

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

    @Test
    public void sendInlineResourseMail() {
        String imgId = "picture001";
        String content = "<html><body>这是有图片的邮件：<img src=\\'cid:\" + rscId + \"\\' ></body></html>";
        String imgPath = "/Users/mac/Pictures/meixi.jpg";
        mailService.sendInlineResourceMail("Mrli_yang@163.com", "主题：这是有图片的邮件", content, imgPath, imgId);
    }

    @Test
    public void sendTemplateMail() {
        //创建邮件正文
        Context context = new Context();
        context.setVariable("id", "001");
        String emailContent = templateEngine.process("emailTemplate", context);
        mailService.sendHtmlMail("Mrli_yang@163.com", "主题：这是模板邮件", emailContent);
    }
}
