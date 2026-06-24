/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    

package lostfoundsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    Connection con = null;

    public Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lostfounddb",
                    "root",
                    "root123");

            System.out.println("Connected");
        }

        catch(Exception e)
        {
            System.out.println(e);
        }

        return con;
    }
}

