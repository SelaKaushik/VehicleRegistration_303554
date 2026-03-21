package vit.devops.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import vit.devops.vehicleregistrationsystem.*;

public class VehicleSystemTest {

    //1. Check valid license by age
    @Test
    void testValidLicenseByAge() {
        // Arrange
        Examination exam = new Examination(50, 20);

        // Act
        boolean result = exam.isEligible();

        // Assert
        assertTrue(result, "License should be valid for age >= 18");
    }

    //2. Check invalid license by marks
    @Test
    void testInvalidLicenseByMarks() {
        // Arrange
        Examination exam = new Examination(30, 25);

        // Act
        boolean result = exam.isEligible();

        // Assert
        assertFalse(result, "License should fail when marks < 40");
    }

    //3. Check Login (HashMap)
    @Test
    void testLoginSuccess() {
        // Arrange
        SignupLogin user =
                new SignupLogin("Kaushik", "test@mail.com", "1234");
        user.signUp();

        // Act
        boolean result =
                SignupLogin.login("test@mail.com", "1234");

        // Assert
        assertTrue(result, "Login should succeed with correct credentials");
    }

    //3b. Invalid Login (extra strong test)
    @Test
    void testLoginFailure() {
        // Act
        boolean result =
                SignupLogin.login("wrong@mail.com", "1234");

        // Assert
        assertFalse(result, "Login should fail for invalid user");
    }

    //4. Check Vehicle Details
    @Test
    void testGetVehicleDetails() {
        // Arrange
        VehicleRegistration vr =
                new VehicleRegistration("Car TN01AB1234", "Kaushik");
        vr.register();

        // Act
        String details =
                VehicleRegistration.getDetails("Kaushik");

        // Assert
        assertEquals("Car TN01AB1234", details);
    }

    //4b. Vehicle not found
    @Test
    void testVehicleNotFound() {
        // Act
        String details =
                VehicleRegistration.getDetails("Unknown");

        // Assert
        assertNull(details, "Should return null if vehicle not found");
    }

    //5. Check issuePermit()
    @Test
    void testIssuePermit() {
        // Arrange
        VehiclePermit permit = new VehiclePermit("Kaushik");

        // Act
        String result = permit.issuePermit();

        // Assert
        assertEquals("Permit Issued to Kaushik", result);
    }

    //Bonus: Full License Flow Test
    @Test
    void testProvideLicense() {
        // Arrange
        VehicleLicensing vl = new VehicleLicensing();

        // Act
        boolean result = vl.provideLicense("Kaushik", 50, 22);

        // Assert
        assertTrue(result, "License should be issued for valid input");
    }
}
