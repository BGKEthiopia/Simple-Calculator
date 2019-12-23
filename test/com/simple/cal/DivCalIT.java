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
public class DivCalIT {
    
    public DivCalIT() {
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
     * Test of addNumbers method, of class DivCal.
     */
    @Test
    public void testAddNumbers_int_int() {
        System.out.println("addNumbers");
        int x = 24;
        int y = 3;
        DivCal instance = new DivCal();
        int expResult = 8;
        int result = instance.addNumbers(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of addNumbers method, of class DivCal.
     */
    @Test
    public void testAddNumbers_float_float() {
        System.out.println("addNumbers");
        float x = 25.0F;
        float y = 4.0F;
        DivCal instance = new DivCal();
        float expResult = 6.25F;
        float result = instance.addNumbers(x, y);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of addNumbers method, of class DivCal.
     */
    @Test
    public void testAddNumbers_double_double() {
        System.out.println("addNumbers");
        double x = 38.5;
        double y = 7.0;
        DivCal instance = new DivCal();
        double expResult = 5.5;
        double result = instance.addNumbers(x, y);
        assertEquals(expResult, result, 0.0);
    }
    
}
