package com.ust.ata.service;

import java.util.ArrayList;

import com.ust.ata.bean.ReservationBean;
import com.ust.ata.bean.RouteBean;
import com.ust.ata.bean.VehicleBean;

public interface Customer {
	
	public ArrayList<VehicleBean> viewVehiclesByType(String vehicleType)  ;
	ArrayList<VehicleBean> viewVehicleBySeats(int noOfSeats);  
	ArrayList<RouteBean> viewAllRoutes();
	public String bookVehicle(ReservationBean reservationBean);
	public boolean cancelBooking(String userID, String reservationID);  
	public ReservationBean viewBookingDetails(String reservationID);  
	public ReservationBean printBookingDetails(String reservationID); 

}
