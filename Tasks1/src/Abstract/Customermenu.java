package Abstract;

import java.util.ArrayList;

import com.ust.ata.bean.ReservationBean;
import com.ust.ata.bean.RouteBean;
import com.ust.ata.bean.VehicleBean;
import com.ust.ata.dao.AdministratorDAO;
import com.ust.ata.service.Customer;

public class Customermenu {
	
	
	   
//    public static void customerMenu(Customer customer, Scanner sc) {
//        while (true) {
//            System.out.println("\n====== CUSTOMER MENU ======");
//            System.out.println("1. View Vehicles by Type");
//            System.out.println("2. View Vehicles by Seats");
//            System.out.println("3. View All Routes");
//            System.out.println("4. Book Vehicle");
//            System.out.println("5. Cancel Booking");
//            System.out.println("6. View Booking Details");
//            System.out.println("7. Back to Main Menu");
//            System.out.print("Enter choice: ");
//            int ch = sc.nextInt();
//
//            switch (ch) {
//                case 1:
//                    sc.nextLine();
//                    System.out.print("Enter Vehicle Type (AC/NonAC): ");
//                    String type = sc.nextLine();
//                    customer.viewVehiclesByType(type);
//                    break;
//
//                case 2:
//                    System.out.print("Enter seating capacity: ");
//                    int seats = sc.nextInt();
//                    customer.viewVehicleBySeats(seats);
//                    break;
//
//                case 3:
//                    customer.viewAllRoutes();
//                    break;
//
//                case 4:
//                    ReservationBean rb = new ReservationBean();
//                    sc.nextLine();
//                    System.out.print("Enter Reservation ID: ");
//                    rb.setReservationID(sc.nextLine());
//                    System.out.print("Enter User ID: ");
//                    rb.setUserID(sc.nextLine());
//                    System.out.print("Enter Vehicle ID: ");
//                    rb.setVehicleID(sc.nextLine());
//                    System.out.print("Enter Route ID: ");
//                    rb.setRouteID(sc.nextLine());
//                    System.out.print("Enter Journey Date (dd-mm-yyyy): ");
//                    rb.setJourneyDate(sc.nextLine());
//                    rb.setBookingStatus("Confirmed");
//                    rb.setTotalFare(500.0);
//                    customer.bookVehicle(rb);
//                    break;
//
//                case 5:
//                    sc.nextLine();
//                    System.out.print("Enter User ID: ");
//                    String uid = sc.nextLine();
//                    System.out.print("Enter Reservation ID: ");
//                    String resid = sc.nextLine();
//                    customer.cancelBooking(uid, resid);
//                    break;
//
//                case 6:
//                    sc.nextLine();
//                    System.out.print("Enter Reservation ID: ");
//                    String viewid = sc.nextLine();
//                    customer.printBookingDetails(viewid);
//                    break;
//
//                case 7:
//                    return;
//
//                default:
//                    System.out.println("Invalid choice! Try again.");
//            }
//        }
//    }
//}
////
////

	
	public class CustomerDAO implements Customer {

	    static ArrayList<VehicleBean> vehicleList = AdministratorDAO.vehicleList;
	    static ArrayList<RouteBean> routeList = AdministratorDAO.routeList;
	    static ArrayList<ReservationBean> reservationList = AdministratorDAO.reservationList;

	    @Override
	    public ArrayList<VehicleBean> viewVehiclesByType(String vehicleType) {
	        ArrayList<VehicleBean> list = new ArrayList<>();
	        for (VehicleBean v : vehicleList) {
	            if (v.getType().equalsIgnoreCase(vehicleType)) list.add(v);
	        }
	        if (list.isEmpty()) System.out.println("No vehicles found for type: " + vehicleType);
	        return list;
	    }

	    @Override
	    public ArrayList<VehicleBean> viewVehicleBySeats(int noOfSeats) {
	        ArrayList<VehicleBean> list = new ArrayList<>();
	        for (VehicleBean v : vehicleList) {
	            if (v.getSeatingCapacity() == noOfSeats) list.add(v);
	        }
	        if (list.isEmpty()) System.out.println("No vehicles found with " + noOfSeats + " seats.");
	        return list;
	    }

	    @Override
	    public ArrayList<RouteBean> viewAllRoutes() {
	        if (routeList.isEmpty()) System.out.println("No routes available.");
	        return routeList;
	    }

	    @Override
	    public String bookVehicle(ReservationBean reservationBean) {
	        int count = 0;
	        for (ReservationBean r : reservationList) {
	            if (r.getVehicleID().equals(reservationBean.getVehicleID()) &&
	                r.getJourneyDate().equalsIgnoreCase(reservationBean.getJourneyDate())) {
	                count++;
	            }
	        }

	        if (count >= 5) {
	            System.out.println("Seats unavailable for this vehicle.");
	            return null;
	        }

	        reservationList.add(reservationBean);
	        System.out.println("Vehicle booked successfully!");
	        return reservationBean.getReservationID();
	    }

	    @Override
	    public boolean cancelBooking(String userID, String reservationID) {
	        for (ReservationBean r : reservationList) {
	            if (r.getReservationID().equals(reservationID) && r.getUserID().equals(userID)) {
	                r.setBookingStatus("Cancelled");
	                System.out.println("Booking cancelled successfully.");
	                return true;
	            }
	        }
	        System.out.println("Booking not found or User mismatch.");
	        return false;
	    }

	    @Override
	    public ReservationBean viewBookingDetails(String reservationID) {
	        for (ReservationBean r : reservationList) {
	            if (r.getReservationID().equals(reservationID)) {
	                System.out.println("Booking found: " + r);
	                return r;
	            }
	        }
	        System.out.println("Booking not found.");
	        return null;
	    }

	    @Override
	    public ReservationBean printBookingDetails(String reservationID) {
	        for (ReservationBean r : reservationList) {
	            if (r.getReservationID().equals(reservationID)) {
	                System.out.println("------ Booking Details ------");
	                System.out.println("Reservation ID: " + r.getReservationID());
	                System.out.println("User ID: " + r.getUserID());
	                System.out.println("Vehicle ID: " + r.getVehicleID());
	                System.out.println("Journey Date: " + r.getJourneyDate());
	                System.out.println("Status: " + r.getBookingStatus());
	                System.out.println("-----------------------------");
	                return r;
	            }
	        }
	        System.out.println("Booking not found.");
	        return null;
	    }

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
