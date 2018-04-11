/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.*;
import model.Category;
import model.Choose;
import model.DelivaryCost;
import model.Product;
import model.Purchase;
import model.ShopUser;
import model.SubCategory;
import model.UserRole;
import model.Wishlist;
import com.util.NewHibernateUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author PARVES
 */

public class ListDAO {

    public List<Category> findAllCategory() {
        List<Category> list = new ArrayList<Category>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        list = session.createCriteria(Category.class).list();
        return list;

    }
    
    public List<Purchase> findAllPurchase() {
        List<Purchase> list = new ArrayList<Purchase>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        list = session.createCriteria(Purchase.class).list();
        return list;

    }

    public List<Category> findAllCategoryById(Integer id) {
        List<Category> list = new ArrayList<Category>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("FROM Category where id=:id");
        q.setParameter("id", id);
        list = q.list();
        return list;

    }

    public List<SubCategory> findAllSubCategory() {
        List<SubCategory> list = new ArrayList<SubCategory>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        list = session.createCriteria(SubCategory.class).list();
        return list;
    }

    public List<SubCategory> findSubCategoryAll() {
        List<SubCategory> list = new ArrayList<SubCategory>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        list = s.createCriteria(SubCategory.class).list();
        return list;

    }

    public List<SubCategory> findAllSubCategoryById(Integer id) {
        List<SubCategory> list = new ArrayList<SubCategory>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("FROM SubCategory where subCatId=:id");
        q.setParameter("id", id);
        list = q.list();
        return list;

    }

