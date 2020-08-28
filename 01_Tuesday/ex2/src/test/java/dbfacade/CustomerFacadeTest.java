/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbfacade;

import edu.emory.mathcs.backport.java.util.Arrays;
import entity.Customer;
import static entity.Customer_.firstName;
import static entity.Customer_.lastName;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import junit.framework.TestCase;

/**
 *
 * @author David
 */
public class CustomerFacadeTest extends TestCase {

    public CustomerFacadeTest(String testName) {
        super(testName);
    }

    /**
     * Test of getCustomerFacade method, of class CustomerFacade.
     */
    public void testGetCustomerFacade() {
        System.out.println("getCustomerFacade");
        EntityManagerFactory _emf = null;
        CustomerFacade expResult = null;
        CustomerFacade result = CustomerFacade.getCustomerFacade(_emf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomer method, of class CustomerFacade.
     */
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String fName = "";
        String lName = "";
        CustomerFacade instance = null;
        Customer expResult = null;
        Customer result = instance.addCustomer(fName, lName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCustomer method, of class CustomerFacade.
     */
    public void testFindCustomer() {
        System.out.println("findCustomer");
        String lName = "";
        CustomerFacade instance = new CustomerFacade();
        Customer expResult = null;
        Customer result = instance.findCustomer(lName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCustomerById method, of class CustomerFacade.
     */
    public void testFindCustomerById() {
        System.out.println("findCustomerById");
        int id = 0;
        CustomerFacade instance = null;
        Customer expResult = null;
        Customer result = instance.findCustomerById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCustomers method, of class CustomerFacade.
     */
    public void testGetAllCustomers() {
        Customer c1 = new Customer("Anders", "Hansen");
        System.out.println("getAllCustomers");
        CustomerFacade instance = null;
        List<Customer> expResult = c1.getFirstName();
        List<Customer> result = instance.getAllCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CustomerFacade.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CustomerFacade.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
