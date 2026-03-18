/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.vehicleregistrationsystem;

/**
 *
 * @author saiki
 */
public class Examination {
    private int marks;

    public Examination(int marks) {
        this.marks = marks;
    }

    public boolean isEligible() {
        return marks >= 40;
    }
}