    public List<Category> catListByName(String name) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        List<Category> cList = new ArrayList<Category>();
        Query q = session.createQuery("SELECT al FROM Category al where lower(catName)='" + name.toLowerCase() + "'");
        cList = q.list();
        cList.toString();
        session.close();
        return cList;
    }

    public List<SubCategory> subCatListByName(String name) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        List<SubCategory> cList = new ArrayList<SubCategory>();
        Query q = session.createQuery("SELECT al FROM SubCategory al where lower(subCatName)='" + name.toLowerCase() + "'");
        cList = q.list();
        cList.toString();
        session.close();
        return cList;
    }

    public List subCatList(String name) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        List<SubCategory> cList;
        Query q = session.createQuery("SELECT al.subCatName FROM SubCategory al where al.category.catId"
                + " IN(SELECT a.catId FROM Category a where lower(a.catName)='" + name.toLowerCase() + "')");
        cList = q.list();
        cList.toString();
        session.close();
        return cList;
    }

    public List allProductList() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        List<Product> cList;
        Query q = session.createQuery("SELECT al FROM Product al");
        cList = q.list();
        cList.toString();
        session.close();
        return cList;
    }

    public List subCatListByCategory(String name) {
//        Session session = NewHibernateUtil.getSessionFactory().openSession();
        List<SubCategory> cList = new ArrayList<SubCategory>();
        try {
            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(""
                    + "SELECT sub_cat_name FROM sub_category WHERE cat_id=(SELECT cat_id FROM category WHERE cat_name=?)");
            String demoName = name.toLowerCase();
            pstmt.setString(1, demoName);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                SubCategory ob = new SubCategory();
                ob.setSubCatName(rs.getString(1));
                cList.add(ob);
            }
        } catch (Exception e) {
        }
        return cList;
    }

    public List<Product> findAllProductData() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }

    public List<Product> findAllNike() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 1";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    
    public List<Product> findAllKidsProduct() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 21";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    
    

    public List<Product> findAllMensFandi() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 6";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    
    public List<Product> findAllUnderArmor() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 2";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }

    public List<Product> findAllAddidas() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 3";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    
   
    public List<Product> findAllManGuess() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 8";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    public List<Product> findAllManDior() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 10";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    
    public List<Product> findAllManVersace() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 11";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    
    public List<Product> findAllWomensFendi() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 7";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    
    public List<Product> findAllWomensGuess() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 17";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    
    public List<Product> findAllWomensValantion() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 18";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    
    public List<Product> findAllWomensDior() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 19";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    
    public List<Product> findAllManValentino() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 9";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    
    
    public List<Product> findAllFashionProduct() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 22";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
   
    public List<Product> findAllHouseholdProduct() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 23";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    
    public List<Product> findAllInteriorsProduct() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 24";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    
    public List<Product> findAllBagsProduct() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 26";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
   
    public List<Product> findAllShowsProduct() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 27";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
   
    
    public List<Product> findAllClothingProduct() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 25";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
   
    
    public List<Product> findAllWomenVersace() {
        List<Product> cList = new ArrayList<Product>();
        try {
            String sql = "SELECT * FROM product where sub_cat_id = 20";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                Product ob = new Product();
                ob.setProId(rs.getInt("pro_id"));
                ob.setSubCatId(rs.getInt("sub_cat_id"));
                ob.setProName(rs.getString("pro_name"));
                ob.setProQty(rs.getInt("pro_qty"));
                ob.setProPrice(rs.getDouble("pro_price"));
                ob.setProUrl(rs.getString("pro_url"));
                ob.setProDesc(rs.getString("pro_desc"));
                cList.add(ob);
            }

        } catch (Exception e) {
        }
        return cList;
    }
    
   

    public List<Choose> findAllChooseBySession(String id) {
        List<Choose> list = new ArrayList<Choose>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("FROM Choose where sesId=:id");
        q.setParameter("id", id);
        list = q.list();
        return list;

    }


    public double findTotalAmountBySession(String id) {
        double result = 0.0;
        try {
            String sql = "SELECT  SUM(total) FROM choose where ses_id like '" + id + "' Group By ses_id";
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                result = rs.getDouble(1);
            }

        } catch (Exception e) {
        }
        return result;

    }

    public List<UserRole> findAllRole() {
        List<UserRole> list = new ArrayList<UserRole>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        list = session.createCriteria(UserRole.class).list();
        return list;

    }

    public List<UserRole> findAllRoleByRoleName(String role) {
        List<UserRole> list = new ArrayList<UserRole>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("FROM UserRole where roleName=:role");
        q.setParameter("role", role);
        list = q.list();
        return list;

    }

    public List<DelivaryCost> findAllZone() {
        List<DelivaryCost> list = new ArrayList<DelivaryCost>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        list = session.createCriteria(DelivaryCost.class).list();
        return list;

    }

    public List<DelivaryCost> findAllZoneByZoneName(String zone) {
        List<DelivaryCost> list = new ArrayList<DelivaryCost>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("FROM DelivaryCost where zoneName=:zone");
        q.setParameter("zone", zone);
        list = q.list();
        return list;

    }

    public double findZoneDelivaryCost(String zone) {
        double result = 0.0;

        try {
            String sql = "SELECT  delivary_cost FROM delivary_cost where zone_name like '" + zone + "'";
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                result = rs.getDouble(1);
            }

        } catch (Exception e) {
        }

        return result;
    }

    public int getHowManyItemSelected(String user) {

        int result = 0;

        try {
            String sql = "SELECT COUNT(*) FROM choose WHERE ses_id like '" + user + "'";
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                result = rs.getInt(1);
            }

        } catch (Exception e) {
        }

        return result;
    }

    public List<Product> findAllProductByProId(Integer id) {
        List<Product> list = new ArrayList<Product>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("FROM Product where proId=:id");
        q.setParameter("id", id);
        list = q.list();
        return list;

    }

    public String findSubCatNameById(int subcatId) {
        String result = null;
        try {

            String sql = "SELECT sub_cat_name FROM sub_category WHERE sub_cat_id = '" + subcatId + "'";
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                result = rs.getString(1);
            }

        } catch (Exception e) {
        }
        return result;

    }

    public List<SubCategory> findAllSubCategoryJdb() {
        List<SubCategory> cList = new ArrayList<SubCategory>();
        try {
            String sql = "SELECT * FROM sub_category";
//            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(sql);
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                List<SubCategory> cList1 = new ArrayList<SubCategory>();
                SubCategory sc = new SubCategory();
//                Product ob = new Product();
                sc.setSubCatId(rs.getInt("sub_cat_id"));
                sc.setCatId(rs.getInt("cat_id"));
                sc.setSubCatName(rs.getString("sub_cat_name"));
                sc.setSubCatDesc(rs.getString("sub_cat_desc"));

                cList1.add(sc);
                cList = cList1;
            }

        } catch (Exception e) {
        }
        return cList;
    }

    public List<Product> findAllProduct() {
        List<Product> list = new ArrayList<Product>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        list = session.createCriteria(Product.class).list();
        return list;

    }
    
    
    public List<Product> findAllProductById(Integer id) {
        List<Product> list = new ArrayList<Product>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("FROM Product where proId=:id");
        q.setParameter("id", id);
        list = q.list();
        return list;

    }
    
    public List<Purchase> findPurchaseInfoById(Integer id) {
        List<Purchase> list = new ArrayList<Purchase>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("FROM Purchase where id=:id");
        q.setParameter("id", id);
        list = q.list();
        return list;

    }
    
    public List<ShopUser> findUserDataById(String email) {
        List<ShopUser> list = new ArrayList<ShopUser>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("FROM ShopUser where email=:email");
        q.setParameter("email", email);
        list = q.list();
        return list;

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
    
    public List<Product> findProductBySubCatId(Integer subCatId) {
        List<Product> list = new ArrayList<Product>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("FROM Product where subCatId=:subCatId");
        q.setParameter("subCatId", subCatId);
        list = q.list();
        return list;

    }
    
    public List<Purchase> findAllPurchaseData() {
        List<Purchase> list = new ArrayList<Purchase>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        list = session.createCriteria(Purchase.class).list();
        return list;

    }
    
    

}
