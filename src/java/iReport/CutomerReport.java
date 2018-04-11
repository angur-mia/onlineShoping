/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iReport;

import java.util.Date;

/**
 *
 * @author User
 */
public class CutomerReport {

    int userId;
    String email;
    String shoperName;
    String conNumber;
    int proId;
    String proName;
    double unitPrice;
    int qty;
    double total;
    Date trDte;

    public CutomerReport() {
    }

    public CutomerReport(int userId, String email, String shoperName, String conNumber, int proId, String proName, double unitPrice, int qty, double total, Date trDte) {
        this.userId = userId;
        this.email = email;
        this.shoperName = shoperName;
        this.conNumber = conNumber;
        this.proId = proId;
        this.proName = proName;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.total = total;
        this.trDte = trDte;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShoperName() {
        return shoperName;
    }

    public void setShoperName(String shoperName) {
        this.shoperName = shoperName;
    }

    public String getConNumber() {
        return conNumber;
    }

    public void setConNumber(String conNumber) {
        this.conNumber = conNumber;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getTrDte() {
        return trDte;
    }

    public void setTrDte(Date trDte) {
        this.trDte = trDte;
    }

   

  
}
