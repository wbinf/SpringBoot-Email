package com.wbf.email.service.impl;

import com.wbf.email.service.MailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 魏斌锋
 * @Date: 2020/3/4 15:51
 * @Description:
 */
@Service
public class MailServiceImpl implements MailService {
    @Resource
    private JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String from;

    @Async("asyncServiceExecutor")
    @Override
    public void sendSimpleMail(String[] to, String subject, String text) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(text);
        javaMailSender.send(mailMessage);
    }


}