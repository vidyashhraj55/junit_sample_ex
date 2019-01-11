package com.junit.junit_maven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTestSuccessful {
    private static ICalculator calculator;
    @BeforeClass
    public static void initCalculator() {
        calculator = new Calculator();
    }
 
    @Before
    public void beforeEachTest() {
        System.out.println("This is executed before each Test");
    }
    @After
    public void afterEachTest() {
        System.out.println("This is exceuted after each Test");
    }
 
    @Test
    public void testSum() {
        int result = calculator.sum(3, 4);
        System.out.println("calculate"+result);
        assertEquals(7, result);
    }
    @Test
    public void testDivison() {
        try {
            int result = calculator.divison(10, 2);
            System.out.println("calculate"+result);
            assertEquals(5, result);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
 
    @Test(expected = Exception.class)
    public void testDivisionException() throws Exception {
        calculator.divison(10, 0);
    }
 
    @Test
    public void testEqual() {
        boolean result = calculator.equalIntegers(20, 20);
        System.out.println("calculate"+result);
    }
 

    @Test
    public void testSubstraction() {
        int result = 10 - 3;
        System.out.println("calculate"+result);
        assertTrue(result == 7);
    }
}
