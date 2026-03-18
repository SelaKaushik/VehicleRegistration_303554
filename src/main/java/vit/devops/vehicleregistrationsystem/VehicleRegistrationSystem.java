/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vit.devops.vehicleregistrationsystem;

import java.util.*;

public class VehicleRegistrationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nChoose Option:");
            System.out.println("1: SignUp");
            System.out.println("2: Login");
            System.out.println("3: Vehicle Registration");
            System.out.println("4: Vehicle Licence");
            System.out.println("0: Exit");

            int x = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (x) {

                case 1:
                    System.out.println("--- User Registration ---");

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String password = sc.nextLine();

                    SignupLogin user = new SignupLogin(name, email, password);
                    user.signUp();
                    break;

                case 2:
                    System.out.println("--- User Login ---");

                    System.out.print("Enter Email: ");
                    String loginEmail = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String loginPassword = sc.nextLine();

                    SignupLogin.login(loginEmail, loginPassword);
                    break;

                case 3:
                    System.out.println("--- Vehicle Registration ---");

                    System.out.print("Enter Vehicle Details: ");
                    String details = sc.nextLine();

                    System.out.print("Enter Owner Name: ");
                    String owner = sc.nextLine();

                    VehicleRegistration vehicleRegister =
                            new VehicleRegistration(details, owner);

                    vehicleRegister.register();
                    VehicleRegistration.getDetails(owner);

                    VehiclePermit permit = new VehiclePermit(owner);
                    permit.issuePermit();
                    break;

                case 4:
                    System.out.println("--- Vehicle Licence ---");

                    System.out.print("Enter Candidate Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Driving Test Marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine(); // IMPORTANT

                    System.out.print("Enter Owner Name: ");
                    String vehicleOwner = sc.nextLine();

                    VehicleRegistration.getDetails(vehicleOwner);

                    VehicleLicensing vl = new VehicleLicensing();
                    vl.provideLicense(vehicleOwner, marks, age);
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
