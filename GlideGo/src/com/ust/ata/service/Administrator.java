package com.ust.ata.service;

import java.util.ArrayList;

import com.ust.ata.bean.DriverBean;
import com.ust.ata.bean.ReservationBean;
import com.ust.ata.bean.RouteBean;
import com.ust.ata.bean.VehicleBean;

public interface Administrator {
	
	public String addVehicle(VehicleBean vehicleBean);  
	public int deleteVehicle(ArrayList<String> vehicleID);  
	public VehicleBean viewVehicle(String vehicleID);  
	public boolean modifyVehicle(VehicleBean vehicleBean);  
	public String addDriver(DriverBean driverBean);  
	public int deleteDriver(ArrayList<String> driverID);  
	public boolean allotDriver(String reservationID, String driverID);  
	public boolean modifyDriver(DriverBean driverBean); 
	public String addRoute(RouteBean routeBean);
	public int deleteRoute(ArrayList<String> routeID);  
	public RouteBean viewRoute(String routeID);
	public boolean modifyRoute(RouteBean routeBean);  
	ArrayList<ReservationBean> viewBookingDetails(String journeyDate,String source, String destination);

}
