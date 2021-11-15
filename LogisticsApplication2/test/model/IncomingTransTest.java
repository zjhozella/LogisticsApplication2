// /*
//  * To change this license header, choose License Headers in Project Properties.
//  * To change this template file, choose Tools | Templates
//  * and open the template in the editor.
//  */
// package model;

// import java.sql.Timestamp;
// import java.util.Date;
// import org.junit.After;
// import org.junit.AfterClass;
// import org.junit.Before;
// import org.junit.BeforeClass;
// import org.junit.Test;
// import static org.junit.Assert.*;

// /**
//  *
//  * @author jwp5812
//  */
// public class IncomingTransTest {
    
//     //Create variables to use in TimeStamps
//     private Date date = new Date();
//     private long time = date.getTime();
//     private Timestamp tsOut = new Timestamp(time);
//     private Timestamp tsIn = new Timestamp(time);
    
//     public IncomingTransTest() {
//     }
    
//     @BeforeClass
//     public static void setUpClass() {
//     }
    
//     @AfterClass
//     public static void tearDownClass() {
//     }
    
//     @Before
//     public void setUp() {
//     }
    
//     @After
//     public void tearDown() {
//     }

//     /**
//      * Test of getEmployeeID method, of class IncomingTrans.
//      */
//     @Test
//     public void testGetEmployeeID() {
//         System.out.println("getEmployeeID");
//         IncomingTrans instance = new IncomingTrans(1024, false, tsIn);
//         int expResult = 1024;
//         int result = instance.getEmployeeID();
//         assertEquals(expResult, result);
//         // TODO review the generated test code and remove the default call to fail.
//        // fail("The test case is a prototype.");
//     }

//     /**
//      * Test of setEmployeeID method, of class IncomingTrans.
//      */
//     @Test
//     public void testSetEmployeeID() {
//         System.out.println("setEmployeeID");
//         int employeeID = 11;
//         IncomingTrans instance = new IncomingTrans(11, false, tsIn);
//         instance.setEmployeeID(employeeID);
//         // TODO review the generated test code and remove the default call to fail.
//         //fail("The test case is a prototype.");
//     }

//     /**
//      * Test of isInsectDetected method, of class IncomingTrans.
//      */
//     @Test
//     public void testIsInsectDetected() {
//         System.out.println("isInsectDetected");
//         IncomingTrans instance = new IncomingTrans(11, false, tsIn);
//         boolean expResult = false;
//         boolean result = instance.isInsectDetected();
//         assertEquals(expResult, result);
//         // TODO review the generated test code and remove the default call to fail.
//         //fail("The test case is a prototype.");
//     }

//     /**
//      * Test of setInsectDetected method, of class IncomingTrans.
//      */
//     @Test
//     public void testSetInsectDetected() {
//         System.out.println("setInsectDetected");
//         boolean insectDetected = true;
//         IncomingTrans instance = new IncomingTrans(11, true, tsIn);
//         instance.setInsectDetected(insectDetected);
//         // TODO review the generated test code and remove the default call to fail.
//         //fail("The test case is a prototype.");
//     }

//     /**
//      * Test of getDate method, of class IncomingTrans.
//      * These test for the TimeStamp really are not testing anything. Because of the time needed
//      * to compile and run the code, they will be off by a millisecond so it is impossible to test
//      * an expected result and actual result. 
//      */
//     @Test
//     //This test ALWAYS fails because of the Millisecond it takes to run the code
//     //So the expected result will always be a millisecond OFF from the actual result
//     public void testGetDate() {
//         System.out.println("getDate");
//         IncomingTrans instance = new IncomingTrans(11, true, tsIn);
//         Date expResult = date;
//         Date result = instance.getDate();
//         assertEquals(expResult, result);
//         // TODO review the generated test code and remove the default call to fail.
//         //fail("The test case is a prototype.");
//     }

//     /**
//      * Test of setDate method, of class IncomingTrans.
//      */
//     @Test
//     public void testSetDate() {
//         System.out.println("setDate");
//         Date date = tsIn;
//         IncomingTrans instance = new IncomingTrans(11, true, tsIn);
//         instance.setDate(date);
//         // TODO review the generated test code and remove the default call to fail.
//         //fail("The test case is a prototype.");
//     }

//     /**
//      * Test of getTime method, of class IncomingTrans.
//      */
//     @Test
//     public void testGetTime() {
//         System.out.println("getTime");
//         IncomingTrans instance = null;
//         long expResult = 0L;
//         long result = instance.getTime();
//         assertEquals(expResult, result);
//         // TODO review the generated test code and remove the default call to fail.
//         fail("The test case is a prototype.");
//     }

//     /**
//      * Test of setTime method, of class IncomingTrans.
//      */
//     @Test
//     public void testSetTime() {
//         System.out.println("setTime");
//         long time = 0L;
//         IncomingTrans instance = null;
//         instance.setTime(time);
//         // TODO review the generated test code and remove the default call to fail.
//         fail("The test case is a prototype.");
//     }

//     /**
//      * Test of getTsIn method, of class IncomingTrans.
//      */
//     @Test
//     public void testGetTsIn() {
//         System.out.println("getTsIn");
//         IncomingTrans instance = null;
//         Timestamp expResult = null;
//         Timestamp result = instance.getTsIn();
//         assertEquals(expResult, result);
//         // TODO review the generated test code and remove the default call to fail.
//         fail("The test case is a prototype.");
//     }

//     /**
//      * Test of setTsIn method, of class IncomingTrans.
//      */
//     @Test
//     public void testSetTsIn() {
//         System.out.println("setTsIn");
//         Timestamp tsIn = null;
//         IncomingTrans instance = null;
//         instance.setTsIn(tsIn);
//         // TODO review the generated test code and remove the default call to fail.
//         fail("The test case is a prototype.");
//     }
    
// }
