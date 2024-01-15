package com.Jdbc;

/*
 * author: Amit Lakhera
 */
import java.sql.*;

class Database {
    public void createDatabase() {
        try {
            String DB_URL = "jdbc:mysql://localhost:3306/";
            String USER = "root";
            String PASS = "At";

            Connection c = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement s = c.createStatement();
            String query = Commands.CREATE;
            s.executeUpdate(query);
            System.out.println("********************Database created successfully***********************");
            s.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  public void createTable() {
        try {
            String DB_URL = "jdbc:mysql://localhost:3306/College";
            String USER = "root";
            String PASS = "At";

            Connection c = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement s = c.createStatement();
            String query = Commands.TABLE;
            s.executeUpdate(query);
            System.out.println("********************Table created successfully***********************");
            s.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
