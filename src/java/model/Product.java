package model;
// Generated Oct 30, 2016 9:18:27 AM by Hibernate Tools 4.3.1



/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private Integer proId;
     private Integer subCatId;
     private String proName;
     private Integer proQty;
     private Double proPrice;
     private String proUrl;
     private String proDesc;
     private String proSize;

    public Product() {
    }

	
    public Product(String proName) {
        this.proName = proName;
    }
    public Product(Integer subCatId, String proName, Integer proQty, Double proPrice, String proUrl, String proDesc, String proSize) {
       this.subCatId = subCatId;
       this.proName = proName;
       this.proQty = proQty;
       this.proPrice = proPrice;
       this.proUrl = proUrl;
       this.proDesc = proDesc;
       this.proSize = proSize;
    }
   
    public Integer getProId() {
        return this.proId;
    }
    
    public void setProId(Integer proId) {
        this.proId = proId;
    }
    public Integer getSubCatId() {
        return this.subCatId;
    }
    
    public void setSubCatId(Integer subCatId) {
        this.subCatId = subCatId;
    }
    public String getProName() {
        return this.proName;
    }
    
    public void setProName(String proName) {
        this.proName = proName;
    }
    public Integer getProQty() {
        return this.proQty;
    }
    
    public void setProQty(Integer proQty) {
        this.proQty = proQty;
    }
    public Double getProPrice() {
        return this.proPrice;
    }
    
    public void setProPrice(Double proPrice) {
        this.proPrice = proPrice;
    }
    public String getProUrl() {
        return this.proUrl;
    }
    
    public void setProUrl(String proUrl) {
        this.proUrl = proUrl;
    }
    public String getProDesc() {
        return this.proDesc;
    }
    
    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }
    public String getProSize() {
        return this.proSize;
    }
    
    public void setProSize(String proSize) {
        this.proSize = proSize;
    }




}


