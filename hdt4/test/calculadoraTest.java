/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo Arriaza;
 */
public class calculadoraTest {
    
    public calculadoraTest() {
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
     * Test of getInstance method, of class calculadora.
     */
    /*
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        calculadora expResult = null;
        calculadora result = calculadora.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of eval method, of class calculadora.
     */
    @Test 
    public void testEvalArrayList() {
        System.out.println("arraylist");
        String s = "27+4*3+";
        Stack<Double> stack = new StackArrayList();
        calculadora instance = calculadora.getInstance();
        double expResult = 39.0;
        double result = instance.eval(s, stack);
        assertEquals(expResult, result, 0.0);
    }
    @Test 
    public void testEvalVector() {
        System.out.println("vector");
        String s = "27+4*3+";
        Stack<Double> stack = new StackVector();
        calculadora instance = calculadora.getInstance();
        double expResult = 39.0;
        double result = instance.eval(s, stack);
        assertEquals(expResult, result, 0.0);
    }
    @Test 
    public void testEvalSingle() {
        System.out.println("single");
        String s = "39/5*2+";
        Stack<Double> stack = new SinglyLinkedList();
        calculadora instance = calculadora.getInstance();
        double expResult = 17.0;
        double result = instance.eval(s, stack);
        assertEquals(expResult, result, 0.0);
    }
    @Test 
    public void testEvalDouble() {
        System.out.println("double");
        String s = "72-4*3+";
        Stack<Double> stack = new DoublyLinkedList();
        calculadora instance = calculadora.getInstance();
        double expResult = 23.0;
        double result = instance.eval(s, stack);
        assertEquals(expResult, result, 0.0);
    }
    @Test 
    public void testEvalCircular() {
        System.out.println("circular");
        String s = "27+4*3+";
        Stack<Double> stack = new CircularList();
        calculadora instance = calculadora.getInstance();
        double expResult = 39.0;
        double result = instance.eval(s, stack);
        assertEquals(expResult, result, 0.0);
    }
}
