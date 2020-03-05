package com.wbf.email.service;

/**
 * @Author: 魏斌锋
 * @Date: 2020/3/4 15:49
 * @Description:
 */
public interface MailService {
    /**
     * 用来模拟发送简单短信
     * @param to 收件人(可群发)
     * @param subject 主题
     * @param text 内容
     */
    void sendSimpleMail(String[] to, String subject, String text);


}
