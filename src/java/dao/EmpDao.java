/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.*;
import model.Sell;
import com.util.NewHibernateUtil;
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
public class EmpDao {
      public List<Map<String, ?>> findAllEmp(Date id) {
        List<Map<String, ?>> empList = new ArrayList<Map<String, ?>>();
        for (Sell empList1 : findEmpList(id)) {
            Map<String, Object> m = new HashMap<String, Object>();
            m.put("pname", empList1.getProName());
            m.put("pprice", empList1.getPurPrice());
            m.put("pqty", empList1.getSellQty());
            m.put("pd", empList1.getSellDate());
            empList.add(m);
        }

        return empList;

    }

    public List<Sell> findEmpList( Date d) {
        List<Sell> li = new ArrayList<Sell>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Query q = s.createQuery("From Sell where sellDate =:a");
        q.setParameter("a", d);
        li = q.list();
        return li;

    }
}
