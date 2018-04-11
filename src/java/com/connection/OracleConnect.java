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
 * @author Lenovo
 */
public class OracleConnect {
    String driver="oracle.jdbc.OracleDriver";
    String url="jdbc:oracle:thin:@localhost:1521:shop";
    String user="SYSTEM";
    String pass="123";
    
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
