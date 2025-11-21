package src;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        VehiclePark park = new VehiclePark();

        park.addVehicle(new Car("C1", "34CAR01", 100));
        park.addVehicle(new Car("C2", "34CAR02", 120));
        park.addVehicle(new Truck("T1", "34TRK01", 200, 500));
        park.addVehicle(new Truck("T2", "34TRK02", 250, 800));

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    park.listVehicles();
                    break;

                case "2":
                    System.out.print("Vehicle id to rent: ");
                    String rentId = scanner.nextLine().trim();
                    System.out.print("Number of days: ");
                    int days;
                    try {
                        days = Integer.parseInt(scanner.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number");
                        break;
                    }
                    try {
                        double price = park.rentVehicle(rentId, days);
                        System.out.println("Total price: " + price);
                    } catch (VehicleUnavailableException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "3":
                    System.out.print("Vehicle id to drop: ");
                    String dropId = scanner.nextLine().trim();
                    try {
                        park.dropVehicle(dropId);
                        System.out.println("Vehicle dropped");
                    } catch (VehicleUnavailableException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "4":
                    System.out.print("Vehicle id to load: ");
                    String loadId = scanner.nextLine().trim();
                    System.out.print("Amount to load: ");
                    double amount;
                    try {
                        amount = Double.parseDouble(scanner.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount");
                        break;
                    }
                    try {
                        park.loadVehicle(loadId, amount);
                        System.out.println("Load added");
                    } catch (OverWeightException e) {
                        System.out.println("Over weight: " + e.getMessage());
                    } catch (VehicleUnavailableException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "5":
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("==== Vehicle Hiring System ====");
        System.out.println("1) List all vehicles");
        System.out.println("2) Rent a vehicle");
        System.out.println("3) Drop a vehicle");
        System.out.println("4) Load a vehicle");
        System.out.println("5) Quit");
    }
}