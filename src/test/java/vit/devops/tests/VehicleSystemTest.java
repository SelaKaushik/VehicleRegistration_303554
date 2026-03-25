package vit.devops.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import vit.devops.vehicleregistrationsystem.*;

public class VehicleSystemTest 
{
   
     @Test
     void testKaushikLicense() 
     {
        Examination exam = new Examination(60, 25);
        assertTrue(exam.isEligible(), "Kaushik should be eligible for license");
     }


     @Test
     void testSaiUnderage() 
     {
        Examination exam = new Examination(60, 16);
        assertFalse(exam.isEligible(), "Sai should not be eligible due to age");
     }
    
     @Test
     void testYashLowMarks() 
     {
        Examination exam = new Examination(30, 23);
        assertFalse(exam.isEligible(), "Yash should fail due to low marks");
     }


     @Test
     void testKaushikLogin() 
     {
       SignupLogin user = new SignupLogin("Kaushik", "kaushik@mail.com", "1234");
       user.signUp();

       boolean result = SignupLogin.login("kaushik@mail.com", "1234");
       assertTrue(result);
     }
    
     @Test
     void testSaiLoginFail() 
     {
       boolean result = SignupLogin.login("sai@mail.com", "wrong");
       assertFalse(result);
     }

     @Test
     void testYashVehicleRegistration() 
     {
       VehicleRegistration vr = new VehicleRegistration("Bike MH12XY5678", "Yash");
       vr.register();

       String result = VehicleRegistration.getDetails("Yash");
       assertEquals("Bike MH12XY5678", result);
     }

     @Test
     void testSaiVehicleNotFound() 
     {
       String result = VehicleRegistration.getDetails("Sai");
       assertNull(result);
     }

     @Test
     void testKaushikPermit() 
     {
       VehiclePermit permit = new VehiclePermit("Kaushik");
       String result = permit.issuePermit();

       assertEquals("Permit Issued to Kaushik", result);
     }

     @Test
     void testYashLicenseFlow() 
     {
       VehicleLicensing vl = new VehicleLicensing();
       boolean result = vl.provideLicense("Yash", 55, 24);

       assertTrue(result);
     }

     @Test
     void testSaiLicenseFail() 
     {
       VehicleLicensing vl = new VehicleLicensing();
       boolean result = vl.provideLicense("Sai", 30, 16);

       assertFalse(result);
     }
}
