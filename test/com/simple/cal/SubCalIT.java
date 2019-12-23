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
public class SubCalIT {
    
    public SubCalIT() {
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
     * Test of addNumbers method, of class SubCal.
     */
    @Test
    public void testAddNumbers_int_int() {
        System.out.println("addNumbers");
        int x = 15;
        int y = 3;
        SubCal instance = new SubCal();
        int expResult = 12;
        int result = instance.addNumbers(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of addNumbers method, of class SubCal.
     */
    @Test
    public void testAddNumbers_float_float() {
        System.out.println("addNumbers");
        float x = 21.0F;
        float y = 14.0F;
        SubCal instance = new SubCal();
        float expResult = 7.0F;
        float result = instance.addNumbers(x, y);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of addNumbers method, of class SubCal.
     */
    @Test
    public void testAddNumbers_double_double() {
        System.out.println("addNumbers");
        double x = 6.0;
        double y = 10.0;
        SubCal instance = new SubCal();
        double expResult = -4.0;
        double result = instance.addNumbers(x, y);
        assertEquals(expResult, result, 0.0);
    }
    
}
