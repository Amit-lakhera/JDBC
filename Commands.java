package com.Jdbc;
/*
 * author: Amit Lakhera
 */

class Commands {
        static String CREATE = "CREATE DATABASE College" ;

        static String TABLE = "CREATE TABLE College (SNo int , Name varchar(50) , Course varchar(10) , RollNo varchar(20) , DOB varchar(10) , Fathername varchar(20) , Mothername varchar(20) , Email varchar(50) , Address varchar(50))" ;

        static String INSERT1 = "INSERT into College VALUES (1, 'Amit Lakhera', 'B.C.A', 'ITM1009', '15/02/2003', 'Manoj Lakhera', 'Sangeeta Lakhera', 'amit56@gmail.com', 'Delhi')" ;
        static String INSERT2 = "INSERT into College VALUES (2, 'Hardeep Yadav', 'B.C.A', 'ITM1035', '25/05/2002', 'Jagdish Yadav', 'Sunita Yadav', 'hardeep2@gmail.com', 'Haryana')";
        static String INSERT3 = "INSERT into College VALUES (3, 'Manish Bhatty', 'B.C.A', 'ITM1051', '19/04/2002', 'Ramniwas', 'Babita', 'bhatty@gmail.com', 'Haryana')";
        static String INSERT4 = "INSERT into College VALUES (4, 'Sourav Bisht', 'B.C.A', 'ITM1090', '5/01/2003', 'Mahinder Bisht', 'Sunita Bisht', 'sour55@gmail.com', 'Haryana')";
        static String INSERT5 = "INSERT into College VALUES (5, 'Shakti Singh', 'B.C.A', 'ITM1092', '14/02/2003', 'Jagdish Singh', 'Sheela Singh', 'shakti33@gmail.com', 'Haryana')";
        
        static String UPDATE = "UPDATE College set Name='Anuj Yadav' WHERE SNo=2";

        static String DELETE = "DELETE FROM College WHERE SNo=2 ";
        
        static String SELECT = "SELECT * FROM College";

        static String DROP = "DROP TABLE College";
}
