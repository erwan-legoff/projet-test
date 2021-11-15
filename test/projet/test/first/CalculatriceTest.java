/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.test.first;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author erwan.legoff
 */
public class CalculatriceTest {
    

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
     * Test of sum method, of class Calculatrice.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        double a = 0.0;
        double b = 1.0;
        double expResult = 1.0;
        double result = Calculatrice.sum(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calculatrice.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double a = 1.0;
        double b = 0.0;
        double expResult = 0.0;
        double result = Calculatrice.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculatrice.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double a = 0.0;
        double b = 1.0;
        double expResult = 0.0;
        double result = Calculatrice.divide(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class Calculatrice.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        double a = 1.0;
        double b = 1.0;
        double expResult = 0.0;
        double result = Calculatrice.substract(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
