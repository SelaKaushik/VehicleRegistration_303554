/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vit.devops.vehicleregistrationsystem;

import java.util.*;

public class VehicleRegistrationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("Choose Option: \n1: SignUp \n2: Login \n3: Vehicle registration \n0: Exit");
            int x = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch(x){

                case 1:
                    System.out.println("--- User Registration ---");
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String password = sc.nextLine();

                    SignupLogin user = new SignupLogin(name, email, password);
                    user.SignUp();
                    break;

                case 2:
                    System.out.println("--- User Login ---");
                    System.out.print("Enter Email: ");
                    String loginEmail = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String loginPassword = sc.nextLine();

                    SignupLogin.Login(loginEmail, loginPassword);
                    break;
                case 3:
                    System.out.println("--- Vehicle Registration ---");
                    System.out.print("Enter Vehicle Details: ");
                    String details = sc.nextLine();

                    System.out.print("Enter Owner Name: ");
                    String owner = sc.nextLine();

                    VehicleRegistration vehicle_register  = new VehicleRegistration(details, owner);
                    vehicle_register.Register();
                    
                    VehicleRegistration.getDetails(owner);
                    
                    VehiclePermit permit = new VehiclePermit(owner);
                    permit.issuePermit();
                    System.out.print("Enter Driving Test Marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine();

                    VehicleLicensing vl = new VehicleLicensing();
                    vl.provideLicense(owner, marks);
                    break;

                case 0:
                    System.out.println("Program exited");
                    System.exit(0);

                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}
