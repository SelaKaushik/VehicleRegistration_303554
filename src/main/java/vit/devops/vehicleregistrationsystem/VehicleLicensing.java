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

    public boolean provideLicense(String owner, int marks, int age) {

        Examination exam = new Examination(marks, age);
        Finance finance = new Finance();

        if (exam.isEligible()) {
            finance.collectFee(500);
            return true;
        } else {
            return false;
        }
    }
}