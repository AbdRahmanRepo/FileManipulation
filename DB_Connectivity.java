package com.Demo.com;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB_Connectivity {
	//need to add MySql connector dependency
	
	//Need to Define what type of DB we going to use
	Class.forName("com.myaql.cj.jdbc.Driver"); //com.myaql.jdbc.Driver -deprecated
	
	//Create connection with DB
	Connection connection =DriverManager.getConnection("Add data base connection..jdbc:mysql://root@localhost/user");
	//for auth => jdbc:mysql://root@localhost/user,"username","password"
	
	//create Statement
	Statement statement = connection.createStatement();
	
	//get all data and stored ResultSet
	ResultSet result= statement.executeQuery("Select * from employee_table");
	
	while(result.next()) {
		System.out.println(result.getString(1) + result.getString(2));
	}
	
	
	
	
	
}
