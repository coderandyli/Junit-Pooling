package com.coderandyli;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by lizhen on 2018/8/8
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void testBeforeClass(){
        calculator = new Calculator();
    }

    @Test
    public void add() {
        int result = calculator.add(11, 22);
        if (result == 33){
            System.out.println("算法正确");
        }
    }

    @Test
    public void subtraction() {
        int result = calculator.subtraction(10, 5);
        if (result == 5){
            System.out.println("算法正确");
        }
    }
}
