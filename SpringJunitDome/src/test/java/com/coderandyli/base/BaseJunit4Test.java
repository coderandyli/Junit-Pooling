package com.coderandyli.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lizhen on 2018/8/14
 */

//SpringRunner 与 SpringJUnit4ClassRunner 有区别吗？
//  SpringRunner is an alias for the SpringJUnit4ClassRunner.（// link：https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/test/context/junit4/SpringRunner.html）
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml") // 加载配置文件
//@RunWith(SpringJUnit4ClassRunner.class) // 使用Junit4
//------------如果加入以下代码，所有继承该类的测试类都会遵循该配置，也可以不加，在测试类的方法上
//这个非常关键，如果不加入这个注解配置，事务控制就会完全失效！
//@Transactional
//这里的事务关联到配置文件中的事务控制器（transactionManager = "transactionManager"），同时//指定自动回滚（defaultRollback = true）。这样做操作的数据才不会污染数据库！
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
//------------
public class BaseJunit4Test {
    
}
