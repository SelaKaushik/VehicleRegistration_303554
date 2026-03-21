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
            sc.nextLine();

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

                    System.out.println("User Registered Successfully");
                    break;

                case 2:
                    System.out.println("--- User Login ---");

                    System.out.print("Enter Email: ");
                    String loginEmail = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String loginPassword = sc.nextLine();

                    boolean loginResult =
                            SignupLogin.login(loginEmail, loginPassword);

                    if (loginResult)
                        System.out.println("Login Successful");
                    else
                        System.out.println("Invalid Credentials");
                    break;

                case 3:
                    System.out.println("--- Vehicle Registration ---");

                    System.out.print("Enter Vehicle Details: ");
                    String details = sc.nextLine();

                    System.out.print("Enter Owner Name: ");
                    String owner = sc.nextLine();

                    VehicleRegistration vr =
                            new VehicleRegistration(details, owner);

                    vr.register();
                    System.out.println("Vehicle Registered Successfully");

                    String vehicleDetails =
                            VehicleRegistration.getDetails(owner);

                    if (vehicleDetails != null)
                        System.out.println("Vehicle Details: " + vehicleDetails);

                    VehiclePermit permit = new VehiclePermit(owner);
                    System.out.println(permit.issuePermit());
                    break;

                case 4:
                    System.out.println("--- Vehicle Licence ---");

                    System.out.print("Enter Candidate Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Driving Test Marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Owner Name: ");
                    String vehicleOwner = sc.nextLine();

                    String detailsCheck =
                            VehicleRegistration.getDetails(vehicleOwner);

                    if (detailsCheck == null) {
                        System.out.println("No Vehicle Found for " + vehicleOwner);
                        break;
                    }

                    System.out.println("Vehicle Details: " + detailsCheck);

                    VehicleLicensing vl = new VehicleLicensing();
                    boolean licenseResult =
                            vl.provideLicense(vehicleOwner, marks, age);

                    if (licenseResult)
                        System.out.println("Driving License Issued to " + vehicleOwner);
                    else
                        System.out.println("Driving License Not Issued to " + vehicleOwner);

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
