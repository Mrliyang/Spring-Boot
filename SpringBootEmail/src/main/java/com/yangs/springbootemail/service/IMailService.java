package com.yangs.springbootemail.service;

/**
 * @Descriptions
 * @Version 1.0.0
 * @Author Target Lee
 * @Date 2018/7/1 下午2:16
 */
public interface IMailService {

    void sendSimpleMail(String to, String subject, String content);

    void sendHtmlMail(String to, String subject, String content);

    void sendAttachmentsMail(String to, String subject, String content, String filePath);
//
//    public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
