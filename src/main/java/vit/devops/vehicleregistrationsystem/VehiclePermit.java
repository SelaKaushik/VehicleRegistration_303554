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

    private String owner;

    public VehiclePermit(String owner) {
        this.owner = owner;
    }

    public String issuePermit() {
        return "Permit Issued to " + owner;
    }
}
