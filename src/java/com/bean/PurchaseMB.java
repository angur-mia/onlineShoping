/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import dao.AddDAO;
import dao.ListDAO;
import model.Product;
import model.Purchase;
import model.SubCategory;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
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
public class PurchaseMB {

    Purchase purchase = new Purchase();
    Product product = new Product();
    String subCatName;

    int newPurcase;

    int purchasIdDemo;

    int proIdDemo;

    List<Integer> proIdList = new ArrayList<Integer>();
    List<Purchase> purchaseList = new ArrayList<Purchase>();

    List<String> sizeList = new ArrayList<String>();

    List<Integer> purchasIdList = new ArrayList<Integer>();

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public String getSubCatName() {
        return subCatName;
    }

    public void setSubCatName(String subCatName) {
        this.subCatName = subCatName;
    }

    //To resolve sub_category id
    Integer demoSubCat;

    public void manageSubCatIdFromSubCatName() {

        demoSubCat = null;
        try {
            String sql = "SELECT  sub_cat_id FROM sub_category where sub_cat_name = '" + subCatName + "' ";
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
                demoSubCat = rs.getInt(1);
            }
        } catch (Exception e) {
            demoSubCat = null;
        }
    }

    public int getProIdDemo() {

        return proIdDemo;
    }

    public void setProIdDemo(int proIdDemo) {
        this.proIdDemo = proIdDemo;
    }

    public List<Integer> getProIdList() {
        return proIdList;
    }

    public void setProIdList(List<Integer> proIdList) {
        this.proIdList = proIdList;
    }

    List<Product> li;

    public void changeDropdownMenu1() {
        manageSubCatIdFromSubCatName();

        proIdList.removeAll(proIdList);
        li = new ListDAO().findProductBySubCatId(demoSubCat);

        Iterator it = li.iterator();
        while (it.hasNext()) {

            Product ob = (Product) it.next();
            this.proIdList.add(ob.getProId());

        }

    }

    public void distributeAllData() {

        List<Product> list = new ListDAO().findAllProductById(proIdDemo);
        this.product.setProId(list.get(0).getProId());
        this.product.setSubCatId(list.get(0).getSubCatId());
        this.product.setProName(list.get(0).getProName());
        this.product.setProQty(list.get(0).getProQty());
        this.product.setProPrice(list.get(0).getProPrice());
        this.product.setProUrl(list.get(0).getProUrl());
        this.product.setProDesc(list.get(0).getProDesc());

        this.newPurcase = 0;
        this.purchase.setTotal(null);

    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNewPurcase() {
        return newPurcase;
    }

    public void setNewPurcase(int newPurcase) {
        this.newPurcase = newPurcase;
    }

    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void doCalculate() {

        int result = newPurcase + product.getProQty();
        product.setProQty(result);

        double priceResult = newPurcase * result;
        purchase.setTotal(priceResult);

    }

    public void doInsert() {
        AddDAO ob = new AddDAO();
        int result = ob.updateProductQtyById(proIdDemo, product.getProQty());
        if (result > 0) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            purchase.setProId(product.getProId());
            purchase.setProName(product.getProName());
            purchase.setProSize(purchase.getProSize());
            purchase.setProPrice(product.getProPrice());
            purchase.setProQty(newPurcase);
            purchase.setPurDate(ourJavaDateObject);
            ob.addPurchase(purchase);

            this.setMsg("Succefully Inserted");

        } else {
            this.setMsg("Operation Failed");
        }

    }

    public List<Purchase> getPurchaseList() {
        purchaseList = new ListDAO().findAllPurchase();
        return purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }

    public List getSizeList() {
        sizeList.add("XL");
        sizeList.add("XXL");
        sizeList.add("M");
        return sizeList;
    }

    public void setSizeList(List sizeList) {
        this.sizeList = sizeList;
    }

    List<Purchase> listParchase;

    public List<Integer> getPurchasIdList() {
        purchasIdList.removeAll(purchasIdList);

        listParchase = new ListDAO().findAllPurchase();
        Iterator it = listParchase.iterator();
        while (it.hasNext()) {
            Purchase ob = (Purchase) it.next();
            this.purchasIdList.add(ob.getId());
        }

        return purchasIdList;
    }

    public void setPurchasIdList(List<Integer> purchasIdList) {
        this.purchasIdList = purchasIdList;
    }

    public int getPurchasIdDemo() {
        return purchasIdDemo;
    }

    public void setPurchasIdDemo(int purchasIdDemo) {
        this.purchasIdDemo = purchasIdDemo;
    }

    public void distributeAllPurchasInformation() {

        List<Purchase> list = new ListDAO().findPurchaseInfoById(purchasIdDemo);
        purchase.setId(list.get(0).getId());
        purchase.setProId(list.get(0).getProId());
        purchase.setProName(list.get(0).getProName());
        purchase.setProPrice(list.get(0).getProPrice());
        purchase.setProSize(list.get(0).getProSize());
        purchase.setProQty(list.get(0).getProQty());
        purchase.setTotal(list.get(0).getTotal());
        purchase.setPurDate(list.get(0).getPurDate());

        

    }

    public void doCalculate1() {

        double result = purchase.getProPrice() * purchase.getProQty();
        this.purchase.setTotal(result);

    }

    public void doUpdate() {

        AddDAO ob = new AddDAO();
        int result = ob.updateProductQtyById(purchase.getProId(), purchase.getProQty());

        if (result > 0) {

            java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            purchase.setProId(purchase.getId());
            purchase.setProId(purchase.getProId());
            purchase.setProName(purchase.getProName());
            purchase.setProSize(purchase.getProSize());
            purchase.setProPrice(purchase.getProPrice());
            purchase.setProQty(purchase.getProQty());
            purchase.setTotal(purchase.getTotal());
            purchase.setPurDate(ourJavaDateObject);
            ob.updatePurchase(purchase);

            this.setMsg("Succefully Updated");

        } else {
            this.setMsg("Operation Failed");
        }

    }

    public void doDelete() {

        AddDAO ob = new AddDAO();

        java.sql.Date ourJavaDateObject = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        purchase.setProId(purchase.getId());
        purchase.setProId(purchase.getProId());
        purchase.setProName(purchase.getProName());
        purchase.setProSize(product.getProSize());
        purchase.setProPrice(purchase.getProPrice());
        purchase.setProQty(purchase.getProQty());
        purchase.setTotal(purchase.getTotal());
        purchase.setPurDate(ourJavaDateObject);
        boolean bool = ob.deletePurchase(purchase);
        if (bool == true) {
            this.setMsg("Succefully Deleted");
        } else {
            this.setMsg("Operation Failed");
        }

    }

}
