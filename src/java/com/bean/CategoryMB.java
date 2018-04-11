/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import dao.AddDAO;
import dao.ListDAO;
import model.Category;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author PARVES
 */
@ManagedBean
@SessionScoped
public class CategoryMB {

    Category category = new Category();
    String message;

    int catId;

    List<Integer> list = new ArrayList<Integer>();
    List<Category> listCategory = new ArrayList<Category>();

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void distributeAllData() {

        List<Category> list = new ListDAO().findAllCategoryById(catId);
        this.category.setCatName(list.get(0).getCatName());
        this.category.setCatDesc(list.get(0).getCatDesc());
    }

    public void addCategory() {
        this.category.setCatName(category.getCatName());
        this.category.setCatDesc(category.getCatDesc());
        boolean bool = new AddDAO().addCategory(category);
        if (bool) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            this.message = "Successfully Saved";
        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
            this.message = "Oparation Failed";
        }

    }

    public void updateCategory() {
        this.category.setCatId(catId);
        this.category.setCatName(category.getCatName());
        this.category.setCatDesc(category.getCatDesc());
        boolean bool = new AddDAO().updateCategory(category);
        if (bool) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            this.message = "Successfully Updated";
        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
            this.message = "Oparation Failed";
        }

    }

    public void deleteCategory() {
        this.category.setCatId(catId);
        this.category.setCatName(category.getCatName());
        this.category.setCatDesc(category.getCatDesc());
        boolean bool = new AddDAO().deleteCategory(category);
        if (bool) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            this.message = "Successfully Deleted";
            this.category.setCatName(null);
            this.category.setCatDesc(null);
        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
            this.message = "Oparation Failed";
        }

    }

    public void createClear() {
        this.category.setCatName(null);
        this.category.setCatDesc(null);
        this.message = null;

    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public List<Category> li;

    public List<Integer> getList() {
        list.removeAll(list);
        ListDAO ob = new ListDAO();
        li = ob.findAllCategory();

        Iterator it = li.iterator();
        while (it.hasNext()) {
            Category cat = (Category) it.next();
            list.add(cat.getCatId());
        }

        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public List<Category> getListCategory() {
        listCategory.removeAll(listCategory);
        listCategory = new ListDAO().findAllCategory();
        return listCategory;
    }

    public void setListCategory(List<Category> listCategory) {
        this.listCategory = listCategory;
    }
    
    

}
