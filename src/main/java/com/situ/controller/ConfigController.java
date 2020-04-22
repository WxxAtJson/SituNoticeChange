package com.situ.controller;

import com.situ.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Wang XinXin  <wangxinxin@situdata.com>  2020/4/22 11:43
 **/
@Controller
public class ConfigController {

    @Autowired
    private ConfigService configService;

    @ResponseBody
    @RequestMapping("/email")
    public String getEmail() {
        return configService.getEmail();
    }
}
