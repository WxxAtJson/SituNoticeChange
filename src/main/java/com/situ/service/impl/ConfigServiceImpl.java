package com.situ.service.impl;

import com.situ.pojo.ConfigContent;
import com.situ.service.ConfigService;
import org.springframework.stereotype.Service;

/**
 * @Author Wang XinXin  <wangxinxin@situdata.com>  2020/4/22 11:41
 **/
@Service
public class ConfigServiceImpl implements ConfigService {


    @Override
    public String getEmail() {

        return ConfigContent.email;
    }
}
