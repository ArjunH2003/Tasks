package com.ust.ata.ui;

	import java.util.ArrayList;
	import java.util.Scanner;

	import com.ust.ata.bean.*;
	import com.ust.ata.dao.*;
	import com.ust.ata.service.*;

	public class App {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        Administrator admin = new AdministratorDAO();
	        Customer customer = new CustomerDAO();

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
	                adminMenu(admin, sc);
	            } else if (choice == 2) {
	                customerMenu(customer, sc);
	            } else {
	                System.out.println("Thank you! Exiting system...");
	                break;
	            }
	        }

	        sc.close();
	    }


	    public static void adminMenu(Administrator admin, Scanner sc) {
	        while (true) {
	            System.out.println("\n====== ADMIN MENU ======");
	            System.out.println("1. Add Vehicle");
	            System.out.println("2. View Vehicle");
	            System.out.println("3. Delete Vehicle");
	            System.out.println("4. Add Route");
	            System.out.println("5. View Route");
	            System.out.println("6. Back to Main Menu");
	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();

	            switch (ch) {
	                case 1:
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

	                case 2:
	                    sc.nextLine();
	                    System.out.print("Enter Vehicle ID: ");
	                    String vid = sc.nextLine();
	                    admin.viewVehicle(vid);
	                    break;

	                case 3:
	                    sc.nextLine();
	                    System.out.print("Enter Vehicle ID to delete: ");
	                    String delId = sc.nextLine();
	                    ArrayList<String> list = new ArrayList<>();
	                    list.add(delId);
	                    admin.deleteVehicle(list);
	                    break;

	                case 4:
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

	                case 5:
	                    sc.nextLine();
	                    System.out.print("Enter Route ID: ");
	                    String rid = sc.nextLine();
	                    admin.viewRoute(rid);
	                    break;

	                case 6:
	                    return;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
	    }

	   
	    public static void customerMenu(Customer customer, Scanner sc) {
	        while (true) {
	            System.out.println("\n====== CUSTOMER MENU ======");
	            System.out.println("1. View Vehicles by Type");
	            System.out.println("2. View Vehicles by Seats");
	            System.out.println("3. View All Routes");
	            System.out.println("4. Book Vehicle");
	            System.out.println("5. Cancel Booking");
	            System.out.println("6. View Booking Details");
	            System.out.println("7. Back to Main Menu");
	            System.out.print("Enter choice: ");
	            int ch = sc.nextInt();

	            switch (ch) {
	                case 1:
	                    sc.nextLine();
	                    System.out.print("Enter Vehicle Type (AC/NonAC): ");
	                    String type = sc.nextLine();
	                    customer.viewVehiclesByType(type);
	                    break;

	                case 2:
	                    System.out.print("Enter seating capacity: ");
	                    int seats = sc.nextInt();
	                    customer.viewVehicleBySeats(seats);
	                    break;

	                case 3:
	                    customer.viewAllRoutes();
	                    break;

	                case 4:
	                    ReservationBean rb = new ReservationBean();
	                    sc.nextLine();
	                    System.out.print("Enter Reservation ID: ");
	                    rb.setReservationID(sc.nextLine());
	                    System.out.print("Enter User ID: ");
	                    rb.setUserID(sc.nextLine());
	                    System.out.print("Enter Vehicle ID: ");
	                    rb.setVehicleID(sc.nextLine());
	                    System.out.print("Enter Route ID: ");
	                    rb.setRouteID(sc.nextLine());
	                    System.out.print("Enter Journey Date (dd-mm-yyyy): ");
	                    rb.setJourneyDate(sc.nextLine());
	                    rb.setBookingStatus("Confirmed");
	                    rb.setTotalFare(500.0);
	                    customer.bookVehicle(rb);
	                    break;

	                case 5:
	                    sc.nextLine();
	                    System.out.print("Enter User ID: ");
	                    String uid = sc.nextLine();
	                    System.out.print("Enter Reservation ID: ");
	                    String resid = sc.nextLine();
	                    customer.cancelBooking(uid, resid);
	                    break;

	                case 6:
	                    sc.nextLine();
	                    System.out.print("Enter Reservation ID: ");
	                    String viewid = sc.nextLine();
	                    customer.printBookingDetails(viewid);
	                    break;

	                case 7:
	                    return;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }
	        }
	    }
	}


