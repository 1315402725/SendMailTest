package com.yubei.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by 600194 on 2018/9/10.
 */
public class MailInitConfig {
    private static final String PROPERTIES_DEFAULT = "application.yml";
    public static String host;
    public static Integer port;
    public static String userName;
    public static String passWord;
    public static String emailForm;
    public static String timeout;
    public static String personal;
    public static Properties properties;
    static{
        init();
    }

    /**
     * 初始化
     */
    private static void init() {
        properties = new Properties();
        try{
            InputStream inputStream = MailInitConfig.class.getClassLoader().getResourceAsStream(PROPERTIES_DEFAULT);
            InputStreamReader inReader=new InputStreamReader(inputStream,"UTF-8");
            properties.load(inReader);
            inputStream.close();
            host = properties.getProperty("mailHost");
            port = Integer.parseInt(properties.getProperty("mailPort"));
            userName = properties.getProperty("mailUser");
            passWord = properties.getProperty("mailPwd");
            emailForm = properties.getProperty("mailFrom");
            timeout = properties.getProperty("mailTimeout");
            personal = properties.getProperty("mailUserName");
        } catch(IOException e){

            e.printStackTrace();
        }
    }

}
