/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.vehicleregistrationsystem;

/**
 *
 * @author saiki
 */

public class TestApp {

    public static void main(String[] args) {

        VehicleLicensing vl = new VehicleLicensing();

        vl.provideLicense("Sai", 50);
        vl.provideLicense("Ram", 20);
    }
}