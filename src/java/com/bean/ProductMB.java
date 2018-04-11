/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import dao.AddDAO;
import dao.ListDAO;
import model.Product;
import model.SubCategory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.ServletContext;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author PARVES
 */
@ManagedBean
@SessionScoped
public class ProductMB {

    Product product = new Product();
    SubCategory subCategory = new SubCategory();
    String subCantName;
    List catList = new ArrayList();
    List<SubCategory> subCat;

    List listDrop = new ArrayList();
    
    List<Product> productList = new ArrayList<Product>();
    
    List<Integer> listProId = new ArrayList<Integer>();

    String catName;

    UploadedFile file;
    String imageUrl;
    String path;

    String message;
    
    int proId;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getSubCantName() {
        return subCantName;
    }

    public void setSubCantName(String subCantName) {
        this.subCantName = subCantName;
    }

    List<SubCategory> li;

    public List<SubCategory> getSubCat() {
        return subCat;
    }

    public void setSubCat(List<SubCategory> subCat) {
        this.subCat = subCat;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }
    //To resolve sub_category id
    Integer demoSubCat;
    public void manageSubCatIdFromSubCatName(){
        
        demoSubCat = null;
        try {
            String sql = "SELECT  sub_cat_id FROM sub_category where sub_cat_name = '"+subCantName+"'  and cat_id = (select cat_id from category where cat_name ='"+catName+"' ) ";
            Statement pstmt = new com.connection.CreConnection().doConnect().createStatement();
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()) {
               demoSubCat = rs.getInt(1);
            }
        } catch (Exception e) {
            demoSubCat = null;
        }
        
    
    }

    public void addNewProduct() {
        
        manageSubCatIdFromSubCatName();
        
        subCat = new ListDAO().subCatListByName(subCantName);
//        product.setSubCatId(subCat.get(0).getSubCatId());//Being Problem
        product.setSubCatId(demoSubCat);
        product.setProName(product.getProName());
        product.setProQty(product.getProQty());
        product.setProPrice(product.getProPrice());
        product.setProUrl(imageUrl);
        product.setProDesc(product.getProDesc());

        boolean bool = new AddDAO().addProduct(product);

        if (bool) {
            this.message = "Successfully Saved";
            
        } else {
            this.message = "Oparation Failed";
        }

    }

    public void clearField() {

        product.setProName(null);
        product.setProQty(0);
        product.setProPrice(0.0);
        product.setProUrl(null);
        product.setProDesc(null);

        this.message = null;

    }

    public void doUpload() throws IOException {

        String fname = file.getFileName();

//        fname = product.getProName();
        ServletContext context = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
        path = context.getRealPath("/");
        path = path.substring(0, path.indexOf("\\build"));
        path = path + "\\web\\resources\\";

        imageUrl = "resources/" + fname;

        String fileName = FilenameUtils.getName(file.getFileName());
//        fileName = fname + ".jpg";
        fileName = fname;
        InputStream input = file.getInputstream();
        OutputStream output = new FileOutputStream(new File(path, fileName));

        if (file != null) {
            FacesMessage msg = new FacesMessage("Successfull", fileName + " is uploaded");
            FacesContext.getCurrentInstance().addMessage(null, msg);
            try {
                org.apache.commons.io.IOUtils.copy(input, output);
            } finally {
                org.apache.commons.io.IOUtils.closeQuietly(input);
                org.apache.commons.io.IOUtils.closeQuietly(output);
            }

        }

    }

    public List getCatList() {
        catList.removeAll(catList);

        li = new ListDAO().findAllSubCategory();
        Iterator it = li.iterator();
        while (it.hasNext()) {
            SubCategory ob = (SubCategory) it.next();
            catList.add(ob.getSubCatName());
        }

        return catList;
    }

    public void setCatList(List catList) {
        this.catList = catList;
    }

