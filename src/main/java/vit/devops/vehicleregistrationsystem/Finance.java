/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.vehicleregistrationsystem;

/**
 *
 * @author saiki
 */

public class Finance {

    private static double totalAmount = 0;

    public void collectFee(double amount) {
        totalAmount += amount;
        System.out.println("Fee Collected: " + amount);
    }

    public void showTotal() {
        System.out.println("Total Revenue: " + totalAmount);
    }
}
