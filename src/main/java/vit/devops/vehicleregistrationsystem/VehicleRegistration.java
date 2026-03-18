/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.vehicleregistrationsystem;

import java.util.HashMap;

public class VehicleRegistration {

    private String details;
    private String owner;

    private static HashMap<String, String> vehicleDB = new HashMap<>();

    public VehicleRegistration(String details, String owner) {
        this.details = details;
        this.owner = owner;
    }

    public void register() {
        vehicleDB.put(owner, details);
        System.out.println("Vehicle Registered Successfully");
    }

    public static void getDetails(String owner) {
        if (vehicleDB.containsKey(owner)) {
            System.out.println("Vehicle Details: " + vehicleDB.get(owner));
        } else {
            System.out.println("No Vehicle Found for " + owner);
        }
    }
}
