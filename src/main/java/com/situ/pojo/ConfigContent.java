package com.situ.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.validation.constraints.Email;

/**
 * @Author Wang XinXin  <wangxinxin@situdata.com>  2020/4/22 11:35
 **/
@Configuration
@PropertySource("classpath:/notice.properties")
public class ConfigContent {

    @Email
    public static String email;


    @Value("${email}")
    public void setEmail(String email) {
        ConfigContent.email = email;
    }
}
