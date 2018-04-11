/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.*;
import com.connection.CreConnection;
import model.ShopUser;
import com.util.NewHibernateUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class UserDao {
    CreConnection cc=new CreConnection();
     public Boolean doUpdatepasss(String email, String old,String pass) {
        try {
            String sql = "update shop_user set password='" + pass + "' where email='" + email + "' AND password='" + old + "'";
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            int i = pstmt.executeUpdate(sql);
           if(i>0){
           return true;
           }else{}
        } catch (Exception e) {
        }
        return false;
    }
    
    public Boolean doUpdateinfo(String email, String old,String pass) {
        try {
            String sql = "update shop_user set password='" + pass + "' where email='" + email + "' AND password='" + old + "'";
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            int i = pstmt.executeUpdate(sql);
           if(i>0){
           return true;
           }else{}
        } catch (Exception e) {
        }
        return false;
    }
    
    public List<ShopUser>  doQueryshopUserinfo(String email) {
        List<ShopUser> li=new ArrayList<>();
        try {
            String sql = "select * from shop_user where email='" + email +" '";
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs=pstmt.executeQuery(sql);
           while(rs.next()){
               
               
               ShopUser o=new ShopUser(rs.getString("email"), rs.getString("password"),rs.getDate("reg_date"),rs.getString("contact_no"), rs.getInt("role_id"), rs.getString("address"),rs.getString("country"), rs.getString("district"), rs.getString("zip_code"), rs.getString("shoper_name"));
           li.add(o);
           return li;
           }
        } catch (Exception e) {
        }
        return null;
    }
    
       public boolean updateShopUserInfoDao(ShopUser shopUser){
          
         try {
            String sql = "update shop_user set email='" + shopUser.getEmail() + "',contact_no='" + shopUser.getContactNo() + "',address='" + shopUser.getAddress() + "',country='" + shopUser.getCountry() + "',district='" + shopUser.getDistrict() + "',zip_code='" + shopUser.getZipCode() + "',shoper_name='" + shopUser.getShoperName() + "' where user_id='" + shopUser.getUserId() + "'";
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            int i = pstmt.executeUpdate(sql);
           if(i>0){
           return true;
           }else{}
        } catch (Exception e) {
        }
        return false;
       
    }
       
 public static boolean login(String user, String password) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = new com.connection.CreConnection().doConnect();
            ps = con.prepareStatement(
                    "select user, pass from userinfo where user= ? and pass= ? ");
            ps.setString(1, user);
            ps.setString(2, password);
  
            ResultSet rs = ps.executeQuery();
            if (rs.next()) // found
            {
                System.out.println(rs.getString("user"));
                return true;
            }
            else {
                return false;
            }
        } catch (Exception ex) {
            System.out.println("Error in login() -->" + ex.getMessage());
            return false;
        } finally {
        
        }
    }      
    
}
