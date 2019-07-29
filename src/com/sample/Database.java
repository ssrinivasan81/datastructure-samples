package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

	private static Database dbInstance;
	private static Connection con ;
    
	public Database() {}
	
	public static Database getInstance() {
		if (dbInstance == null) {
			dbInstance = new Database();
		}
		return dbInstance;
	}
	
	public Connection getConnection() {
		if (con == null) {
			try {
                String host = "jdbc:derby://localhost:1527/yourdatabasename";
                String username = "yourusername";
                String password = "yourpassword";
                con = DriverManager.getConnection( host, username, password );
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            } 
		}
		return con;
	}	
}

// To call singlecon
//Connection connection = Database.getInstance().getConnection();
