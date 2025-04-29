package main;

import java.io.*;
import java.util.*;
import model.user;
import service.user_services;

public class test_main {
private static	List<user> users = new ArrayList<>();
private static    Map<String, Integer> invalid_loginsMap = new HashMap<>();

private static    user_services userServices = new user_services(users, invalid_loginsMap);
    public static void main(String[] args) throws IOException {
        

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\manik\\OneDrive\\Documents\\abctravels.txt"));
            bw.write("Welcome to ABC Travels!");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\manik\\OneDrive\\Documents\\abctravels.txt"));
            String lineString;
            while ((lineString = br.readLine()) != null) {
                System.out.println(lineString);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        boolean running = true;
        Scanner scanner = new Scanner(System.in); // Move scanner outside loop

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. New Admin User Registration");
            System.out.println("2. Login (Not implemented yet)");
            System.out.println("3. Plan Journey (Not implemented yet)");
            System.out.println("4. Travel Date (Not implemented yet)");
            System.out.println("5. Exit");

            System.out.print("Enter a number: ");
            int x = scanner.nextInt();

            switch (x) {
                case 1:
                    userServices.user_registration();
                    break;
                case 2:
                	userServices.login();
                    break;
                case 3:
                    System.out.println("Plan Journey feature not implemented yet.");
                    break;
                case 4:
                    System.out.println("Travel Date feature not implemented yet.");
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for using ABC Travels!");
                    running = false;
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected value: " + x);
            }
        }

        scanner.close(); // Close scanner
    }
}
