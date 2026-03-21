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
    }

    public static String getDetails(String owner) {
        return vehicleDB.get(owner);
    }
}