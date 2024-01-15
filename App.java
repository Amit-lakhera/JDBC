package com.Jdbc;
import java.sql.SQLException;
/*
 * author: Amit Lakhera
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException {
/*
        *Database d1 = new Database();
        *d1.createTable();
*/
        Scanner input = new Scanner(System.in);
        System.out.print("1. Insert data");
        System.out.print("\t 2.Read data");
        System.out.print("\t 3.Update data");
        System.out.print("\t 4.Drop table");
        System.out.print("\t 5.Delete data");

        System.out.println("\nChoose from the above options:");
        int choice = input.nextInt();
        System.out.println("You have choose " + choice + " option");

        switch (choice) {
            case 1:
                System.out.println("Inserting the  data in the Database.........");
                Operations op = new Operations();
                op.insertData();
                System.out.println("Thankyou for choosing this option!!!");
                System.out.println("Please choose the 2nd option to read the data in the Database....");
                break;

            case 2:
                System.out.println("Reading the Database...........");
                Operations op1 = new Operations();
                op1.read();
                System.out.println("Thankyou for choosing this option");
                break;

            case 3:
                System.out.println("Updating the Database");
                Operation op2 = new Operations();
                op2.updateData();
                System.out.println("Thankyou for choosing this option");
                break;

            case 4:
                System.out.println("Deleting the Table in the Database....");
                Operations op3 = new Operations();
                op3.dropTable();
                System.out.println("Thankyou for choosing this option");
                break;
            case 5:
                System.out.println("Deleting the Data.......");
                Operations op4 = new Operations();
                op4.deleteData();
                System.out.println("Thankyou for choosing this option");
                break;

            default:
                System.out.println("Nothing to show");
                break;

        }
    }
}
