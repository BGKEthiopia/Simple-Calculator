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
public class AddCalIT {
    
    public AddCalIT() {
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
     * Test of addNumbers method, of class AddCal.
     */
    @Test
    public void testAddNumbers_int_int() {
        System.out.println("addNumbers integer");
        int x = 6;
        int y = 8;
        AddCal addCal = new AddCal();
        int expResult = 14;
        int result = addCal.addNumbers(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of addNumbers method, of class AddCal.
     */
    @Test
    public void testAddNumbers_double_double() {
        System.out.println("addNumbers double");
        double x = 2.6;
        double y = 3.4;
        AddCal instance = new AddCal();
        double expResult = 6.0;
        double result = instance.addNumbers(x, y);
        assertEquals(expResult, result,0.0);
        
    }

    /**
     * Test of addNumbers method, of class AddCal.
     */
    @Test
    public void testAddNumbers_float_float() {
        System.out.println("addNumbers float");
        float x = 6.0F;
        float y = 2.0F;
        AddCal instance = new AddCal();
        float expResult = 8.0F;
        float result = instance.addNumbers(x, y);
        assertEquals(expResult, result, 0.0);
    }
    
}
