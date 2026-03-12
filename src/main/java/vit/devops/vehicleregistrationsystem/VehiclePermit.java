/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.vehicleregistrationsystem;

/**
 *
 * @author SelaKaushik
 */
public class VehiclePermit {
    String owner;

    public VehiclePermit(String owner){
        this.owner = owner;
    }

    public void issuePermit(){

        if(VehicleRegistration.verifyDetails(owner)){
            System.out.println("Permit Issued for " + owner);
        }
        else{
            System.out.println("Permit Cannot Be Issued");
        }
    }
}
