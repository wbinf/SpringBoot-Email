package com.wbf.email;

import com.wbf.email.service.MailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailApplicationTests {
@Autowired
private MailService mailService;
    @Test
    void contextLoads() {
        String[] to={"wangkebin1997@gmail.com","2696709667@qq.com","16473905@qq.com"};
//    mailService.sendSimpleMail(to,"SpringBoot-email邮件测试","QQ邮箱是腾讯公司2002年推出，向用户提供安全、稳定、快速、便捷电子邮件服务的邮箱产品，已为超过1亿的邮箱用户提供免费和增值邮箱服务。QQ邮件服务以高速电信骨干网为强大后盾，独有独立的境外邮件出口链路，免受境内外网络瓶颈影响，全球传信。采用高容错性的内部服务器架构，确保任何故障都不影响用户的使用，随时随地稳定登录邮箱，收发邮件通畅无阻。\n" +
//            "2018年11月30日起，QQ邮箱暂时下线漂流瓶服务，专项清理色情内容");
        mailService.sendSimpleMail(to,"111111王克斌邮件测试","QQ邮箱是腾讯公司2002年推出，向用户提供安全、稳定、快速、便捷电子邮件服务的邮箱产品，已为超过1亿的邮箱用户提供免费和增值邮箱服务。QQ邮件服务以高速电信骨干网为强大后盾，独有独立的境外邮件出口链路，免受境内外网络瓶颈影响，全球传信。采用高容错性的内部服务器架构，确保任何故障都不影响用户的使用，随时随地稳定登录邮箱，收发邮件通畅无阻。\n" +
                "2018年11月30日起，QQ邮箱暂时下线漂流瓶服务，专项清理色情内容");

}

}
