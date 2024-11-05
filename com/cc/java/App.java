package com.cc.java;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.Statement;

import java.sql.*;


public class App 
{
    // Argumente für Connection-Parameter
    static String conURL = "jdbc:mysql://104.248.39.169:3306/mydb";
    static String usrStr = "remote_user";
    static String usrPwd = "pass@remote";

    static Connection con;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {
        
      try {
        
        // Load SQL Server JDBC driver and establish connection.
        System.out.print("Connecting to SQL Server ... ");

        try (Connection con = DriverManager.getConnection(conURL, usrStr, usrPwd)) {

            System.out.println("Success!");  
            System.out.println(con);

             // Creating a statement object
             Statement stmt = con.createStatement();

             // Executing the query and storing the result in a ResultSet object
             ResultSet rs = stmt.executeQuery("SELECT * FROM mydb.employees");
             System.out.println(rs);

             



         
            
        } catch (Exception e) {
            e.printStackTrace();
        }

      } catch (Exception e) {
        e.printStackTrace();
      }








    }
    
}


