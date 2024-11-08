package com.nt.main.GITPROJECT;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    private App a;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
        a = new App(); // Instantiate App here
    }

    @Test
    public void TestSumWithPositive() {
        int val = 3;
        int val1 = 5;
        int expected = val + val1;  // Expected sum
        int actual = a.sum(val, val1); // Using same values for consistency
        assertEquals(expected, actual);
    }
    
    @Test
    public void TestSumWithMixed() {
        int val = 5;
        int val1 = -5;
        int expected = 0;  // Expected sum
        int actual = a.sum(val, val1); // Using same values for consistency
        assertEquals(expected, actual);
    }

    /**
     * @return the suite of tests being tested
     */
    public static TestSuite suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
}
