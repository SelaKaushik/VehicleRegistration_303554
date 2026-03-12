/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.vehicleregistrationsystem;

import java.util.HashMap;

public class SignupLogin {

    String name;
    String emailId;
    String password;

    // HashMap to store email and password
    public static HashMap<String, String> users = new HashMap<>();

    public SignupLogin(String name, String email, String password){
        this.name = name;
        this.emailId = email;
        this.password = password;
    }

    // Signup method
    public void SignUp(){
        users.put(emailId, password);
        System.out.println(name + "," + emailId + ": has SignedUp");
    }

    // Login method
    public static void Login(String email, String password){
        if(users.containsKey(email) && users.get(email).equals(password)){
            System.out.println("Logged in Successfully");
        }
        else{
            System.out.println("Invalid Email or Password");
        }
    }
}
