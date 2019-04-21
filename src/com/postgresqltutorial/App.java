package com.postgresqltutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {	
	public static void main(String[] args) {
		DbAdapter dbAdapter = new DbAdapter();
		dbAdapter.connect();
//		dbAdapter.disconnect();
	}
}
