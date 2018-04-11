/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.connection.CreConnection;
import com.util.NewHibernateUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import model.Choose;
import model.Sell;
import model.UserTrans;
import org.hibernate.Session;

/**
 *
 * @author Lenovo
 */
public class PaymentDao {

    CreConnection conob = new CreConnection();
    PaymentDao pay = new PaymentDao();

    public void saveSell(Sell sell) {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(sell);
        session.getTransaction().commit();
        session.close();

    }

    public double purChessprice(int id) {
        double d = 00;
        try {
            PreparedStatement ps = conob.doConnect().prepareStatement("select AVG(pro_price) from purchase where pro_id=" + id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                d = rs.getDouble(1);
            }

        } catch (Exception e) {
        }
        return d;
    }

    public void saveUserTrans(UserTrans userTrans) {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(userTrans);
        session.getTransaction().commit();
        session.close();

    }

    public boolean sellTransDelCart(String ip, String useremail, String paytx) {

        Date date = new Date();
        date = new Date(date.getYear(), date.getMonth(), date.getDate(), date.getHours(), date.getMinutes());

        ListDAO ob = new ListDAO();
        Sell sell = new Sell();
        UserTrans userTrans = new UserTrans();
        List<Choose> list = ob.findAllChooseBySession(ip);
        for (Choose choose : list) {
            Double purcPrice = pay.purChessprice(choose.getProId());
            Double toSum = purcPrice * choose.getQuantity();

            sell.setProId(choose.getProId());
            sell.setProName(choose.getProName());
            sell.setPurPrice(purcPrice);
            sell.setSellPrice(choose.getPrice());
            sell.setSellQty(choose.getQuantity());
            sell.setSellTotal(choose.getTotal());
            sell.setProfit(choose.getTotal() - toSum);
            sell.setSellDate(date);

            pay.saveSell(sell);
            pay.updateStock(choose.getProId(),choose.getQuantity());
           
            if (!useremail.isEmpty()) {

                userTrans.setUserEmail(useremail);
                userTrans.setProId(choose.getProId());
                userTrans.setProName(choose.getProName());
                userTrans.setPrice(choose.getPrice());
                userTrans.setQty(choose.getQuantity());
                userTrans.setTotal(choose.getTotal());
                userTrans.setTrDate(date);
                userTrans.setTx(paytx);
                pay.saveUserTrans(userTrans);

            }

        }

        return true;
    }

    public boolean deleCartIp(String ip) {

        try {
            PreparedStatement ps = conob.doConnect().prepareStatement("DELETE from choose where ses_id=" + ip);
            int i = ps.executeUpdate();
            while (i > 0) {
                return true;
            }

        } catch (Exception e) {
        }
        return false;
    }

    public boolean updateStock(int pid,int qty) {

        try {
            PreparedStatement ps = conob.doConnect().prepareStatement("UPDATE product SET pro_qty = " + qty + " where pro_id=" + pid);
            int i = ps.executeUpdate();
            while (i > 0) {
                return true;
            }

        } catch (Exception e) {
        }
        return false;
    }
}
