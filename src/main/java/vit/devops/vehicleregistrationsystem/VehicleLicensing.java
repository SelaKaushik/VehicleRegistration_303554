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

    public void provideLicense(String name, int marks) {

        Examination exam = new Examination(marks);
        Finance finance = new Finance();

        if (exam.isEligible()) {
            finance.collectFee(500);
            System.out.println("License issued to " + name);
        } else {
            System.out.println("License denied to " + name);
        }
    }
}