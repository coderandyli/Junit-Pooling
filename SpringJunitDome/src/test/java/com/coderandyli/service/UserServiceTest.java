package com.coderandyli.service;

import com.coderandyli.base.BaseJunit4Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lizhen on 2018/8/15
 */
public class UserServiceTest extends BaseJunit4Test {

    @Autowired
    private UserService userService;

    @Test
//    @Transactional  // 标明此方法需要使用事务
//    @Rollback(true) // 事务回滚
    public void testGetUserName(){
        System.out.println(userService.getUserName());
    }
}