package com.Jdbc;
/*
 * author: Amit Lakhera
 */
import java.sql.*;

class Operations {
    public void insertData() {
        try {
            String DB_URL = "jdbc:mysql://localhost:3306/College";
            String USER = "root";
            String PASS = "At";

            Connection c = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement s = c.createStatement();
            c.setAutoCommit(false);
            s.addBatch(Commands.INSERT1);
            s.addBatch(Commands.INSERT2);
            s.addBatch(Commands.INSERT3);
            s.addBatch(Commands.INSERT4);
            s.addBatch(Commands.INSERT5);
            s.executeBatch();

            c.commit();
            System.out.println("********************Data inserted successfully***********************");
            s.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void read() {
        try {
            String DB_URL = "jdbc:mysql://localhost:3306/College";
            String USER = "root";
            String PASS = "At";

            Connection c = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement s = c.createStatement();
            String query = Commands.SELECT;
            ResultSet rs = s.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                        "SNo = " + rs.getInt(1) + "\t\t"
                                + "Name = " + rs.getString(2) + "\t\t"
                                + "Course = " + rs.getString(3) + "\t\t"
                                + "RollNo = " + rs.getString(4) + "\t\t"
                                + "DOB = " + rs.getString(5) + "\t\t"
                                + "Fathername = " + rs.getString(6) + "\t\t"
                                + "Mothername = " + rs.getString(7) + "\t\t"
                                + "Email-id = " + rs.getString(8) + "\t\t"
                                + "Address = " + rs.getString(9));

            }
            System.out.println();
            System.out.println("********************All Data is readed successfully********************");
            s.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  public void updateData() {
        try {
            String DB_URL = "jdbc:mysql://localhost:3306/College";
            String USER = "root";
            String PASS = "At";

            Connection c = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = Commands.UPDATE;
            PreparedStatement p = c.prepareStatement(query);
            p.executeUpdate(query);
            System.out.println("********************Data updated successfully********************");
            p.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteData() {
        try {
            String DB_URL = "jdbc:mysql://localhost:3306/College";
            String USER = "root";
            String PASS = "At";

            Connection c = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = Commands.DELETE;
            PreparedStatement p = c.prepareStatement(query);
            p.executeUpdate(query);
            System.out.println("********************Data deleted successfully********************");
            p.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dropTable() {
        try {
            String DB_URL = "jdbc:mysql://localhost:3306/College";
            String USER = "root";
            String PASS = "At";

            Connection c = DriverManager.getConnection(DB_URL, USER, PASS);
            String query = Commands.DROP;
            PreparedStatement p = c.prepareStatement(query);
            p.executeUpdate(query);
            System.out.println("********************Table deleted successfully********************");
            p.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
