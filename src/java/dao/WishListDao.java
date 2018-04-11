/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.*;
import model.ShopUser;
import model.Wishlist;
import com.util.NewHibernateUtil;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class WishListDao {

    public void deleteWishlist(int id, Date ti) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Wishlist w = new Wishlist(id, ti);
        s.delete(w);
        s.getTransaction().commit();
        s.close();

    }

    public List<Wishlist> getAllWhshItemUnderEMail(String user) {

        List<Wishlist> cList = new ArrayList<Wishlist>();

        try {
            String sql = "SELECT * FROM wishlist WHERE user_email like '" + user + "'";
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);
            while (rs.next()) {
                Wishlist ob = new Wishlist();
                ob.setId(rs.getInt("id"));
                ob.setUserEmail(rs.getString("user_email"));
                ob.setProId(rs.getInt("pro_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setPrice(rs.getDouble("price"));
                ob.setQuantity(rs.getInt("quantity"));
                ob.setTotal(rs.getDouble("total"));
                ob.setTime(rs.getDate("time"));
                cList.add(ob);
            }

            return cList;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return cList;
    }

    public int getHowManyItemWishedUnderEmail(String user) {

        int result = 0;

        try {
            String sql = "SELECT COUNT(*) FROM wishlist WHERE user_email like '" + user + "'";
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                result = rs.getInt(1);
            }

        } catch (Exception e) {
        }

        return result;
    }

   
}
