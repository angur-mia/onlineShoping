/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author PARVES
 */
public class CreConnection {
    
    String driver="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/shop_online";
    String user="root";
    String pass="apcl123456";
    
    public Connection doConnect(){
        Connection con = null;
        try {
           Class.forName(driver);
           con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
        }
        return con;
    }
    
}
