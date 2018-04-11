/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.*;
import controller.AdminCotroller;
import model.Admin;
import model.Category;
import model.Product;
import model.SubCategory;
import model.Choose;
import model.DelivaryAddress;
import model.DelivaryCost;
import model.Purchase;
import model.ShopUser;
import model.UserRole;
import model.Wishlist;
import com.util.NewHibernateUtil;
import java.awt.Choice;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author PARVES
 */
public class AddDAO {

    public boolean addCategory(Category category) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.save(category);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean updateCategory(Category category) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.update(category);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean deleteCategory(Category category) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.delete(category);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean addSubCategory(SubCategory subCategory) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.save(subCategory);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean updateSubCategory(SubCategory subCategory) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.update(subCategory);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean deleteSubCategory(SubCategory subCategory) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.delete(subCategory);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean addProduct(Product product) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.save(product);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }
    
    public boolean addPurchase(Purchase purchase){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.save(purchase);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }
    
    public boolean updatePurchase(Purchase purchase){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.update(purchase);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }
    
    public boolean deletePurchase(Purchase purchase){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.delete(purchase);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean checkAdmin(String us, String pa) {

        try {
            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(""
                    + "SELECT id, pass from admin where id=? and pass=?");
            pstmt.setString(1, us);
            pstmt.setString(2, pa);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public boolean addChooice(Choose choose) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.save(choose);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean deleteChooice(Choose choose) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.delete(choose);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public int updateChooice(Integer id, Integer quantity, Double total) {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "UPDATE Choose set quantity = :quantity,  "
                + " total=:total  WHERE id = :id";
        Query query = session.createQuery(hql);
        query.setParameter("quantity", quantity);
        query.setParameter("total", total);
        query.setParameter("id", id);
        int result = query.executeUpdate();

        return result;

    }

    public boolean updateChooice12(Choose choose) {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        try {
            session.update(choose);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean addRole(UserRole role) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.save(role);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean updateUserRole(UserRole userRole) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.update(userRole);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean deleteUserRole(UserRole role) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.delete(role);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean addNewZone(DelivaryCost zoneCost) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.save(zoneCost);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean updateDelivaryZone(DelivaryCost delivaryCost) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.update(delivaryCost);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean deleteZone(DelivaryCost delivaryCost) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.delete(delivaryCost);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean saveUser(ShopUser shopUser) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.save(shopUser);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean updateProduct(Product product) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.update(product);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean deleteProduct(Product product) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.delete(product);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }

    public boolean checkUserAccount(String us, String pa) {

        try {
            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(""
                    + "SELECT email, password from shop_user where email=? and password=?");
            pstmt.setString(1, us);
            pstmt.setString(2, pa);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            return false;
        }
        return false;
    }
    
    
    public boolean saveDelivaryDetails(DelivaryAddress delivaryAddress) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.save(delivaryAddress);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }
    
    public boolean saveNewWishlist(Wishlist wishlist) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.save(wishlist);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }
    
    public boolean deleteWishlist(Wishlist wishlist) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.delete(wishlist);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }

    }
    
    
     public int  updateProductQtyById(int proId, int newQty) {
         int result = 0;
        try {
            PreparedStatement pstmt = new com.connection.CreConnection().doConnect().prepareStatement(""
                    + "UPDATE product SET pro_qty=?  WHERE pro_id ='"+proId+"'");
            pstmt.setInt(1, newQty);
            
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            return result;
        }
        return result;
    }
    

}
