package vit.devops.tests;

import org.junit.Test;
import static org.junit.Assert.*;

// Import your main package classes
import vit.devops.vehicleregistrationsystem.Examination;

public class VehicleSystemTest 
{

    // Test Case 1: Valid License (should pass)
    @Test
    public void testValidLicense() 
    {
        Examination e = new Examination(50, 20);
        assertTrue(e.isEligible());
    }

    // Test Case 2: Underage (should fail)
    @Test
    public void testUnderAge() 
    {
        Examination e = new Examination(50, 17);
        assertFalse(e.isEligible());
    }

    // Test Case 3: Low Marks (should fail)
    @Test
    public void testLowMarks() 
    {
        Examination e = new Examination(30, 20);
        assertFalse(e.isEligible());
    }

    // Test Case 4: Boundary Case (Age = 18, Marks = 40)
    @Test
    public void testBoundaryCase() 
    {
        Examination e = new Examination(40, 18);
        assertTrue(e.isEligible());
    }

    // Test Case 5: High Values (should pass)
    @Test
    public void testHighValues() 
    {
        Examination e = new Examination(90, 30);
        assertTrue(e.isEligible());
    }
}