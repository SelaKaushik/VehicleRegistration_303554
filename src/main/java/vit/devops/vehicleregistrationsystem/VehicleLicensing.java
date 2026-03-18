/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.vehicleregistrationsystem;

/**
 *
 * @author saiki
 */

public class VehicleLicensing {

    public void provideLicense(String owner, int marks){

        Examination exam = new Examination(marks);
        Finance finance = new Finance();

        if(exam.isEligible()){
            finance.collectFee(500);
            System.out.println("Driving License Issued to " + owner);
        }
        else{
            System.out.println("Driving License Not Issued to " + owner);
        }
    }
}