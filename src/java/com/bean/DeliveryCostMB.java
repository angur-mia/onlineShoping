/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import dao.AddDAO;
import dao.ListDAO;
import model.DelivaryCost;
import model.UserRole;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author PARVES
 */
@ManagedBean
@SessionScoped
public class DeliveryCostMB {

    DelivaryCost delivaryCost = new DelivaryCost();
    
    String message;
    
    List<DelivaryCost> listZone = new ArrayList<DelivaryCost>();
     List<String> list = new ArrayList<String>();
     
     String zoneName;

    public DelivaryCost getDelivaryCost() {
        return delivaryCost;
    }

    public void setDelivaryCost(DelivaryCost delivaryCost) {
        this.delivaryCost = delivaryCost;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void addNewZone() {
        this.delivaryCost.setDelivaryId(delivaryCost.getDelivaryId());
        this.delivaryCost.setZoneName(delivaryCost.getZoneName());
        this.delivaryCost.setDelivaryCost(delivaryCost.getDelivaryCost());
        boolean bool = new AddDAO().addNewZone(delivaryCost);
        
        if(bool== true){
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            this.message = "Successfully Saved";
        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
            this.message = "Oparation Failed";
        }

    }
    
    public void createClear() {
        this.delivaryCost.setDelivaryId(0);
        this.delivaryCost.setZoneName(null);
        this.delivaryCost.setDelivaryCost(null);
        this.message = null;

    }
    
    public void updateUserRole() {
        this.delivaryCost.setDelivaryId(delivaryCost.getDelivaryId());
        this.delivaryCost.setZoneName(delivaryCost.getZoneName());
        this.delivaryCost.setDelivaryCost(delivaryCost.getDelivaryCost());
        boolean bool = new AddDAO().updateDelivaryZone(delivaryCost);
        if (bool== true) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            this.message = "Successfully Updated";
        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
            this.message = "Oparation Failed";
        }

    }
    
    public void deleteZoneName() {
       this.delivaryCost.setDelivaryId(delivaryCost.getDelivaryId());
        this.delivaryCost.setZoneName(delivaryCost.getZoneName());
        this.delivaryCost.setDelivaryCost(delivaryCost.getDelivaryCost());
        boolean bool = new AddDAO().deleteZone(delivaryCost);
         if (bool) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            this.message = "Successfully Deleted";
            this.delivaryCost.setDelivaryId(0);
            this.delivaryCost.setZoneName(null);
            this.delivaryCost.setDelivaryCost(null);
        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
            this.message = "Oparation Failed";
        }

    }

    public List<DelivaryCost> getListZone() {
        
        listZone.removeAll(listZone);
        listZone = new ListDAO().findAllZone();
        return listZone;
    }

    public void setListZone(List<DelivaryCost> listZone) {
        this.listZone = listZone;
    }

    List<DelivaryCost> li;
    public List<String> getList() {
        list.removeAll(list);
        
        ListDAO ob = new ListDAO();
        li = ob.findAllZone();

        Iterator it = li.iterator();
        while (it.hasNext()) {
            DelivaryCost delivaryCost = (DelivaryCost) it.next();
            list.add(delivaryCost.getZoneName());
        }
        
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
    
    
    public void distributeAllData() {

        List<DelivaryCost> list = new ListDAO().findAllZoneByZoneName(zoneName);
        this.delivaryCost.setDelivaryId(list.get(0).getDelivaryId());
        this.delivaryCost.setZoneName(list.get(0).getZoneName());
        this.delivaryCost.setDelivaryCost(list.get(0).getDelivaryCost());
        
    } 

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }
    
    
    
}

    
    
    
    
    

