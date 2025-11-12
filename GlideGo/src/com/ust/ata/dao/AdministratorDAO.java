package com.ust.ata.dao;

import java.util.ArrayList;
import com.ust.ata.bean.DriverBean;
import com.ust.ata.bean.ReservationBean;
import com.ust.ata.bean.RouteBean;
import com.ust.ata.bean.VehicleBean;
import com.ust.ata.service.Administrator;

public class AdministratorDAO implements Administrator {


    static ArrayList<VehicleBean> vehicleList = new ArrayList<>();
    static ArrayList<DriverBean> driverList = new ArrayList<>();
    static ArrayList<RouteBean> routeList = new ArrayList<>();
    static ArrayList<ReservationBean> reservationList = new ArrayList<>();


    @Override
    public String addVehicle(VehicleBean vehicleBean) {
        vehicleList.add(vehicleBean);
        System.out.println("Vehicle added successfully.");
        return vehicleBean.getVehicleID();
    }

    @Override
    public int deleteVehicle(ArrayList<String> vehicleIDs) {
        int count = 0;
        for (String id : vehicleIDs) {
            for (int i = 0; i < vehicleList.size(); i++) {
                if (vehicleList.get(i).getVehicleID().equals(id)) {
                    vehicleList.remove(i);
                    count++;
                    System.out.println("Vehicle " + id + " deleted.");
                    break;
                }
            }
        }
        if (count == 0) System.out.println(" No vehicle found for given IDs.");
        return count;
    }

    @Override
    public VehicleBean viewVehicle(String vehicleID) {
        for (VehicleBean v : vehicleList) {
            if (v.getVehicleID().equals(vehicleID)) {
                System.out.println("Vehicle found: " + v.getName());
                return v;
            }
        }
        System.out.println("Vehicle not found.");
        return null;
    }
    
      
    @Override
    public boolean modifyVehicle(VehicleBean vehicleBean) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getVehicleID().equals(vehicleBean.getVehicleID())) {
                vehicleList.set(i, vehicleBean);
                System.out.println(" Vehicle updated.");
                return true;
            }
        }
        System.out.println(" Vehicle not found for update.");
        return false;
    }


    @Override
    public String addDriver(DriverBean driverBean) {
        driverList.add(driverBean);
        System.out.println(" Driver added successfully.");
        return driverBean.getDriverID();
    }

    @Override
    public int deleteDriver(ArrayList<String> driverIDs) {
        int count = 0;
        for (String id : driverIDs) {
            for (int i = 0; i < driverList.size(); i++) {
                if (driverList.get(i).getDriverID().equals(id)) {
                    driverList.remove(i);
                    count++;
                    System.out.println(" Driver " + id + " deleted.");
                    break;
                }
            }
        }
        if (count == 0) 
        	System.out.println(" No driver found for given IDs.");
        return count;
    
    }

    @Override
    public boolean allotDriver(String reservationID, String driverID) {
        for (ReservationBean r : reservationList) {
            if (r.getReservationID().equals(reservationID)) {
                r.setDriverID(driverID);
                System.out.println("Driver allotted successfully.");
                return true;
            }
        }
        System.out.println(" Reservation not found.");
        return false;
    }

    @Override
    public boolean modifyDriver(DriverBean driverBean) {
        for (int i = 0; i < driverList.size(); i++) {
            if (driverList.get(i).getDriverID().equals(driverBean.getDriverID())) {
                driverList.set(i, driverBean);
                System.out.println("Driver updated.");
                return true;
            }
        }
        System.out.println(" Driver not found for update.");
        return false;
    }


    @Override
    public String addRoute(RouteBean routeBean) {
        routeList.add(routeBean);
        System.out.println("Route added successfully.");
        return routeBean.getRouteID();
    }

    @Override
    public int deleteRoute(ArrayList<String> routeIDs) {
        int count = 0;
        for (String id : routeIDs) {
            for (int i = 0; i < routeList.size(); i++) {
                if (routeList.get(i).getRouteID().equals(id)) {
                    routeList.remove(i);
                    count++;
                    System.out.println("Route " + id + " deleted.");
                    break;
                }
            }
        }
        if (count == 0) System.out.println("No route found for given IDs.");
        return count;
    }

    @Override
    public RouteBean viewRoute(String routeID) {
        for (RouteBean r : routeList) {
            if (r.getRouteID().equals(routeID)) {
                System.out.println("Route found: " + r.getSource() + " to " + r.getDestination());
                return r;
            }
        }
        System.out.println("Route not found.");
        return null;
    }

    @Override
    public boolean modifyRoute(RouteBean routeBean) {
        for (int i = 0; i < routeList.size(); i++) {
            if (routeList.get(i).getRouteID().equals(routeBean.getRouteID())) {
                routeList.set(i, routeBean);
                System.out.println("Route updated.");
                return true;
            }
        }
        System.out.println("Route not found for update.");
        return false;
    }


    @Override
    public ArrayList<ReservationBean> viewBookingDetails(String journeyDate, String source, String destination) {
        ArrayList<ReservationBean> result = new ArrayList<>();
        for (ReservationBean r : reservationList) {
            if (r.getJourneyDate().equalsIgnoreCase(journeyDate)) {
                result.add(r);
            }
        }
        if (result.isEmpty()) System.out.println("No bookings found.");
        return result;
    }

}