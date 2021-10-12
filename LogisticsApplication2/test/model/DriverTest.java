/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jwp5812
 */
public class DriverTest {
    
    public DriverTest() {
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
     * Test of getDlNumber method, of class Driver.
     */
    @Test
    public void testGetDlNumber() {
        System.out.println("getDlNumber");
        Driver instance = new Driver("JP11578", "Gary", "Clark", "Werner");
        String expResult = "JP11578";
        String result = instance.getDlNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDlNumber method, of class Driver.
     */
    @Test
    public void testSetDlNumber() {
        System.out.println("setDlNumber");
        String dlNumber = "5512";
        Driver instance = new Driver("JP11578", "Gary", "Clark", "Werner");
        instance.setDlNumber(dlNumber);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Driver.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Driver instance = new Driver("JP11578", "Gary", "Clark", "Werner");
        String expResult = "Gary";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Driver.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "Matt";
        Driver instance = new Driver("JP11578", "Gary", "Clark", "Werner");
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Driver.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Driver instance = new Driver("JP11578", "Gary", "Clark", "Werner");
        String expResult = "Clark";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Driver.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "Jackson";
        Driver instance = new Driver("JP11578", "Gary", "Clark", "Werner");
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCompany method, of class Driver.
     */
    @Test
    public void testGetCompany() {
        System.out.println("getCompany");
        Driver instance = new Driver("JP11578", "Gary", "Clark", "Werner");
        String expResult = "Werner";
        String result = instance.getCompany();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCompany method, of class Driver.
     */
    @Test
    public void testSetCompany() {
        System.out.println("setCompany");
        String company = "US Express";
        Driver instance = new Driver("JP11578", "Gary", "Clark", "Werner");
        instance.setCompany(company);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