//    Alternative image copy in primefaces from Bari
//    public void uploadBari() {
//        if (file != null) {
//            try {
//                ServletContext context = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
//                String dbpath = context.getRealPath("/");
//                String webcut = dbpath.substring(0, dbpath.lastIndexOf("\\"));
//                String buildcut = webcut.substring(0, webcut.lastIndexOf("\\"));
//                String mainUrlPath = buildcut.substring(0, buildcut.lastIndexOf("\\"));
//
//                InputStream inputStream = file.getInputstream();
//                String tpath = mainUrlPath + "\\resources\\" + file.getFileName();
//                File destFile = new File(tpath);
//
//                if (!destFile.exists()) {
//                    FileUtils.copyInputStreamToFile(inputStream, destFile);
//                }
//                product.setProUrl(file.getFileName().toString());
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        }
//    }
//
//    public void addNewProduct() {
//        uploadBari();
//        subCat = new ListDAO().subCatListByName(subCantName);
//        product.setSubCatId(subCat.get(0).getSubCatId());
//        product.setProName(product.getProName());
//        product.setProQty(product.getProQty());
//        product.setProPrice(product.getProPrice());
//        product.setProUrl(imageUrl);
//        product.setProDesc(product.getProDesc());
//
//        boolean bool = new AddDAO().addProduct(product);
//
//        if (bool) {
//            this.message = "Successfully Saved";
//        } else {
//            this.message = "Oparation Failed";
//        }
//
//    }
    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public List<SelectItem> getSubCategoryName() {
        List<SelectItem> subcatname = new ListDAO().subCatList(catName);
        return subcatname;
    }

    public List getListDrop() {
        return listDrop;
    }

    public void setListDrop(List listDrop) {
        this.listDrop = listDrop;
    }

    public void changeDropdownMenu() {
        listDrop.removeAll(listDrop);
//        this.listDrop = new ListDAO().subCatListByCategory(catName);
        li = new ListDAO().subCatListByCategory(catName);
        Iterator it = li.iterator();
        while (it.hasNext()) {
            SubCategory ob = (SubCategory) it.next();
            this.listDrop.add(ob.getSubCatName());
        }

    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public List<Product> getProductList() {
        productList = new ListDAO().allProductList();
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    List<Product> pidList;
    public List<Integer> getListProId() {
        listProId.removeAll(listProId);
        
        pidList = new ListDAO().allProductList();
        Iterator it = pidList.iterator();
        while (it.hasNext()) {            
            Product ob = (Product) it.next();
            listProId.add(ob.getProId());
        }
        
        return listProId;
    }

    public void setListProId(List<Integer> listProId) {
        this.listProId = listProId;
    }
    
    
    public void distributeAllData() {

        List<Product> list = new ListDAO().findAllProductById(proId);
        this.product.setProId(list.get(0).getProId());
        this.product.setSubCatId(list.get(0).getSubCatId());
        this.product.setProName(list.get(0).getProName());
        this.product.setProQty(list.get(0).getProQty());
        this.product.setProPrice(list.get(0).getProPrice());
        this.product.setProUrl(list.get(0).getProUrl());
        this.product.setProDesc(list.get(0).getProDesc());

    }
    
    
    public void updateProduct() {

        this.product.setProId(proId);
        this.product.setSubCatId(product.getSubCatId());
        this.product.setProName(product.getProName());
        this.product.setProQty(product.getProQty());
        this.product.setProPrice(product.getProPrice());
        this.product.setProUrl(imageUrl);
        this.product.setProDesc(product.getProDesc());
        
        boolean bool = new AddDAO().updateProduct(product);
        if (bool == true) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            this.message = "Successfully Updated";
        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
            this.message = "Oparation Failed";
        }

    }
    
    public void deleteProduct() {

        this.product.setProId(proId);
        this.product.setSubCatId(product.getSubCatId());
        this.product.setProName(product.getProName());
        this.product.setProQty(product.getProQty());
        this.product.setProPrice(product.getProPrice());
        this.product.setProUrl(product.getProUrl());
        this.product.setProDesc(product.getProDesc());
        
        boolean bool = new AddDAO().deleteProduct(product);
        if (bool == true) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Data Saved", ""));
            this.message = "Successfully Deleted";
        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Data not Saved", ""));
            this.message = "Oparation Failed";
        }

    }

    public void createClear() {
        this.product.setProId(null);
        this.product.setSubCatId(null);
        this.product.setProName(null);
        this.product.setProQty(null);
        this.product.setProPrice(null);
        this.product.setProUrl(null);
        this.product.setProDesc(null);

        
        this.message = null;

    }
    
    
    
    

}
