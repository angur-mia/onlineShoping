/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import dao.AddDAO;
import dao.ListDAO;
import model.Category;
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
public class UserRoleMB {

    UserRole role = new UserRole();

    String message;

    List<String> list = new ArrayList<String>();
    
    List<UserRole> listRole = new ArrayList<UserRole>();

    String roleName;

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addUserRole() {
        this.role.setRoleName(role.getRoleName());
        boolean bool = new AddDAO().addRole(role);
        if (bool) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            this.message = "Successfully Saved";
        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
            this.message = "Oparation Failed";
        }

    }

    public void createClear() {
        this.role.setRoleName(null);
        this.message = null;

    }

    List<UserRole> li;

    public List<String> getList() {
        list.removeAll(list);

        ListDAO ob = new ListDAO();
        li = ob.findAllRole();

        Iterator it = li.iterator();
        while (it.hasNext()) {
            UserRole userRole = (UserRole) it.next();
            list.add(userRole.getRoleName());
        }

        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
   public void distributeAllData() {

        List<UserRole> list = new ListDAO().findAllRoleByRoleName(roleName);
        this.role.setRoleId(list.get(0).getRoleId());
        this.role.setRoleName(list.get(0).getRoleName());
        
    } 
   
   public void updateUserRole() {
        this.role.setRoleId(role.getRoleId());
        this.role.setRoleName(role.getRoleName());
        boolean bool = new AddDAO().updateUserRole(role);
        if (bool) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            this.message = "Successfully Updated";
        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
            this.message = "Oparation Failed";
        }

    }
   
   public void deleteUserRole() {
        this.role.setRoleId(role.getRoleId());
        this.role.setRoleName(role.getRoleName());
        boolean bool = new AddDAO().deleteUserRole(role);
        if (bool) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            this.message = "Successfully Deleted";
            this.role.setRoleId(0);
            this.role.setRoleName(null);
        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
            this.message = "Oparation Failed";
        }

    }

    public List<UserRole> getListRole() {
        listRole.removeAll(listRole);
        listRole = new ListDAO().findAllRole();
        
        return listRole;
    }

    public void setListRole(List<UserRole> listRole) {
        this.listRole = listRole;
    }
   
   

}
