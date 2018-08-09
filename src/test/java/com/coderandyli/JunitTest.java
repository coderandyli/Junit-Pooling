package com.coderandyli;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by lizhen on 2018/8/8
 */

/**
 * 运行JunitTest结果
 * -------- @BeforeClass --------
 * -------- @Before --------
 * -------- test1 --------
 * -------- testAfter --------
 * -------- @Before --------
 * -------- test2 --------
 * -------- testAfter --------
 * -------- @AfterClass --------
 *
 */
public class JunitTest {

    @BeforeClass
    public static void testBeforeClass(){
        System.out.println("-------- @BeforeClass --------");
    }

    @Before
    public void testBefore(){
        System.out.println("-------- @Before --------");
    }

    @Test
    public void test1(){
        System.out.println("-------- test1 --------");
    }

    @Test
    public void test2(){
        System.out.println("-------- test2 --------");
    }

    @Ignore
    public void ignore(){
        System.out.println("-------- @Ignore --------");
    }

    @After
    public void testAfter(){
        System.out.println("-------- testAfter --------");
    }

    @AfterClass
    public static void testAfterClass(){
        System.out.println("-------- @AfterClass --------");
    }
}
