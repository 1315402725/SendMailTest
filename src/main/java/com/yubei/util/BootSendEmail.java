package com.yubei.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by 600194 on 2018/9/10.
 */
@Component
public class BootSendEmail {



    private static JavaMailSender mailSender;
    private static String username;

    @Autowired
    private JavaMailSender mailSender1;

    @Value("${spring.mail.username}")
    private  String username1;

    @PostConstruct
    public void beforeInit() {
        mailSender = mailSender1;
        username=username1;
    }


    public  static void sendMail(String to, String subject, String html) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(username);
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(html);

        mailSender.send(simpleMailMessage);
    }

}
