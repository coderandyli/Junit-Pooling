package com.coderandyli.service.impl;

import com.coderandyli.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by lizhen on 2018/8/15
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName() {
        return "userName = andy （主人，早点睡吧，明天还要上班！）";
    }
}
