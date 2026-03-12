/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.vehicleregistrationsystem;

import java.util.*;
public class VehicleRegistration {
    String vehicle_details;
    String owner;
    
    public static HashMap<String, String> vehicle_owners = new HashMap<>();
    
    public VehicleRegistration(String vehicle_details, String owner){
        this.vehicle_details = vehicle_details;
        this.owner = owner;
    }
    
    //Register Vehicle
    public void Register(){
        vehicle_owners.put(owner, vehicle_details);
        System.out.println(owner + "Registered with " + vehicle_details + " Successfully");
    }
    
    // Get vehicle details
    public static void getDetails(String owner){

        if(vehicle_owners.containsKey(owner)){
            System.out.println("Owner: " + owner);
            System.out.println("Vehicle: " + vehicle_owners.get(owner));
        }
        else{
            System.out.println("No vehicle found for this owner");
        }
    }

    // Verify vehicle
    public static boolean verifyDetails(String owner){

        if(vehicle_owners.containsKey(owner)){
            System.out.println("Vehicle Verified");
            return true;
        }
        else{
            System.out.println("Vehicle Not Registered");
            return false;
        }
    }
}
