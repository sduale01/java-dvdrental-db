package com.dvdrentaldb;

public class App {	
	public static void main(String[] args) {
		DbAdapter dbAdapter = new DbAdapter();
		dbAdapter.connect();
//		dbAdapter.disconnect();
	}
}
