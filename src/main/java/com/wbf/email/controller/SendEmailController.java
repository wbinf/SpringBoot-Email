package com.wbf.email.controller;

import com.wbf.email.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 魏斌锋
 * @Date: 2020/3/4 17:09
 * @Description:
 */

@RequestMapping("send")
@RestController
public class SendEmailController {
    @Autowired
    private MailService mailService;
    @GetMapping("/sendEmail")
    public String  sendMessage(@RequestParam String[] to, @RequestParam String subject, @RequestParam String text){
        mailService.sendSimpleMail(to, subject, text);
        return "success";
    }
}
