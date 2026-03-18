/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vit.devops.vehicleregistrationsystem;

import java.util.HashMap;

public class SignupLogin {

    private String name;
    private String email;
    private String password;

    private static HashMap<String, String> users = new HashMap<>();

    public SignupLogin(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void signUp() {
        users.put(email, password);
        System.out.println("User Registered Successfully");
    }

    public static void login(String email, String password) {
        if (users.containsKey(email) && users.get(email).equals(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}
