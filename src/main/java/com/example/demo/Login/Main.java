package com.example.demo.Login;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserLogin loginSystem = new UserLogin();
        HashMap<Integer, User> user = new HashMap<>();
        int userId = 1;
        System.out.println("Welcome to the User Login System");
        System.out.println("Select an option:");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Change Password");

     
        boolean r = true;
        scanner.nextLine(); // consume newline
        while(r){
             System.out.println("Welcome to the User Login System");
            System.out.println("Select an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Change Password");
               int choice = scanner.nextInt();
            switch (choice) {
            case 1:

                System.err.println("Enter NAme");
                String name = scanner.next();
                System.out.println("Enter email:");
                String regEmail = scanner.nextLine();
                System.out.println("Enter password:");
                String regPass = scanner.nextLine();
                System.out.println("Enter role (integer):");
                int role = scanner.nextInt();
                // loginSystem.UserRegistration(regEmail, regPass, role);
                System.out.println("Registration successful!");
                User u = new User(userId++,name,role,regPass,regEmail);
                user.put(u.userId,u);

                break;

            case 2:
                System.out.println("Enter email:");
                String logEmail = scanner.next();
                System.out.println("Enter password:");
                String logPass = scanner.nextLine();
                loginSystem.userLogin(logEmail, logPass);
                break;

            case 3:
                System.out.println("Enter email:");
                String cpEmail = scanner.next();
                System.out.println("Enter old password:");
                String cpOldPass = scanner.nextLine();
                System.out.println("Enter new password:");
                String cpNewPass = scanner.nextLine();
                loginSystem.changePassword(cpEmail, cpOldPass, cpNewPass);
                break;
            case 4:
                r = false;
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

        scanner.close();
    }
}
