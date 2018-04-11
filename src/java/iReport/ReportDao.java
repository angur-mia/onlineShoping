package iReport;

import model.Product;
import model.Purchase;
import model.Sell;
import com.util.NewHibernateUtil;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class ReportDao {

    //    sell report method 
    public List<Map<String, ?>> findAllSellProduct(Date s, Date e) {
        List<Map<String, ?>> empList = new ArrayList<Map<String, ?>>();
        for (Sell empList1 : findSellReport(s, e)) {
            Map<String, Object> m = new HashMap<String, Object>();
            m.put("sell_A_pro_name", empList1.getProName());
            m.put("sell_A_sell_price", empList1.getSellPrice());
            m.put("sell_A_sell_qty", empList1.getSellQty());
            m.put("sell_A_sell_total", empList1.getSellTotal());
            m.put("sell_A_sell_date", empList1.getSellDate());
            empList.add(m);
        }

        return empList;

    }

    public List<Sell> findSellReport(Date st, Date e) {
        List<Sell> li = new ArrayList<Sell>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Query q = s.createQuery("From Sell where sellDate BETWEEN:a AND :b");
        q.setParameter("a", st);
        q.setParameter("b", e);
        li = q.list();
        s.close();
        return li;

    }

//    buy report method 
    public List<Map<String, ?>> findAllBuyReport(Date s, Date e) {
        List<Map<String, ?>> List = new ArrayList<Map<String, ?>>();
        for (Purchase List1 : findBuyQuery(s, e)) {
            Map<String, Object> m = new HashMap<String, Object>();
            m.put("purchase_pro_name", List1.getProName());
            m.put("purchase_pro_size", List1.getProSize());
            m.put("purchase_pro_price", List1.getProPrice());
            m.put("purchase_pro_qty", List1.getProQty());
            m.put("purchase_total", List1.getTotal());
            m.put("purchase_pur_date", List1.getPurDate());
            List.add(m);
        }

        return List;

    }

    public List<Purchase> findBuyQuery(Date s, Date e) {
        List<Purchase> li = new ArrayList<Purchase>();
        Session se = NewHibernateUtil.getSessionFactory().openSession();
        se.beginTransaction();
        Query q = se.createQuery("From Purchase where purDate BETWEEN:a AND :b");
        q.setParameter("a", s);
        q.setParameter("b", e);
        li = q.list();
        se.close();
        return li;

    }

//  customer report
    public List<Map<String, ?>> findAllCustomerReport(String email) {
        List<Map<String, ?>> List = new ArrayList<Map<String, ?>>();
        for (CutomerReport List1 : findCustomerQuery(email)) {
            Map<String, Object> m = new HashMap<String, Object>();
            m.put("shop_user_user_id", List1.getUserId());
            m.put("shop_user_shoper_name", List1.getShoperName());
            m.put("shop_user_contact_no", List1.getConNumber());
            m.put("user_trans_pro_name", List1.getProName());
            m.put("user_trans_pro_id", List1.getProId());
            m.put("user_trans_price", List1.getUnitPrice());
            m.put("user_trans_qty", List1.getQty());
            m.put("user_trans_total", List1.getTotal());
            m.put("uuser_trans_tr_date", List1.getTrDte());
            List.add(m);
        }

        return List;

    }

    public List<CutomerReport> findCustomerQuery(String email) {
        List<CutomerReport> li = new ArrayList<CutomerReport>();
        try {
            String sql = "SELECT * FROM user_trans, shop_user where email='" + email + "' and user_email='" + email + "'";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                int userId = rs.getInt("user_id");
                String useremail = rs.getString("email");
                String shoperName = rs.getString("shoper_name");
                String conNumber = rs.getString("contact_no");
                int proId = rs.getInt("pro_id");
                String proName = rs.getString("pro_name");
                double unitPrice = rs.getDouble("price");
                int qty = rs.getInt("qty");
                double total = rs.getDouble("total");
                Date trDate = rs.getDate("tr_date");
                CutomerReport ob = new CutomerReport(userId, useremail, shoperName, conNumber, proId, proName, unitPrice, qty, total, trDate);
                li.add(ob);
            }

        } catch (Exception e) {
        }

        return li;

    }
}
