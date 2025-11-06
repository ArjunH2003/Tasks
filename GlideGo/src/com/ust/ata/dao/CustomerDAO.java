package com.ust.ata.dao;

import java.util.ArrayList;
import com.ust.ata.bean.ReservationBean;
import com.ust.ata.bean.RouteBean;
import com.ust.ata.bean.VehicleBean;
import com.ust.ata.service.Customer;

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