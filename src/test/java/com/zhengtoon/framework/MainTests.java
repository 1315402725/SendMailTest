package com.zhengtoon.framework;


import com.alibaba.fastjson.JSON;
import com.yubei.Application;


import com.yubei.util.BootSendEmail;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@EnableConfigurationProperties
public class MainTests {
	@Test
	public void testMailForBoot() throws UnsupportedEncodingException, MessagingException {
		BootSendEmail.sendMail("3044374769@qq.com","测试","12345678");
	}

	@Test
	public void testMailForNormal() throws UnsupportedEncodingException, MessagingException {
		BootSendEmail.sendMail("3044374769@qq.com","测试","12345678");
	}
}