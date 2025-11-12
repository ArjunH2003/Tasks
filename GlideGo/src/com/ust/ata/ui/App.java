package com.ust.ata.ui;

	import java.util.ArrayList;
	import java.util.Scanner;

	import com.ust.ata.bean.*;
	import com.ust.ata.dao.*;
	import com.ust.ata.service.*;

	import java.util.Scanner;

	public class App {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        Administrator admin = new AdministratorDAO();
	        //Customer customer = new CustomerDAO();

	        
	        String adminUsername = "admin";
	        String adminPassword = "admin";

	        System.out.println("======================================");
	        System.out.println("               GlideGo                ");
	        System.out.println("======================================");

	        while (true) {
	            System.out.println("\nChoose User Type:");
	            System.out.println("1. Administrator");
	            System.out.println("2. Customer");
	            System.out.println("3. Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();

	            if (choice == 1) {
	                
	                boolean loggedIn = false;

	               
	                while (!loggedIn) {
	                    System.out.print("Enter Admin Username: ");
	                    String username = sc.next();
	                    System.out.print("Enter Admin Password: ");
	                    String password = sc.next();

	                   
	                    if (username.equals(adminUsername) && password.equals(adminPassword)) {
	                        System.out.println("Login successful!");
	                        loggedIn = true;
	                        adminMenu(admin, sc);  
	                    } else {
	                        System.out.println("Invalid username or password. Please try again.");
	                    }
	                }
//	            } else if (choice == 2) {
//	                
//	                customerMenu(customer, sc);
	            } else {
	                System.out.println("Exiting system...");
	                break;
	            }
	        }

	        sc.close();
	    }



	    public static void adminMenu(Administrator admin, Scanner sc) {
	        while (true) {
	            System.out.println("\n====== ADMIN MENU ======");
	            System.out.println("1. Add Vehicle");
	            System.out.println("2. Delete Vehicle");
	            System.out.println("3. View Vehicle");
	            System.out.println("4. Modify Vehicle");
	            System.out.println("5. Add Route");
	            System.out.println("6. Delete Route");
	            System.out.println("7. View Route");
	            System.out.println("8. Modify Route");
	            System.out.println("9. Back to Main Menu");
	            System.out.print("Enter choice: ");
	            String ch = sc.next();

	            switch (ch) {
	                case "AD-001":
	                    VehicleBean v = new VehicleBean();
	                    sc.nextLine();
	                    System.out.print("Enter Vehicle ID: ");
	                    v.setVehicleID(sc.nextLine());
	                    System.out.print("Enter Vehicle Name: ");
	                    v.setName(sc.nextLine());
	                    System.out.print("Enter Vehicle Type (AC/NonAC): ");
	                    v.setType(sc.nextLine());
	                    System.out.print("Enter Registration Number: ");
	                    v.setRegistrationNumber(sc.nextLine());
	                    System.out.print("Enter Seating Capacity: ");
	                    v.setSeatingCapacity(sc.nextInt());
	                    System.out.print("Enter Fare per KM: ");
	                    v.setFarePerKM(sc.nextDouble());
	                    admin.addVehicle(v);
	                    break;
	                    
	                case "AD-002":
	                    sc.nextLine();
	                    System.out.print("Enter Vehicle ID to delete: ");
	                    String delId = sc.nextLine();
	                    ArrayList<String> list = new ArrayList<>();
	                    list.add(delId);
	                    admin.deleteVehicle(list);
	                    break;

	                case "AD-003":
	                    sc.nextLine();
	                    System.out.print("Enter Vehicle ID: ");
	                    String vid = sc.nextLine();
	                    admin.viewVehicle(vid);
	                    break;
	                    
	                    
	                case "AD-004":
	                	VehicleBean v1 = new VehicleBean();
	                    sc.nextLine();
	                    System.out.print("Enter new Vehicle ID: ");
	                    v1.setVehicleID(sc.nextLine());
	                    admin.modifyVehicle(v1);


	                case "AD-005":
	                    RouteBean route = new RouteBean();
	                    sc.nextLine();
	                    System.out.print("Enter Route ID: ");
	                    route.setRouteID(sc.nextLine());
	                    System.out.print("Enter Source: ");
	                    route.setSource(sc.nextLine());
	                    System.out.print("Enter Destination: ");
	                    route.setDestination(sc.nextLine());
	                    System.out.print("Enter Distance (in KM): ");
	                    route.setDistance(sc.nextInt());
	                    System.out.print("Enter Travel Duration (hours): ");
	                    route.setTravelDuration(sc.nextInt());
	                    admin.addRoute(route);
	                    break;
	                    
	                case "AD-006":
	                    sc.nextLine();
	                    System.out.print("Enter Route ID to delete: ");
	                    String delrouteId = sc.nextLine();
	                    ArrayList<String> list1 = new ArrayList<>();
	                    list1.add(delrouteId);
	                    admin.deleteRoute(list1);
	                    break;

	                case "AD-007":
	                    sc.nextLine();
	                    System.out.print("Enter Route ID: ");
	                    String rid = sc.nextLine();
	                    admin.viewRoute(rid);
	                    break;
	                    
	                case "AD-008":
	                	RouteBean route1 = new RouteBean();
	                    sc.nextLine();
	                    System.out.print("Enter new Vehicle ID: ");
	                    route1.setRouteID(sc.nextLine());
	                    admin.modifyRoute(route1);

	                    
	                

	                case "a":
	                    return;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
	    }
	    
	}        // **

