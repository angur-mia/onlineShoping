/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import dao.AddDAO;
import dao.ListDAO;
import model.Category;
import model.SubCategory;
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
public class SubCategoryMB {

    SubCategory subCategory = new SubCategory();
    String catName;

    int catId;

    String message;
    List<Category> listCat;

    List catList = new ArrayList();

    List<SubCategory> listCategory = new ArrayList<SubCategory>();
    List<SubCategory> listSubCat = new ArrayList<SubCategory>();

    int subCatId;

    List<Integer> list1 = new ArrayList<Integer>();
    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    List<Category> li;

    public List getCatList() {
        catList.removeAll(catList);
        li = new ListDAO().findAllCategory();
        Iterator it = li.iterator();
        while (it.hasNext()) {
            Category ob = ob = (Category) it.next();
            catList.add(ob.getCatName());
        }
        return catList;
    }

    public void setCatList(List catList) {
        this.catList = catList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Category> getListCat() {
        return listCat;
    }

    public void setListCat(List<Category> listCat) {
        this.listCat = listCat;
    }

    public void addSubCategory() {

        listCat = new ListDAO().catListByName(catName);
        subCategory.setCatId(listCat.get(0).getCatId());
        subCategory.setSubCatName(subCategory.getSubCatName());
        subCategory.setSubCatDesc(subCategory.getSubCatDesc());

        boolean bool = new AddDAO().addSubCategory(subCategory);
        if (bool) {
            this.message = "Successfully Saved";
        } else {
            this.message = "Oparation Failed";
        }

    }

    public void clearField() {

        subCategory.setSubCatName(null);
        subCategory.setSubCatDesc(null);
        this.message = null;

    }

    public List<SubCategory> getListCategory() {
        listCategory.removeAll(listCategory);
        listCategory = new ListDAO().findAllSubCategory();
        return listCategory;
    }

    public void setListCategory(List<SubCategory> listCategory) {
        this.listCategory = listCategory;
    }

    public int getSubCatId() {
        return subCatId;
    }

    public void setSubCatId(int subCatId) {
        this.subCatId = subCatId;
    }

    public void distributeAllData() {

        List<SubCategory> list = new ListDAO().findAllSubCategoryById(subCatId);
        this.subCategory.setSubCatId(list.get(0).getSubCatId());
        this.subCategory.setCatId(list.get(0).getCatId());
        this.subCategory.setSubCatName(list.get(0).getSubCatName());
        this.subCategory.setSubCatDesc(list.get(0).getSubCatDesc());

    }
    
    public void distributeAllData1() {

        List<SubCategory> list = new ListDAO().findAllSubCategoryById(subCategory.getSubCatId());
        this.subCategory.setSubCatId(list.get(0).getSubCatId());
        this.subCategory.setCatId(list.get(0).getCatId());
        this.subCategory.setSubCatName(list.get(0).getSubCatName());
        this.subCategory.setSubCatDesc(list.get(0).getSubCatDesc());

    }

    public void updateSubCategory() {

        this.subCategory.setSubCatId(subCategory.getSubCatId());
        this.subCategory.setCatId(catId);
        this.subCategory.setSubCatName(subCategory.getSubCatName());
        this.subCategory.setSubCatDesc(subCategory.getSubCatDesc());
        boolean bool = new AddDAO().updateSubCategory(subCategory);
        if (bool == true) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            this.message = "Successfully Updated";
        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
            this.message = "Oparation Failed";
        }

    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }
    
//    private List<Trainee> li;
//    public List<Integer> getListId() {
//        listId.removeAll(listId);
//        
//        TraineeDAO ob = new TraineeDAO();
//        li = ob.findAllData();
//        
//         Iterator it = li.iterator();
//        while (it.hasNext()) {
//
//            Trainee tr = (Trainee) it.next();
//            listId.add(tr.getId());
//
//        }
//        
//        return listId;
//    }

    public List<SubCategory> sc;

    public List<Integer> getList1() {
        list1.removeAll(list1);
        
        ListDAO ob = new ListDAO();
        sc = ob.findAllSubCategoryJdb();

        Iterator it = sc.iterator();
        if (it.hasNext()) {
            SubCategory sCat = (SubCategory) it.next();
            list1.add(sCat.getSubCatId());
           
        }
        
        return list1;
    }

    public void setList1(List<Integer> list) {
        this.list1 = list;
    }

    public List<SubCategory> getListSubCat() {
        listSubCat.removeAll(listSubCat);
        listSubCat = new ListDAO().findAllSubCategoryJdb();
        return listSubCat;
    }

    public void setListSubCat(List<SubCategory> listSubCat) {
        this.listSubCat = listSubCat;
    }

    public void deleteSubCategory() {
        this.subCategory.setSubCatId(subCategory.getSubCatId());
        this.subCategory.setCatId(catId);
        this.subCategory.setSubCatName(subCategory.getSubCatName());
        this.subCategory.setSubCatDesc(subCategory.getSubCatDesc());
        boolean bool = new AddDAO().deleteSubCategory(subCategory);
        if (bool == true) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            this.message = "Successfully Deleted";
        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
            this.message = "Oparation Failed";
        }

    }
    
    public void createClear() {
        this.subCategory.setSubCatId(null);
        this.subCategory.setCatId(null);
        this.subCategory.setSubCatName(null);
        this.subCategory.setSubCatDesc(null);
        
        this.message = null;

    }
    
   

    
}
