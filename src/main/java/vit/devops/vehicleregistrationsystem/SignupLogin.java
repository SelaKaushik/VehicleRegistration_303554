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
    }

    public static boolean login(String email, String password) {
        return users.containsKey(email) &&
               users.get(email).equals(password);
    }
}
