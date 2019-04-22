package com.dvdrentaldb;

public class App {	
	public static void main(String[] args) throws Exception {
		
		DbAdapter.connect();
		RoutesDvdRental.getActors();
		RoutesDvdRental.getActorById(4);
		DbAdapter.disconnect();
	}
}
