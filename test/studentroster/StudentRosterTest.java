/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentroster;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renee
 */
public class StudentRosterTest {
    
    public StudentRosterTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of StudentRoster method, of class StudentRoster.
     */
    @Test
    public void testStudentRoster() {
        System.out.println("StudentRoster");
        String[] args = null;
        StudentRoster.StudentRoster(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStudent method, of class StudentRoster.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        String firstname = "";
        String lastname = "";
        int studentid = 0;
        int busnumber = 0;
        StudentRoster instance = new StudentRoster();
        Integer expResult = null;
        Integer result = instance.addStudent(firstname, lastname, studentid, busnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listStudent method, of class StudentRoster.
     */
    @Test
    public void testListStudent() {
        System.out.println("listStudent");
        StudentRoster instance = new StudentRoster();
        instance.listStudent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStudent method, of class StudentRoster.
     */
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");
        Integer StudentID = null;
        int salary = 0;
        StudentRoster instance = new StudentRoster();
        instance.updateStudent(StudentID, salary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStudent method, of class StudentRoster.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        Integer StudentID = null;
        StudentRoster instance = new StudentRoster();
        instance.deleteStudent(StudentID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
