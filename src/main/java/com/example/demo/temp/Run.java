package com.example.demo.temp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Func> carMap = new HashMap<>();
        int choice;

        do {
            System.out.println("\n--- Car Garage Menu ---");
            System.out.println("1. Add a new Car");
            System.out.println("2. List all Cars");
            System.out.println("3. Operate on a Car");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // flush newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Car ID: ");
                    String carId = scanner.nextLine();

                    if (carMap.containsKey(carId)) {
                        System.out.println("Car ID already exists.");
                        break;
                    }

                    System.out.print("Enter Company: ");
                    String company = scanner.nextLine();
                    System.out.print("Enter Model: ");
                    String model = scanner.nextLine();

                    System.out.print("Enter Type: ");
                    String type = scanner.nextLine();

                    System.out.print("Enter Top Speed: ");
                    int topSpeed = scanner.nextInt();
                    scanner.nextLine(); // flush

                    System.out.print("Enter Engine Type: ");
                    String engineType = scanner.nextLine();

                    Car car = new Car(company, model, type, topSpeed, engineType);
                    Func func = new Func(car);
                    carMap.put(carId, func);
                    System.out.println("Car added with ID: " + carId);
                    break;

                case 2:
                    if (carMap.isEmpty()) {
                        System.out.println("No cars available.");
                    } else {
                        System.out.println("All Cars:");
                        for (String id : carMap.keySet()) {
                            Car c = carMap.get(id).getSpecs();
                            System.out.printf("ID: %s → %s %s (%s)\n", id, c.getCompany(), c.getModel(), c.getType());
                            // System.out.println(c);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Car ID to operate on: ");
                    String id = scanner.nextLine();

                    if (!carMap.containsKey(id)) {
                        System.out.println(" Car ID not found.");
                        break;
                    }

                    Func selected = carMap.get(id);
                    int action;

                    do {
                        System.out.println("\n--- Actions for Car ID: " + id + " ---");
                        System.out.println("1. Increase Speed");
                        System.out.println("2. Show Current Speed");
                        System.out.println("3. Show Car Info");
                        System.out.println("0. Back");
                        System.out.print("Choose action: ");
                        action = scanner.nextInt();

                        switch (action) {
                            case 1:
                                System.out.print("Enter speed to increase: ");
                                int speed = scanner.nextInt();
                                selected.increaseSpeed(speed);
                                break;
                            case 2:
                                System.out.println("Current Speed: " + selected.getCurrentSpeed() + " km/h");
                                break;
                            case 3:
                                Car c = selected.getSpecs();
                                System.out.println("Company: " + c.getCompany());
                                System.out.println("Model: " + c.getModel());
                                System.out.println("Type: " + c.getType());
                                System.out.println("Engine: " + c.getEngineType());
                                System.out.println("Top Speed: " + c.getTopSpeed() + " km/h");
                                break;
                            case 0:
                                System.out.println("🔙 Returning to main menu.");
                                break;
                            default:
                                System.out.println("Invalid action.");
                        }
                    } while (action != 0);
                    break;

                case 0:
                    System.out.println("👋 Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
