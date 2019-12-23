/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simple.cal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hello
 */
public class MulCalIT {
    
    public MulCalIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addNumbers method, of class MulCal.
     */
    @Test
    public void testAddNumbers_int_int() {
        System.out.println("addNumbers");
        int x = 7;
        int y = 7;
        MulCal instance = new MulCal();
        int expResult = 49;
        int result = instance.addNumbers(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of addNumbers method, of class MulCal.
     */
    @Test
    public void testAddNumbers_float_float() {
        System.out.println("addNumbers");
        float x = 5.5F;
        float y = 5.0F;
        MulCal instance = new MulCal();
        float expResult = 27.5F;
        float result = instance.addNumbers(x, y);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of addNumbers method, of class MulCal.
     */
    @Test
    public void testAddNumbers_double_double() {
        System.out.println("addNumbers");
        double x = 8.0;
        double y = 2.7;
        MulCal instance = new MulCal();
        double expResult = 21.6;
        double result = instance.addNumbers(x, y);
        assertEquals(expResult, result, 0.0);
    }
    
}
