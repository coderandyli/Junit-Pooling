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
 * 执行JunitTest结果
 *
 * -------- @BeforeClass --------
 * -------- @Before --------
 * -------- testMethod1 --------
 * -------- @After --------
 * -------- @Before --------
 * -------- testMethod2 --------
 * -------- @After --------
 * -------- @AfterClass --------
 *
 */
public class JunitTest {

    @BeforeClass
    public static void testBeforeClass(){
        System.out.println("-------- @BeforeClass --------");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("-------- @Before --------");
    }

    @Test
    public void testMethod1(){
        System.out.println("-------- testMethod1 --------");
    }

    @Test
    public void testMethod2(){
        System.out.println("-------- testMethod2 --------");
    }

    @Ignore
    public void testIgnore(){
        System.out.println("-------- @Ignore --------");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("-------- @After --------");
    }

    @AfterClass
    public static void testAfterClass(){
        System.out.println("-------- @AfterClass --------");
    }
}
